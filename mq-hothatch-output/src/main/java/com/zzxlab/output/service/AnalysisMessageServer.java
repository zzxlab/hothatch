package com.zzxlab.output.service;

import com.alibaba.fastjson.JSONObject;
import com.zzxlab.hothatch.commons.util.OkHttp3Util;
import com.zzxlab.hothatch.commons.util.ThreadPoolExecutorUtil;
import com.zzxlab.output.dao.TxInfoMapper;
import com.zzxlab.output.entity.TxInfo;
import com.zzxlab.output.example.TxInfoExample;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 处理消息解析
 */
@Service
public class AnalysisMessageServer {
    Logger logger = LoggerFactory.getLogger(AnalysisMessageServer.class);

    private TxInfoMapper txInfoMapper;

    @Autowired
    public AnalysisMessageServer(TxInfoMapper txInfoMapper) {
        this.txInfoMapper = txInfoMapper;
    }

    /**
     * 处理请求转发
     *
     * @param msg
     */
    public void analysis(String msg) {
        logger.info("接收到的消息{}", msg);
        if (StringUtils.isBlank(msg)) {
            return;
        }

        //解析消息内容
        JSONObject obj = JSONObject.parseObject(msg);
        String dest = obj.getString("dest");
        String mid = obj.getString("mid");

        //调用下游系统
        if (!doHttp(dest, msg)) {
            return;
        }

        //兼容老中台MQ消息处理
        ThreadPoolExecutorUtil.execute(() -> adapterOldMQ(mid));
    }

    /**
     * Http服务调用
     *
     * @param dest
     * @param msg
     * @return
     */
    private boolean doHttp(String dest, String msg) {
        try {
            OkHttp3Util.doHttp(dest, msg, 30);
        } catch (Exception e) {
            logger.error("处理请求转发analysis方法异常：{}", e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * 遵守三次原则Http服务调用
     *
     * @param dest 请求路径
     * @param msg  消息体
     */
    private boolean doHttpByThreePrinciples(String dest, String msg) {
        int num = 1;
        do {
            try {
                OkHttp3Util.doHttp(dest, msg, 30);
                break;
            } catch (Exception e) {
                logger.error("处理请求{}次,转发analysis方法异常：{}", num, e.getMessage());
                num++;
                if (num > 3) {
                    //消息补偿交由中台旧版MQ消费端处理
                    return false;
                }
            }
        } while (true);

        return true;
    }

    /**
     * 兼容老中台MQ消息处理
     */
    @Transactional(rollbackFor = Exception.class)
    public void adapterOldMQ(String mid) {
        TxInfo txInfo = new TxInfo();
        //发送到接出系统
        txInfo.setStatus(3);

        TxInfoExample example = new TxInfoExample();
        example.createCriteria().andMessageIdEqualTo(mid);

        txInfoMapper.updateByExampleSelective(txInfo, example);
    }
}

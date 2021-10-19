package com.hiersun.input.topic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.hiersun.hothatch.commons.MQConst;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Component
public class TopicSender {

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public TopicSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    //压测下单
    public void send(Integer i) {

//        String msg = "{\"callback\":\"http://192.168.4.224/api/v1/edi-top-server/edi/top/trade-callback/order-create\",\"data\":[{\"fromSystem\":\"THIRD\",\"outOrderNo\":\"2034286598721811223\",\"tid\":\"\",\"orderSource\":\"C2\",\"shopNo\":\"1174\",\"orderType\":\"PT\",\"paymentClass\":\"14\",\"omsStatus\":\"CREATED\",\"orderStatus\":\"9101\",\"deliveryMode\":\"SHIPPING\",\"deliveryModeName\":\"配送\",\"needInvoice\":\"0\",\"saleTime\":1629107713000,\"needSendCost\":0,\"sendCost\":0,\"salesAmount\":2899,\"saleSum\":1,\"sendAmount\":0,\"paymentAmount\":2899,\"cashAmount\":2629,\"accountBalanceAmount\":0,\"promotionAmount\":0,\"couponAmount\":270,\"integral\":\"0\",\"receptPhone\":\"18930389462\",\"receptName\":\"涂先涛\",\"receptCityNo\":\"422800\",\"receptCityName\":\"恩施土家族苗族自治州\",\"receptCityCode\":\"445800\",\"receptProvNo\":\"420000\",\"receptProvName\":\"湖北省\",\"receptDistrictNo\":\"422828\",\"receptDistrictName\":\"鹤峰县\",\"receptAddress\":\"走马镇湖北省恩施州鹤峰县走马镇\",\"extractFlag\":0,\"promFlag\":0,\"isCod\":0,\"payStatus\":\"5001\",\"orderStatusDesc\":\"待支付\",\"orderItemList\":[{\"rowNo\":1,\"shopNo\":\"1174\",\"deliverType\":\"ZF\",\"spuNo\":\"NXS00276\",\"salesPrice\":2899,\"saleSum\":1,\"paymentAmount\":2899,\"totalDiscount\":0,\"isGift\":\"0\",\"hasRecommanded\":\"1\",\"createdTime\":1629107713000,\"oid\":\"2034286598721811223\",\"tradeType\":\"DZ\",\"orderItemPaymentSplitList\":[{\"paymentClass\":\"10\",\"paymentType\":\"10503\",\"amount\":270,\"actualAmount\":270,\"acturalAmount\":270,\"rate\":1,\"account\":\"10001148\",\"couponType\":\"02\",\"couponBatch\":\"10001148\",\"couponName\":\"天猫优惠券\"}],\"skuPropertiesName\":\"主钻分数（最低）:4分;钻石净度:20分以下不分级;颜色:20分以下不分级;规格:18K金(预售）\",\"productChannleName\":\"【预售】I Do 四叶草系列 18K金钻石项链吊坠女锁骨链正品ido礼物\",\"buyerMessage\":\"o\"}],\"paymentItems\":[{\"paymentClass\":\"10\",\"paymentType\":\"10503\",\"amount\":270,\"actualAmount\":270,\"acturalAmount\":270,\"rate\":1,\"account\":\"10001148\",\"couponType\":\"02\",\"couponBatch\":\"10001148\",\"couponName\":\"天猫优惠券\"}],\"isActivit\":0,\"ooFlag\":\"1\",\"payOrderNo\":\"2021081622001146601408542975\"}],\"dest\":\"http://127.0.0.1:8700/order/createOutOrderMq\",\"exchange\":0,\"mid\":\"539727961960169472\",\"priority\":0,\"source\":\"P03\",\"target\":\"P03_06_15\",\"timestamp\":1629107713784,\"type\":0,\"version\":\"v1.1\"}";
        String msg = "{\"callback\":\"http://192.168.4.117:8090/edi/top/trade-callback/order-create\",\"data\":[{\"fromSystem\":\"THIRD\",\"outOrderNo\":\"111111111111\",\"tid\":\"\",\"orderSource\":\"C2\",\"shopNo\":\"1174\",\"orderType\":\"PT\",\"paymentClass\":\"14\",\"omsStatus\":\"CREATED\",\"orderStatus\":\"9101\",\"deliveryMode\":\"SHIPPING\",\"deliveryModeName\":\"配送\",\"needInvoice\":\"0\",\"saleTime\":1634550708000,\"needSendCost\":0,\"sendCost\":0,\"salesAmount\":1999,\"saleSum\":1,\"sendAmount\":0,\"paymentAmount\":1999,\"cashAmount\":999,\"accountBalanceAmount\":0,\"promotionAmount\":0,\"couponAmount\":1000,\"integral\":\"0\",\"receptPhone\":\"13709837095\",\"receptName\":\"黄宗泽女朋友\",\"receptCityNo\":\"210400\",\"receptCityName\":\"抚顺市\",\"receptCityCode\":\"000000\",\"receptProvNo\":\"210000\",\"receptProvName\":\"辽宁省\",\"receptDistrictNo\":\"210404\",\"receptDistrictName\":\"望花区\",\"receptAddress\":\"李石街道国际鑫城小区35号楼二单元\",\"extractFlag\":0,\"promFlag\":0,\"isCod\":0,\"payStatus\":\"5001\",\"orderStatusDesc\":\"待支付\",\"orderItemList\":[{\"rowNo\":1,\"shopNo\":\"\",\"deliverType\":\"ZF\",\"spuNo\":\"P00214\",\"skuNo\":\"200502670\",\"salesPrice\":1999,\"saleSum\":1,\"paymentAmount\":1999,\"totalDiscount\":0,\"isGift\":\"0\",\"hasRecommanded\":\"1\",\"createdTime\":1634550708000,\"oid\":\"2191584350450109056\",\"tradeType\":\"PT\",\"orderItemPaymentSplitList\":[{\"paymentClass\":\"10\",\"paymentType\":\"10503\",\"amount\":1000,\"actualAmount\":1000,\"acturalAmount\":1000,\"rate\":1,\"account\":\"10001148\",\"couponType\":\"02\",\"couponBatch\":\"10001148\",\"couponName\":\"天猫优惠券\"}],\"skuPropertiesName\":\"主钻分数（最低）:0分;钻石净度:20分以下不分级;颜色:20分以下不分级;规格:黑陶(皮绳)/50cm长款项链/赠手绳\",\"productChannleName\":\"【现货】I Do BOOM瓷系列 18K金真钻石项链女玫瑰金吊坠ido\"}],\"paymentItems\":[{\"paymentClass\":\"10\",\"paymentType\":\"10503\",\"amount\":1000,\"actualAmount\":1000,\"acturalAmount\":1000,\"rate\":1,\"account\":\"10001148\",\"couponType\":\"02\",\"couponBatch\":\"10001148\",\"couponName\":\"天猫优惠券\"}],\"isActivit\":0,\"ooFlag\":\"1\",\"payOrderNo\":\"2021101822001158651450153305\"}],\"dest\":\"http://192.168.4.117:8700/order/createOutOrderMq\",\"exchange\":0,\"mid\":\"562557542046208000\",\"priority\":0,\"source\":\"P03\",\"target\":\"P03_06_15\",\"timestamp\":1634550709721,\"type\":0,\"version\":\"v1.1\"}";
//        JSONObject jsonObject = JSONObject.parseObject(msg);
        MqMessage<OutOrderPara> param = JSONObject.parseObject(msg, new TypeReference<MqMessage<OutOrderPara>>() {});
        List<OutOrderPara> outOrderParas =  param.getData();
        for (OutOrderPara o : outOrderParas) {
            Long l = System.currentTimeMillis();
            l = l + i;
//            Integer r = Long.valueOf(System.currentTimeMillis()).intValue() + i;
            o.setOutOrderNo(String.valueOf(l));
            o.setSaleTime(new Date());
        }
        param.setData(outOrderParas);
        String result = JSON.toJSONString(param);
//        Map<String,Object> map1 = JSONObject.parseObject(res,Map.class);

        this.rabbitTemplate.convertAndSend(MQConst.QUEUE_EDI_ORDER_CREATE_OMS, result);




    }

}

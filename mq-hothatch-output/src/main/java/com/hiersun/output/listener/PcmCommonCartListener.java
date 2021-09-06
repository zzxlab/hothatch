package com.hiersun.output.listener;

import com.hiersun.hothatch.commons.MQConst;
import com.hiersun.output.service.AnalysisMessageServer;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = MQConst.QUEUE_PCM_COMMON_CART)
public class PcmCommonCartListener {

    private AnalysisMessageServer analysisMessageServer;

    @Autowired
    public PcmCommonCartListener(AnalysisMessageServer analysisMessageServer) {
        this.analysisMessageServer = analysisMessageServer;
    }

    @RabbitHandler
    public void process(String msg) {
        analysisMessageServer.analysis(msg);
    }
}

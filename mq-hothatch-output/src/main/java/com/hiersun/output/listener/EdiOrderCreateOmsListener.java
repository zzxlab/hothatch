package com.hiersun.output.listener;

import com.hiersun.hothatch.commons.MQConst;
import com.hiersun.output.service.AnalysisMessageServer;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = MQConst.QUEUE_EDI_ORDER_CREATE_OMS)
public class EdiOrderCreateOmsListener {

    private AnalysisMessageServer analysisMessageServer;

    @Autowired
    public EdiOrderCreateOmsListener(AnalysisMessageServer analysisMessageServer) {
        this.analysisMessageServer = analysisMessageServer;
    }

    @RabbitHandler
    public void process(String msg) {
        analysisMessageServer.analysis(msg);
    }
}

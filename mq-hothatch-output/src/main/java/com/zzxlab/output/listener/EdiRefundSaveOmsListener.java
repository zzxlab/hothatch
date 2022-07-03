package com.zzxlab.output.listener;

import com.zzxlab.hothatch.commons.MQConst;
import com.zzxlab.output.service.AnalysisMessageServer;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = MQConst.QUEUE_EDI_REFUND_SAVE_OMS)
public class EdiRefundSaveOmsListener {

    private AnalysisMessageServer analysisMessageServer;

    @Autowired
    public EdiRefundSaveOmsListener(AnalysisMessageServer analysisMessageServer) {
        this.analysisMessageServer = analysisMessageServer;
    }

    @RabbitHandler
    public void process(String msg) {
        analysisMessageServer.analysis(msg);
    }
}

package com.hiersun.output.listener;

import com.hiersun.hothatch.commons.MQConst;
import com.hiersun.output.service.AnalysisMessageServer;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = MQConst.QUEUE_EDI_ITEM_SYNC_REGISTER_PCM)
public class EdiItemSyncRegisterPcmListener {

    private AnalysisMessageServer analysisMessageServer;

    @Autowired
    public EdiItemSyncRegisterPcmListener(AnalysisMessageServer analysisMessageServer) {
        this.analysisMessageServer = analysisMessageServer;
    }

    @RabbitHandler
    public void process(String msg) {
        analysisMessageServer.analysis(msg);
    }
}

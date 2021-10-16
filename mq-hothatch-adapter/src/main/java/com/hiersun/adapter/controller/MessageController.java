package com.hiersun.adapter.controller;

import com.alibaba.fastjson.JSONObject;
import com.hiersun.adapter.service.AnalysisMessageServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    private AnalysisMessageServer analysisMessageServer;

    @Autowired
    public MessageController(AnalysisMessageServer analysisMessageServer) {
        this.analysisMessageServer = analysisMessageServer;
    }

    @PostMapping("/status/updateStatus")
    public String updateStatus(@RequestBody JSONObject data) {
        analysisMessageServer.adapterOldMQ(data.getString("messageId"));
        return "succeed";
    }
}
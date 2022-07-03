package com.zzxlab.input.controller;

import com.zzxlab.input.topic.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitTestController {
    private TopicSender topicSender;

    @Autowired
    public RabbitTestController(TopicSender topicSender) {
        this.topicSender = topicSender;
    }

    @GetMapping("/edi")
    public void edi(Integer num) {
        for (int i = 0; i < num; i++) {
            topicSender.send(i);
        }
    }
}

package com.hiersun.output.boot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置
 *
 * @author zhaoxq
 */
@Configuration
public class RabbitConfig {
    Logger logger = LoggerFactory.getLogger(RabbitConfig.class);

    private RabbitProperties rabbitProperties;

    @Autowired
    public RabbitConfig(RabbitProperties rabbitProperties) {
        this.rabbitProperties = rabbitProperties;
    }

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(rabbitProperties.getAddresses());
        connectionFactory.setPort(rabbitProperties.getPort());
        connectionFactory.setUsername(rabbitProperties.getUsername());
        connectionFactory.setPassword(rabbitProperties.getPassword());
        connectionFactory.setVirtualHost(rabbitProperties.getVirtualHost());
        connectionFactory.setPublisherConfirms(rabbitProperties.isPublisherConfirms());
        connectionFactory.setPublisherReturns(rabbitProperties.isPublisherReturns());

//        connectionFactory.addChannelListener(rabbitChannelListener);
//        connectionFactory.addConnectionListener(rabbitConnectionListener);
//        connectionFactory.setRecoveryListener(rabbitRecoveryListener);

        return connectionFactory;
    }

    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
        return new RabbitAdmin(connectionFactory);
    }


    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        rabbitTemplate.setMandatory(true);
        //发送方确认
        rabbitTemplate.setConfirmCallback(confirmCallback());
        //失败回调
        rabbitTemplate.setReturnCallback(returnCallback());
        return rabbitTemplate;
    }

    private RabbitTemplate.ConfirmCallback confirmCallback() {
        return (correlationData, ack, cause) -> {
            //处理失败的消息
            if (!ack) {
                logger.info("发送者发送给mq失败:{}", cause);
            }
        };
    }

    private RabbitTemplate.ReturnCallback returnCallback() {
        return (message, replyCode, replyText, exchange, routingKey) -> {
            logger.info("返回消息回调:{} 应答代码:{} 回复文本:{} 交换器:{} 路由键:{}", message, replyCode, replyText, exchange, routingKey);
        };
    }


}

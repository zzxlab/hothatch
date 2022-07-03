package com.zzxlab.input.boot.config;

import com.zzxlab.hothatch.commons.MQConst;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
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

    @Bean
    public Queue queueOmsCommonEdiMessage() {
        return new Queue(MQConst.QUEUE_OMS_COMMON_EDI);
    }

    @Bean
    public Queue queueEdiItemSyncRegisterPcmMessage() {
        return new Queue(MQConst.QUEUE_EDI_ITEM_SYNC_REGISTER_PCM);
    }

    @Bean
    public Queue queueEdiOrderCanceledOmsMessage() {
        return new Queue(MQConst.QUEUE_EDI_ORDER_CANCELED_OMS);
    }

    @Bean
    public Queue queueEdiRefundSaveOmsMessage() {
        return new Queue(MQConst.QUEUE_EDI_REFUND_SAVE_OMS);
    }

    @Bean
    public Queue queuePcmCommonCartMessage() {
        return new Queue(MQConst.QUEUE_PCM_COMMON_CART);
    }

    @Bean
    public Queue queuePcmCommonEdiMessage() {
        return new Queue(MQConst.QUEUE_PCM_COMMON_EDI);
    }

    @Bean
    public Queue queueEdiOrderCreateOmsMessage() {
        return new Queue(MQConst.QUEUE_EDI_ORDER_CREATE_OMS);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(MQConst.EXCHANGE_TOPIC);
    }


    @Bean
    public Binding bindingOmsCommonEdiExchangeMessage() {
        return BindingBuilder
                .bind(queueOmsCommonEdiMessage())
                .to(exchange())
                .with(MQConst.QUEUE_OMS_COMMON_EDI);
    }

    @Bean
    public Binding bindingEdiItemSyncRegisterPcmExchangeMessage() {
        return BindingBuilder
                .bind(queueEdiItemSyncRegisterPcmMessage())
                .to(exchange())
                .with(MQConst.QUEUE_EDI_ITEM_SYNC_REGISTER_PCM);
    }

    @Bean
    public Binding bindingEdiOrderCanceledOmsMessage() {
        return BindingBuilder
                .bind(queueEdiOrderCanceledOmsMessage())
                .to(exchange())
                .with(MQConst.QUEUE_EDI_ORDER_CANCELED_OMS);
    }

    @Bean
    public Binding bindingEdiRefundSaveOmsMessage() {
        return BindingBuilder
                .bind(queueEdiRefundSaveOmsMessage())
                .to(exchange())
                .with(MQConst.QUEUE_EDI_REFUND_SAVE_OMS);
    }

    @Bean
    public Binding bindingPcmCommonCartMessage() {
        return BindingBuilder
                .bind(queuePcmCommonCartMessage())
                .to(exchange())
                .with(MQConst.QUEUE_PCM_COMMON_CART);
    }

    @Bean
    public Binding bindingPcmCommonEdiMessage() {
        return BindingBuilder
                .bind(queuePcmCommonEdiMessage())
                .to(exchange())
                .with(MQConst.QUEUE_PCM_COMMON_EDI);
    }

    @Bean
    public Binding bindingEdiOrderCreateOmsMessage() {
        return BindingBuilder
                .bind(queueEdiOrderCreateOmsMessage())
                .to(exchange())
                .with(MQConst.QUEUE_EDI_ORDER_CREATE_OMS);
    }

    private RabbitTemplate.ConfirmCallback confirmCallback() {
        return (correlationData, ack, cause) -> {
            if (ack) {
                System.out.println("发送者确认发送给mq成功");
            } else {
                //处理失败的消息
                System.out.println("发送者发送给mq失败,考虑重发:" + cause);
            }
        };
    }

    private RabbitTemplate.ReturnCallback returnCallback() {
        return (message, replyCode, replyText, exchange, routingKey) -> {
            System.out.println("无法路由的消息，需要考虑另外处理。");
            System.out.println("Returned replyText：" + replyText);
            System.out.println("Returned exchange：" + exchange);
            System.out.println("Returned routingKey：" + routingKey);
            String msgJson = new String(message.getBody());
            System.out.println("Returned Message：" + msgJson);
        };
    }


}

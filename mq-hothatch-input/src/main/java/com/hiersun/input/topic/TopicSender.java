package com.hiersun.input.topic;

import com.hiersun.hothatch.commons.MQConst;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public TopicSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send() {

        String msg = "{\"callback\":\"http://192.168.4.224/api/v1/edi-top-server/edi/top/trade-callback/order-create\",\"data\":[{\"fromSystem\":\"THIRD\",\"outOrderNo\":\"2034286598721811223\",\"tid\":\"\",\"orderSource\":\"C2\",\"shopNo\":\"1174\",\"orderType\":\"PT\",\"paymentClass\":\"14\",\"omsStatus\":\"CREATED\",\"orderStatus\":\"9101\",\"deliveryMode\":\"SHIPPING\",\"deliveryModeName\":\"配送\",\"needInvoice\":\"0\",\"saleTime\":1629107713000,\"needSendCost\":0,\"sendCost\":0,\"salesAmount\":2899,\"saleSum\":1,\"sendAmount\":0,\"paymentAmount\":2899,\"cashAmount\":2629,\"accountBalanceAmount\":0,\"promotionAmount\":0,\"couponAmount\":270,\"integral\":\"0\",\"receptPhone\":\"18930389462\",\"receptName\":\"涂先涛\",\"receptCityNo\":\"422800\",\"receptCityName\":\"恩施土家族苗族自治州\",\"receptCityCode\":\"445800\",\"receptProvNo\":\"420000\",\"receptProvName\":\"湖北省\",\"receptDistrictNo\":\"422828\",\"receptDistrictName\":\"鹤峰县\",\"receptAddress\":\"走马镇湖北省恩施州鹤峰县走马镇\",\"extractFlag\":0,\"promFlag\":0,\"isCod\":0,\"payStatus\":\"5001\",\"orderStatusDesc\":\"待支付\",\"orderItemList\":[{\"rowNo\":1,\"shopNo\":\"1174\",\"deliverType\":\"ZF\",\"spuNo\":\"NXS00276\",\"salesPrice\":2899,\"saleSum\":1,\"paymentAmount\":2899,\"totalDiscount\":0,\"isGift\":\"0\",\"hasRecommanded\":\"1\",\"createdTime\":1629107713000,\"oid\":\"2034286598721811223\",\"tradeType\":\"DZ\",\"orderItemPaymentSplitList\":[{\"paymentClass\":\"10\",\"paymentType\":\"10503\",\"amount\":270,\"actualAmount\":270,\"acturalAmount\":270,\"rate\":1,\"account\":\"10001148\",\"couponType\":\"02\",\"couponBatch\":\"10001148\",\"couponName\":\"天猫优惠券\"}],\"skuPropertiesName\":\"主钻分数（最低）:4分;钻石净度:20分以下不分级;颜色:20分以下不分级;规格:18K金(预售）\",\"productChannleName\":\"【预售】I Do 四叶草系列 18K金钻石项链吊坠女锁骨链正品ido礼物\",\"buyerMessage\":\"o\"}],\"paymentItems\":[{\"paymentClass\":\"10\",\"paymentType\":\"10503\",\"amount\":270,\"actualAmount\":270,\"acturalAmount\":270,\"rate\":1,\"account\":\"10001148\",\"couponType\":\"02\",\"couponBatch\":\"10001148\",\"couponName\":\"天猫优惠券\"}],\"isActivit\":0,\"ooFlag\":\"1\",\"payOrderNo\":\"2021081622001146601408542975\"}],\"dest\":\"http://127.0.0.1:8700/order/createOutOrderMq\",\"exchange\":0,\"mid\":\"539727961960169472\",\"priority\":0,\"source\":\"P03\",\"target\":\"P03_06_15\",\"timestamp\":1629107713784,\"type\":0,\"version\":\"v1.1\"}";

        this.rabbitTemplate.convertAndSend(MQConst.EXCHANGE_TOPIC, MQConst.QUEUE_EDI_ORDER_CREATE_OMS, msg);
    }

}

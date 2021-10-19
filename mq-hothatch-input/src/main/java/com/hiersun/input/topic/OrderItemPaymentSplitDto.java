package com.hiersun.input.topic;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItemPaymentSplitDto implements Serializable {
    @ApiModelProperty(value = "订单明细号")
    private String orderItemNo;
    @ApiModelProperty(value = "一级支付介质")
    private String paymentClass;
    @ApiModelProperty(value = "商品分类")
    private String paymentType;
    @ApiModelProperty(value = "支付方式")
    private BigDecimal amount;
    @ApiModelProperty(value = "实际抵扣金额")
    private BigDecimal acturalAmount;
    @ApiModelProperty(value = "汇率（折现率)")
    private BigDecimal rate;
    @ApiModelProperty(value = "支付账号")
    private String account;
    @ApiModelProperty(value = "用户id")
    private String userId;
    @ApiModelProperty(value = "交易支付流水")
    private String payFlowNo;
    @ApiModelProperty(value = "优惠券类型")
    private String couponType;
    @ApiModelProperty(value = "优惠券批次")
    private String couponBatch;
    @ApiModelProperty(value = "券模板名称")
    private String couponName;
    @ApiModelProperty(value = "活动号")
    private String activityNo;
    @ApiModelProperty(value = "收券规则")
    private String couponRule;
    @ApiModelProperty(value = "收券规则描述")
    private String couponRuleName;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "结余")
    private BigDecimal cashBalance;
    @ApiModelProperty(value = "组合码分摊总金额")
    private BigDecimal alreadyAmount = BigDecimal.ZERO;
    @ApiModelProperty(value = "组合码分摊实际抵扣总金额")
    private BigDecimal alreadyActuralAmount = BigDecimal.ZERO;


    public String getOrderItemNo() {
        return orderItemNo;
    }

    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
    }

    public String getPaymentClass() {
        return paymentClass;
    }

    public void setPaymentClass(String paymentClass) {
        this.paymentClass = paymentClass;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getActuralAmount() {
        return acturalAmount;
    }

    public void setActuralAmount(BigDecimal acturalAmount) {
        this.acturalAmount = acturalAmount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPayFlowNo() {
        return payFlowNo;
    }

    public void setPayFlowNo(String payFlowNo) {
        this.payFlowNo = payFlowNo;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public String getCouponBatch() {
        return couponBatch;
    }

    public void setCouponBatch(String couponBatch) {
        this.couponBatch = couponBatch;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public String getCouponRule() {
        return couponRule;
    }

    public void setCouponRule(String couponRule) {
        this.couponRule = couponRule;
    }

    public String getCouponRuleName() {
        return couponRuleName;
    }

    public void setCouponRuleName(String couponRuleName) {
        this.couponRuleName = couponRuleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(BigDecimal cashBalance) {
        this.cashBalance = cashBalance;
    }

    public BigDecimal getAlreadyAmount() {
        return alreadyAmount;
    }

    public void setAlreadyAmount(BigDecimal alreadyAmount) {
        this.alreadyAmount = alreadyAmount;
    }

    public BigDecimal getAlreadyActuralAmount() {
        return alreadyActuralAmount;
    }

    public void setAlreadyActuralAmount(BigDecimal alreadyActuralAmount) {
        this.alreadyActuralAmount = alreadyActuralAmount;
    }
}
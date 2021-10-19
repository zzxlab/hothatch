package com.hiersun.input.topic;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * @Description: 线上支付介质——实体（保存）
 * @Auther: kongqf
 * @Date: 2018/9/5
 */
public class PaymentItemDto {
    private Long sid;
    @ApiModelProperty(value = "交易支付流水")
    private String posFlowNo;//交易支付流水
    @ApiModelProperty(value = "支付方式")
    private String paymentType;//支付方式
    @ApiModelProperty(value = "一级支付方式")
    private String paymentClass;//一级支付方式
    @ApiModelProperty(value = "支付金额")
    private BigDecimal amount;//支付金额
    @ApiModelProperty(value = "实际抵扣金额")
    private BigDecimal acturalAmount;//实际抵扣金额
    @ApiModelProperty(value = "汇率（折现率)")
    private BigDecimal rate;//汇率（折现率)
    @ApiModelProperty(value = "支付账号")
    private String account;//支付账号
    @ApiModelProperty(value = "会员id")
    private String userId;//会员id
    @ApiModelProperty(value = "支付流水号")
    private String payFlowNo;//支付流水号
    @ApiModelProperty(value = "优惠券类型")
    private String couponType;//优惠券类型
    @ApiModelProperty(value = "优惠券批次")
    private String couponBatch;//优惠券批次
    @ApiModelProperty(value = "券模板名称")
    private String couponName;//券模板名称
    @ApiModelProperty(value = "活动号")
    private String activityNo;//活动号
    @ApiModelProperty(value = "收券规则")
    private String couponRule;//收券规则
    @ApiModelProperty(value = "收券规则描述")
    private String couponRuleName;//收券规则描述
    @ApiModelProperty(value = "备注")
    private String remark;//备注
    @ApiModelProperty(value = "结余")
    private BigDecimal cashBalance;//结余
    @ApiModelProperty(value = "支付方式名称")
    private String name;//支付方式名称

    public String getPaymentClass() {
        return paymentClass;
    }

    public void setPaymentClass(String paymentClass) {
        this.paymentClass = paymentClass;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getPosFlowNo() {
        return posFlowNo;
    }

    public void setPosFlowNo(String posFlowNo) {
        this.posFlowNo = posFlowNo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PaymentItemDto [sid=" + sid + ", posFlowNo=" + posFlowNo + ", paymentType="
                + paymentType + ", amount=" + amount + ", acturalAmount=" + acturalAmount
                + ", rate=" + rate + ", account=" + account + ", userId=" + userId + ", payFlowNo="
                + payFlowNo + ", couponType=" + couponType + ", couponBatch=" + couponBatch
                + ", couponName=" + couponName + ", activityNo=" + activityNo + ", couponRule="
                + couponRule + ", couponRuleName=" + couponRuleName + ", remark=" + remark
                + ", cashBalance=" + cashBalance + "]";
    }

}

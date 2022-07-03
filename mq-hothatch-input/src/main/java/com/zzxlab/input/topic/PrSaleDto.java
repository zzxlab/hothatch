package com.zzxlab.input.topic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Auther: kongqf
 * @Date: 2018/9/5
 */
public class PrSaleDto implements Serializable {
    private Long sid;

    private String saleNo;

    private Integer isSynchronous;

    private String orderNo;

    private String outOrderNo; //外部订单号

    private String accountNo;

    private String memberNo;

    private Date saleTime;

    private Integer saleType;

    private Integer saleClass;

    private String saleSource;

    private String payStatus;

    private String payStatusDesc;

    private String saleStatus;

    private String saleStatusDesc;

    private BigDecimal saleAmount;

    private BigDecimal paymentAmount;

    private BigDecimal cashAmount;

    private BigDecimal discountAmount;

    private BigDecimal shippingFee;

    private BigDecimal cashIncome;

    private String isLock;

    private String needInvoice;

    private String invoiceTitle;

    private BigDecimal invoiceAmount;

    private String shopNo;

    private String storeName;

    private String supplyNo;

    private String suppllyName;

    private String shoppeNo;

    private String shoppeName;

    private Date createdTime;

    private String createdMode;

    private String originalSalesOrder;

    private String exchangeOrder;

    private String sendToPosErp;

    private String sendToStoreErp;

    private String cashIncomeFlag;

    private String hasInvoiced;

    private String salesPaymentNo;

    private String authorized;

    private String authorityCard;

    private String deliveryNo;

    private Integer offlineSaleBit;

    private String qrcode;

    private Date latestUpdateTime;

    private String latestUpdateMan;

    private Integer extractFlag;

    private String distributionStatus;

    private String employeeNo;

    private String casherNo;

    private String fromSystem;

    private BigDecimal bankServiceCharge;

    private String calcBillid;

    private String employeeName;//营业员姓名

    private String memberCardNo;//会员卡号

    private String memberShipCardNo;//会员卡卡面号

    private String memberCardType;//会员卡类型

    private String problemDesc;//问题描述

    private String saleTimeStr;
    private String latestUpdateTimeStr;

    private String receptPhone;

    private BigDecimal couponAmount;//使用优惠券金额

    private BigDecimal accountBalanceAmount;//使用余额金额

    private String receptName;//收件人姓名

    private String receptCityName;//收件人城市名称

    private String receptCityCode;//收件城市邮编

    private String receptProvName;//收件地区省份名称

    private String receptAddress;//收货地址

    private String integral; //积分

    private Integer isInvoice;

    private String invoiceVerificationCode;

    private List<PrSaveSaleItemDto> products;

    private List<PrSaveSalePaymentsDto> salePayments;

    private String arrtibute1;//销售单类型

    private String attribute4;//第三方定制单号

    private String attribute3;//是否合并子销售单

    private String attribute2;//关联的主单单号

    private String attribute6;//是否推送到tms

    private String attribute8;//导购信息

    private String attribute9;//供应商类型

    public String getSaleTimeStr() {
        return saleTimeStr;
    }

    public void setSaleTimeStr(String saleTimeStr) {
        this.saleTimeStr = saleTimeStr;
    }

    public String getLatestUpdateTimeStr() {
        return latestUpdateTimeStr;
    }

    public void setLatestUpdateTimeStr(String latestUpdateTimeStr) {
        this.latestUpdateTimeStr = latestUpdateTimeStr;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(String saleNo) {
        this.saleNo = saleNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleType() {
        return saleType;
    }

    public void setSaleType(Integer saleType) {
        this.saleType = saleType;
    }

    public Integer getSaleClass() {
        return saleClass;
    }

    public void setSaleClass(Integer saleClass) {
        this.saleClass = saleClass;
    }

    public String getSaleSource() {
        return saleSource;
    }

    public void setSaleSource(String saleSource) {
        this.saleSource = saleSource;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getSaleStatusDesc() {
        return saleStatusDesc;
    }

    public void setSaleStatusDesc(String saleStatusDesc) {
        this.saleStatusDesc = saleStatusDesc;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getCashIncome() {
        return cashIncome;
    }

    public void setCashIncome(BigDecimal cashIncome) {
        this.cashIncome = cashIncome;
    }

    public String getIsLock() {
        return isLock;
    }

    public void setIsLock(String isLock) {
        this.isLock = isLock;
    }

    public String getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(String needInvoice) {
        this.needInvoice = needInvoice;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSupplyNo() {
        return supplyNo;
    }

    public void setSupplyNo(String supplyNo) {
        this.supplyNo = supplyNo;
    }

    public String getSuppllyName() {
        return suppllyName;
    }

    public void setSuppllyName(String suppllyName) {
        this.suppllyName = suppllyName;
    }

    public String getShoppeNo() {
        return shoppeNo;
    }

    public void setShoppeNo(String shoppeNo) {
        this.shoppeNo = shoppeNo;
    }

    public String getShoppeName() {
        return shoppeName;
    }

    public void setShoppeName(String shoppeName) {
        this.shoppeName = shoppeName;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedMode() {
        return createdMode;
    }

    public void setCreatedMode(String createdMode) {
        this.createdMode = createdMode;
    }

    public String getOriginalSalesOrder() {
        return originalSalesOrder;
    }

    public void setOriginalSalesOrder(String originalSalesOrder) {
        this.originalSalesOrder = originalSalesOrder;
    }

    public String getExchangeOrder() {
        return exchangeOrder;
    }

    public void setExchangeOrder(String exchangeOrder) {
        this.exchangeOrder = exchangeOrder;
    }

    public String getSendToPosErp() {
        return sendToPosErp;
    }

    public void setSendToPosErp(String sendToPosErp) {
        this.sendToPosErp = sendToPosErp;
    }

    public String getSendToStoreErp() {
        return sendToStoreErp;
    }

    public void setSendToStoreErp(String sendToStoreErp) {
        this.sendToStoreErp = sendToStoreErp;
    }

    public String getCashIncomeFlag() {
        return cashIncomeFlag;
    }

    public void setCashIncomeFlag(String cashIncomeFlag) {
        this.cashIncomeFlag = cashIncomeFlag;
    }

    public String getHasInvoiced() {
        return hasInvoiced;
    }

    public void setHasInvoiced(String hasInvoiced) {
        this.hasInvoiced = hasInvoiced;
    }

    public String getSalesPaymentNo() {
        return salesPaymentNo;
    }

    public void setSalesPaymentNo(String salesPaymentNo) {
        this.salesPaymentNo = salesPaymentNo;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public String getAuthorityCard() {
        return authorityCard;
    }

    public void setAuthorityCard(String authorityCard) {
        this.authorityCard = authorityCard;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public void setDeliveryNo(String deliveryNo) {
        this.deliveryNo = deliveryNo;
    }

    public Integer getOfflineSaleBit() {
        return offlineSaleBit;
    }

    public void setOfflineSaleBit(Integer offlineSaleBit) {
        this.offlineSaleBit = offlineSaleBit;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Date getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(Date latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }

    public String getLatestUpdateMan() {
        return latestUpdateMan;
    }

    public void setLatestUpdateMan(String latestUpdateMan) {
        this.latestUpdateMan = latestUpdateMan;
    }

    public Integer getExtractFlag() {
        return extractFlag;
    }

    public void setExtractFlag(Integer extractFlag) {
        this.extractFlag = extractFlag;
    }

    public String getDistributionStatus() {
        return distributionStatus;
    }

    public void setDistributionStatus(String distributionStatus) {
        this.distributionStatus = distributionStatus;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getCasherNo() {
        return casherNo;
    }

    public void setCasherNo(String casherNo) {
        this.casherNo = casherNo;
    }

    public BigDecimal getBankServiceCharge() {
        return bankServiceCharge;
    }

    public void setBankServiceCharge(BigDecimal bankServiceCharge) {
        this.bankServiceCharge = bankServiceCharge;
    }

    public String getFromSystem() {
        return fromSystem;
    }

    public void setFromSystem(String fromSystem) {
        this.fromSystem = fromSystem;
    }

    public List<PrSaveSaleItemDto> getProducts() {
        return products;
    }

    public void setProducts(List<PrSaveSaleItemDto> products) {
        this.products = products;
    }

    public List<PrSaveSalePaymentsDto> getSalePayments() {
        return salePayments;
    }

    public void setSalePayments(List<PrSaveSalePaymentsDto> salePayments) {
        this.salePayments = salePayments;
    }

    public Integer getIsSynchronous() {
        return isSynchronous;
    }

    public void setIsSynchronous(Integer isSynchronous) {
        this.isSynchronous = isSynchronous;
    }

    public String getCalcBillid() {
        return calcBillid;
    }

    public void setCalcBillid(String calcBillid) {
        this.calcBillid = calcBillid;
    }

    public String getPayStatusDesc() {
        return payStatusDesc;
    }

    public void setPayStatusDesc(String payStatusDesc) {
        this.payStatusDesc = payStatusDesc;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMemberCardNo() {
        return memberCardNo;
    }

    public void setMemberCardNo(String memberCardNo) {
        this.memberCardNo = memberCardNo;
    }

    public String getMemberShipCardNo() {
        return memberShipCardNo;
    }

    public void setMemberShipCardNo(String memberShipCardNo) {
        this.memberShipCardNo = memberShipCardNo;
    }

    public String getMemberCardType() {
        return memberCardType;
    }

    public void setMemberCardType(String memberCardType) {
        this.memberCardType = memberCardType;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public String getProblemDesc() {
        return problemDesc;
    }

    public void setProblemDesc(String problemDesc) {
        this.problemDesc = problemDesc;
    }

    public String getReceptPhone() {
        return receptPhone;
    }

    public void setReceptPhone(String receptPhone) {
        this.receptPhone = receptPhone;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BigDecimal getAccountBalanceAmount() {
        return accountBalanceAmount;
    }

    public void setAccountBalanceAmount(BigDecimal accountBalanceAmount) {
        this.accountBalanceAmount = accountBalanceAmount;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public Integer getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Integer isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceVerificationCode() {
        return invoiceVerificationCode;
    }

    public void setInvoiceVerificationCode(String invoiceVerificationCode) {
        this.invoiceVerificationCode = invoiceVerificationCode;
    }

    public String getReceptName() {
        return receptName;
    }

    public void setReceptName(String receptName) {
        this.receptName = receptName;
    }

    public String getReceptCityName() {
        return receptCityName;
    }

    public void setReceptCityName(String receptCityName) {
        this.receptCityName = receptCityName;
    }

    public String getReceptCityCode() {
        return receptCityCode;
    }

    public void setReceptCityCode(String receptCityCode) {
        this.receptCityCode = receptCityCode;
    }

    public String getReceptProvName() {
        return receptProvName;
    }

    public void setReceptProvName(String receptProvName) {
        this.receptProvName = receptProvName;
    }

    public String getReceptAddress() {
        return receptAddress;
    }

    public void setReceptAddress(String receptAddress) {
        this.receptAddress = receptAddress;
    }

    public String getArrtibute1() {
        return arrtibute1;
    }

    public void setArrtibute1(String arrtibute1) {
        this.arrtibute1 = arrtibute1;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    @Override
    public String toString() {
        return "PrSaleDto{" +
                "sid=" + sid +
                ", saleNo='" + saleNo + '\'' +
                ", isSynchronous=" + isSynchronous +
                ", orderNo='" + orderNo + '\'' +
                ", outOrderNo='" + outOrderNo + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", memberNo='" + memberNo + '\'' +
                ", saleTime=" + saleTime +
                ", saleType=" + saleType +
                ", saleClass=" + saleClass +
                ", saleSource='" + saleSource + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", payStatusDesc='" + payStatusDesc + '\'' +
                ", saleStatus='" + saleStatus + '\'' +
                ", saleStatusDesc='" + saleStatusDesc + '\'' +
                ", saleAmount=" + saleAmount +
                ", paymentAmount=" + paymentAmount +
                ", cashAmount=" + cashAmount +
                ", discountAmount=" + discountAmount +
                ", shippingFee=" + shippingFee +
                ", cashIncome=" + cashIncome +
                ", isLock='" + isLock + '\'' +
                ", needInvoice='" + needInvoice + '\'' +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", invoiceAmount=" + invoiceAmount +
                ", shopNo='" + shopNo + '\'' +
                ", storeName='" + storeName + '\'' +
                ", supplyNo='" + supplyNo + '\'' +
                ", suppllyName='" + suppllyName + '\'' +
                ", shoppeNo='" + shoppeNo + '\'' +
                ", shoppeName='" + shoppeName + '\'' +
                ", createdTime=" + createdTime +
                ", createdMode='" + createdMode + '\'' +
                ", originalSalesOrder='" + originalSalesOrder + '\'' +
                ", exchangeOrder='" + exchangeOrder + '\'' +
                ", sendToPosErp='" + sendToPosErp + '\'' +
                ", sendToStoreErp='" + sendToStoreErp + '\'' +
                ", cashIncomeFlag='" + cashIncomeFlag + '\'' +
                ", hasInvoiced='" + hasInvoiced + '\'' +
                ", salesPaymentNo='" + salesPaymentNo + '\'' +
                ", authorized='" + authorized + '\'' +
                ", authorityCard='" + authorityCard + '\'' +
                ", deliveryNo='" + deliveryNo + '\'' +
                ", offlineSaleBit=" + offlineSaleBit +
                ", qrcode='" + qrcode + '\'' +
                ", latestUpdateTime=" + latestUpdateTime +
                ", latestUpdateMan='" + latestUpdateMan + '\'' +
                ", extractFlag=" + extractFlag +
                ", distributionStatus='" + distributionStatus + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", casherNo='" + casherNo + '\'' +
                ", fromSystem='" + fromSystem + '\'' +
                ", bankServiceCharge=" + bankServiceCharge +
                ", calcBillid='" + calcBillid + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", memberCardNo='" + memberCardNo + '\'' +
                ", memberShipCardNo='" + memberShipCardNo + '\'' +
                ", memberCardType='" + memberCardType + '\'' +
                ", problemDesc='" + problemDesc + '\'' +
                ", saleTimeStr='" + saleTimeStr + '\'' +
                ", latestUpdateTimeStr='" + latestUpdateTimeStr + '\'' +
                ", receptPhone='" + receptPhone + '\'' +
                ", couponAmount=" + couponAmount +
                ", accountBalanceAmount=" + accountBalanceAmount +
                ", receptName='" + receptName + '\'' +
                ", receptCityName='" + receptCityName + '\'' +
                ", receptCityCode='" + receptCityCode + '\'' +
                ", receptProvName='" + receptProvName + '\'' +
                ", receptAddress='" + receptAddress + '\'' +
                ", integral='" + integral + '\'' +
                ", isInvoice=" + isInvoice +
                ", invoiceVerificationCode='" + invoiceVerificationCode + '\'' +
                ", products=" + products +
                ", salePayments=" + salePayments +
                ", arrtibute1='" + arrtibute1 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                '}';
    }
}

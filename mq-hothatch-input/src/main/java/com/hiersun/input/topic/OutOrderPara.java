package com.hiersun.input.topic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Description: 订单开单para
 * @Auther: kongqf
 * @Date: 2018/9/27
 */
@ApiModel("外部订单")
public class OutOrderPara extends BasePara {
    @ApiModelProperty(value = "订单号")
    private String orderNo;//订单号
    @ApiModelProperty(value = "外部订单号")
    @NotNull(message = "{OutOrderPara.outOrderNo.isNotNull}")
    private String outOrderNo;//外部订单号
    @ApiModelProperty(value = "账号")
    private String accountNo;//账号
    @ApiModelProperty(value = "支付中台号")
    private String paymentNo;//支付中台号
    @ApiModelProperty(value = "会员编号")
    private String memberNo;//会员编号
    @ApiModelProperty(value = "订单来源")
    @NotNull(message = "{OutOrderPara.orderSource.isNotNull}")
    private String orderSource;//订单来源
    @ApiModelProperty(value = "门店编号")
    private String shopNo; //门店编号
    @ApiModelProperty(value = "订单类型")
    private String orderType;//订单类型
    @ApiModelProperty(value = "支付类型")
    @NotNull(message = "{OrderPara.paymentClass.isNotNull}")
    private String paymentClass;//支付类型
    @ApiModelProperty(value = "延迟时间")
    private Date delayTime;//延迟时间
    @ApiModelProperty(value = "订单状态")
    @NotNull(message = "{OutOrderPara.orderStatus.isNotNull}")
    private String orderStatus;//订单状态
    @ApiModelProperty(value = "订单状态描述")
    @NotNull(message = "{OutOrderPara.orderStatusDesc.isNotNull}")
    private String orderStatusDesc;//订单状态描述
    @ApiModelProperty(value = "配送方式")
    @NotNull(message = "{OutOrderPara.deliveryMode.isNotNull}")
    private String deliveryMode;//配送方式
    @ApiModelProperty(value = "配送方式名称")
    private String deliveryModeName;//配送方式名称
    @ApiModelProperty(value = "是否开发票")
    private String needInvoice;//是否开发票
    @ApiModelProperty(value = "销售时间")
    private Date saleTime;
    @ApiModelProperty(value = "支付时间")
    private Date payTime;
    @ApiModelProperty(value = "应收运费")
    @NotNull(message = "{OutOrderPara.needSendCost.isNotNull}")
    private BigDecimal needSendCost;//应收运费
    @ApiModelProperty(value = "实际运费")
    private BigDecimal sendCost;//实际运费
    @ApiModelProperty(value = "商品销售总额")
    private BigDecimal salesAmount;//商品销售总额
    @ApiModelProperty(value = "销售数量")
    private Integer saleSum;//销售数量
    @ApiModelProperty(value = "退货数量")
    private Integer refundSum;//退货数量
    @ApiModelProperty(value = "发货数量")
    private Integer sendSum;//发货数量
    @ApiModelProperty(value = "发货金额")
    private BigDecimal sendAmount;//发货金额
    @ApiModelProperty(value = "订单应付金额")
    @NotNull(message = "{OutOrderPara.paymentAmount.isNotNull}")
    private BigDecimal paymentAmount;//订单应付金额
    @ApiModelProperty(value = "订单现金类支付金额")
    @NotNull(message = "{OutOrderPara.cashAmount.isNotNull}")
    private BigDecimal cashAmount;//订单现金类支付金额
    @ApiModelProperty(value = "收银损益")
    private BigDecimal cashIncome;//收银损益
    @ApiModelProperty(value = "使用余额总额")
    private BigDecimal accountBalanceAmount;//使用余额总额
    @ApiModelProperty(value = "订单优惠总额")
    @NotNull(message = "{OutOrderPara.promotionAmount.isNotNull}")
    private BigDecimal promotionAmount;//订单优惠总额
    @ApiModelProperty(value = "使用优惠券金额")
    private BigDecimal couponAmount; //使用优惠券金额
    @ApiModelProperty(value = "积分")
    private String integral; //积分
    @ApiModelProperty(value = "客户备注")
    private String customerComments;//客户备注
    @ApiModelProperty(value = "客服备注")
    private String callCenterComments;//客服备注
    @ApiModelProperty(value = "收件人电话")
    private String receptPhone;//收件人电话
    @ApiModelProperty(value = "收件人姓名")
    @NotNull(message = "{OrderPara.receptName.isNotNull}")
    private String receptName;//收件人姓名
    @ApiModelProperty(value = "收件人城市编号")
    @NotNull(message = "{OutOrderPara.receptCityNo.isNotNull}")
    private String receptCityNo;//收件人城市编号
    @ApiModelProperty(value = "收件人城市名称")
    private String receptCityName;//收件人城市名称
    @ApiModelProperty(value = "收件城市邮编")
    @NotNull(message = "{OutOrderPara.receptCityCode.isNotNull}")
    private String receptCityCode;//收件城市邮编
    @ApiModelProperty(value = "收件地区省份编号")
    @NotNull(message = "{OutOrderPara.receptProvNo.isNotNull}")
    private String receptProvNo;//收件地区省份编号
    @ApiModelProperty(value = "收件地区省份名称")
    private String receptProvName;//收件地区省份名称
    @ApiModelProperty(value = "收货地址")
    @NotNull(message = "{OrderPara.receptAddress.isNotNull}")
    private String receptAddress;//收货地址
    @ApiModelProperty(value = "提货类型")
    private Integer extractFlag;//提货类型
    @ApiModelProperty(value = "是否进入回收站")
    private Integer recoveryFlag;//是否进入回收站
    @ApiModelProperty(value = "是否参加促销")
    private Integer promFlag;//是否参加促销
    @ApiModelProperty(value = "版本号")
    private String version;//版本号
    @ApiModelProperty(value = "会员类型")
    private Integer memberType;//会员类型
    @ApiModelProperty(value = "是否是COD订单")
    @NotNull(message = "{OrderPara.isCod.isNotNull}")
    private Integer isCod;//是否是COD订单
    @ApiModelProperty(value = "销售时间")
    private String saleTimeStr;
    @ApiModelProperty(value = "最后修改人")
    private String latestUpdateMan;
    @ApiModelProperty(value = "收件人区名称")
    @NotNull(message = "{OutOrderPara.receptDistrictNo.isNotNull}")
    private String receptDistrictNo;//收件人区名称
    @ApiModelProperty(value = "收件人区名称")
    private String receptDistrictName;//收件人区名称
    @ApiModelProperty(value = "发票抬头")
    private String invoiceTitle;//发票抬头
    @ApiModelProperty(value = "联系电话")
    private String contactNumber;//联系电话
    @ApiModelProperty(value = "客户要求送货时间")
    private String requiredDeliveryDate; //客户要求送货时间
    @ApiModelProperty(value = "身份证号")
    private String identityCard;
    @ApiModelProperty(value = "真实姓名")
    private String realName; //真实姓名
    @ApiModelProperty(value = "tid")
    private String tid;

    private String curOrderNo;
    @ApiModelProperty(value = "支付状态")
    @NotNull(message = "{OutOrderPara.payStatus.isNotNull}")
    private String payStatus;//支付状态
    @ApiModelProperty(value = "是否已参加活动")
    private Integer isActivit;//是否已参加活动 1：是 0：否
    @ApiModelProperty(value = "款机流水号")
    private String payOrderNo;//款机流水号

    private List<OrderItemDto> orderItemList;

    private List<PaymentItemDto> paymentItems;

    private List<PrSaleDto> saleOrders;
    @ApiModelProperty(value = "收银员")
    private String casher;//收银员
    @ApiModelProperty(value = "负库存销售")
    //是否允许负库存销售 false 允许负库存销售，true 不允许负库存销售
    private boolean negativeStock = false;
    @ApiModelProperty(value = "导购信息")
    private String guideInfo;

    private String offlineStoreCode;
    @ApiModelProperty(value = "自提类型")
    private String extract;
    @ApiModelProperty(value = "定金类型")
    private String down; //定金类型
    @ApiModelProperty(value = "定金金额")
    private BigDecimal downPice; //定金金额
    @ApiModelProperty(value = "支付门店号")
    private String payShopNo;
    @ApiModelProperty(value = "订单购物类型 1购物车跳转")
    private String shopType;
    @ApiModelProperty(value = "预售订单-预计发货时间")
    private Date sendTime;

    @ApiModelProperty("下单方式。暂时只用于区分抽奖订单")
    private String way;

    public String getPayShopNo() {
        return payShopNo;
    }

    public void setPayShopNo(String payShopNo) {
        this.payShopNo = payShopNo;
    }

    public String getOrderStatusDesc() {
        return orderStatusDesc;
    }

    public void setOrderStatusDesc(String orderStatusDesc) {
        this.orderStatusDesc = orderStatusDesc;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
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

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPaymentClass() {
        return paymentClass;
    }

    public void setPaymentClass(String paymentClass) {
        this.paymentClass = paymentClass;
    }

    public Date getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Date delayTime) {
        this.delayTime = delayTime;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public String getDeliveryModeName() {
        return deliveryModeName;
    }

    public void setDeliveryModeName(String deliveryModeName) {
        this.deliveryModeName = deliveryModeName;
    }

    public String getNeedInvoice() {
        return needInvoice;
    }

    public void setNeedInvoice(String needInvoice) {
        this.needInvoice = needInvoice;
    }

    public BigDecimal getNeedSendCost() {
        return needSendCost;
    }

    public void setNeedSendCost(BigDecimal needSendCost) {
        this.needSendCost = needSendCost;
    }

    public BigDecimal getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Integer getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(Integer saleSum) {
        this.saleSum = saleSum;
    }

    public Integer getRefundSum() {
        return refundSum;
    }

    public void setRefundSum(Integer refundSum) {
        this.refundSum = refundSum;
    }

    public Integer getSendSum() {
        return sendSum;
    }

    public void setSendSum(Integer sendSum) {
        this.sendSum = sendSum;
    }

    public BigDecimal getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(BigDecimal sendAmount) {
        this.sendAmount = sendAmount;
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

    public BigDecimal getCashIncome() {
        return cashIncome;
    }

    public void setCashIncome(BigDecimal cashIncome) {
        this.cashIncome = cashIncome;
    }

    public BigDecimal getAccountBalanceAmount() {
        return accountBalanceAmount;
    }

    public void setAccountBalanceAmount(BigDecimal accountBalanceAmount) {
        this.accountBalanceAmount = accountBalanceAmount;
    }

    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public String getCustomerComments() {
        return customerComments;
    }

    public void setCustomerComments(String customerComments) {
        this.customerComments = customerComments;
    }

    public String getCallCenterComments() {
        return callCenterComments;
    }

    public void setCallCenterComments(String callCenterComments) {
        this.callCenterComments = callCenterComments;
    }

    public String getReceptPhone() {
        return receptPhone;
    }

    public void setReceptPhone(String receptPhone) {
        this.receptPhone = receptPhone;
    }

    public String getReceptName() {
        return receptName;
    }

    public void setReceptName(String receptName) {
        this.receptName = receptName;
    }

    public String getReceptCityNo() {
        return receptCityNo;
    }

    public void setReceptCityNo(String receptCityNo) {
        this.receptCityNo = receptCityNo;
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

    public String getReceptProvNo() {
        return receptProvNo;
    }

    public void setReceptProvNo(String receptProvNo) {
        this.receptProvNo = receptProvNo;
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

    public Integer getExtractFlag() {
        return extractFlag;
    }

    public void setExtractFlag(Integer extractFlag) {
        this.extractFlag = extractFlag;
    }

    public Integer getRecoveryFlag() {
        return recoveryFlag;
    }

    public void setRecoveryFlag(Integer recoveryFlag) {
        this.recoveryFlag = recoveryFlag;
    }

    public Integer getPromFlag() {
        return promFlag;
    }

    public void setPromFlag(Integer promFlag) {
        this.promFlag = promFlag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public String getSaleTimeStr() {
        return saleTimeStr;
    }

    public void setSaleTimeStr(String saleTimeStr) {
        this.saleTimeStr = saleTimeStr;
    }

    public List<OrderItemDto> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItemDto> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<PaymentItemDto> getPaymentItems() {
        return paymentItems;
    }

    public void setPaymentItems(List<PaymentItemDto> paymentItems) {
        this.paymentItems = paymentItems;
    }

    public List<PrSaleDto> getSaleOrders() {
        return saleOrders;
    }

    public void setSaleOrders(List<PrSaleDto> saleOrders) {
        this.saleOrders = saleOrders;
    }

    public String getLatestUpdateMan() {
        return latestUpdateMan;
    }

    public void setLatestUpdateMan(String latestUpdateMan) {
        this.latestUpdateMan = latestUpdateMan;
    }

    public Integer getIsCod() {
        return isCod;
    }

    public void setIsCod(Integer isCod) {
        this.isCod = isCod;
    }

    public String getReceptDistrictNo() {
        return receptDistrictNo;
    }

    public void setReceptDistrictNo(String receptDistrictNo) {
        this.receptDistrictNo = receptDistrictNo;
    }

    public String getReceptDistrictName() {
        return receptDistrictName;
    }

    public void setReceptDistrictName(String receptDistrictName) {
        this.receptDistrictName = receptDistrictName;
    }

    public BigDecimal getSendCost() {
        return sendCost;
    }

    public void setSendCost(BigDecimal sendCost) {
        this.sendCost = sendCost;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    public void setRequiredDeliveryDate(String requiredDeliveryDate) {
        this.requiredDeliveryDate = requiredDeliveryDate;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getCurOrderNo() {
        return curOrderNo;
    }

    public void setCurOrderNo(String curOrderNo) {
        this.curOrderNo = curOrderNo;
    }

    public Integer getIsActivit() {
        return isActivit;
    }

    public void setIsActivit(Integer isActivit) {
        this.isActivit = isActivit;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getCasher() {
        return casher;
    }

    public void setCasher(String casher) {
        this.casher = casher;
    }

    public boolean isNegativeStock() {
        return negativeStock;
    }

    public void setNegativeStock(boolean negativeStock) {
        this.negativeStock = negativeStock;
    }

    public String getGuideInfo() {
        return guideInfo;
    }

    public void setGuideInfo(String guideInfo) {
        this.guideInfo = guideInfo;
    }

    public String getOfflineStoreCode() {
        return offlineStoreCode;
    }

    public void setOfflineStoreCode(String offlineStoreCode) {
        this.offlineStoreCode = offlineStoreCode;
    }
    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }

    public String getDown() {
        return down;
    }

    public void setDown(String down) {
        this.down = down;
    }

    public BigDecimal getDownPice() {
        return downPice;
    }

    public void setDownPice(BigDecimal downPice) {
        this.downPice = downPice;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "OutOrderPara{" +
                "orderNo='" + orderNo + '\'' +
                ", outOrderNo='" + outOrderNo + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", paymentNo='" + paymentNo + '\'' +
                ", memberNo='" + memberNo + '\'' +
                ", orderSource='" + orderSource + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", orderType='" + orderType + '\'' +
                ", paymentClass='" + paymentClass + '\'' +
                ", delayTime=" + delayTime +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderStatusDesc='" + orderStatusDesc + '\'' +
                ", deliveryMode='" + deliveryMode + '\'' +
                ", deliveryModeName='" + deliveryModeName + '\'' +
                ", needInvoice='" + needInvoice + '\'' +
                ", saleTime=" + saleTime +
                ", payTime=" + payTime +
                ", needSendCost=" + needSendCost +
                ", sendCost=" + sendCost +
                ", salesAmount=" + salesAmount +
                ", saleSum=" + saleSum +
                ", refundSum=" + refundSum +
                ", sendSum=" + sendSum +
                ", sendAmount=" + sendAmount +
                ", paymentAmount=" + paymentAmount +
                ", cashAmount=" + cashAmount +
                ", cashIncome=" + cashIncome +
                ", accountBalanceAmount=" + accountBalanceAmount +
                ", promotionAmount=" + promotionAmount +
                ", couponAmount=" + couponAmount +
                ", integral='" + integral + '\'' +
                ", customerComments='" + customerComments + '\'' +
                ", callCenterComments='" + callCenterComments + '\'' +
                ", receptPhone='" + receptPhone + '\'' +
                ", receptName='" + receptName + '\'' +
                ", receptCityNo='" + receptCityNo + '\'' +
                ", receptCityName='" + receptCityName + '\'' +
                ", receptCityCode='" + receptCityCode + '\'' +
                ", receptProvNo='" + receptProvNo + '\'' +
                ", receptProvName='" + receptProvName + '\'' +
                ", receptAddress='" + receptAddress + '\'' +
                ", extractFlag=" + extractFlag +
                ", recoveryFlag=" + recoveryFlag +
                ", promFlag=" + promFlag +
                ", version='" + version + '\'' +
                ", memberType=" + memberType +
                ", isCod=" + isCod +
                ", saleTimeStr='" + saleTimeStr + '\'' +
                ", latestUpdateMan='" + latestUpdateMan + '\'' +
                ", receptDistrictNo='" + receptDistrictNo + '\'' +
                ", receptDistrictName='" + receptDistrictName + '\'' +
                ", invoiceTitle='" + invoiceTitle + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", requiredDeliveryDate='" + requiredDeliveryDate + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", realName='" + realName + '\'' +
                ", tid='" + tid + '\'' +
                ", curOrderNo='" + curOrderNo + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", isActivit=" + isActivit +
                ", payOrderNo='" + payOrderNo + '\'' +
                ", orderItemList=" + orderItemList +
                ", paymentItems=" + paymentItems +
                ", saleOrders=" + saleOrders +
                ", casher='" + casher + '\'' +
                ", negativeStock=" + negativeStock +
                ", guideInfo='" + guideInfo + '\'' +
                ", offlineStoreCode='" + offlineStoreCode + '\'' +
                ", extract='" + extract + '\'' +
                ", down='" + down + '\'' +
                ", downPice=" + downPice +
                ", payShopNo='" + payShopNo + '\'' +
                ", shopType='" + shopType + '\'' +
                ", way='" + way + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}


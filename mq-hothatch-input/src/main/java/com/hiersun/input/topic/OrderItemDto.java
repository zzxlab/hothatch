package com.hiersun.input.topic;

import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Auther: kongqf
 * @Date: 2018/9/5
 */
public class OrderItemDto implements Serializable {
    @ApiModelProperty(value = "订单号")
    private String orderNo; //订单号
    @ApiModelProperty(value = "行号")
    private Integer rowNo;  //行号
    @ApiModelProperty(value = "商品行项目编号")
    private String orderItemNo; //商品行项目编号
    @ApiModelProperty(value = "商品行项目状态")
    private String itemStatus; //商品行项目状态
    @ApiModelProperty(value = "商品名称")
    private String shoppeProName; //商品名称
    @ApiModelProperty(value = "专柜编号")
    private String shoppeNo; //专柜编号
    @ApiModelProperty(value = "专柜名称")
    private String shoppeName; //专柜名称
    @ApiModelProperty(value = "门店编号")
    private String shopNo; //门店编号
    @ApiModelProperty(value = "门店名称")
    private String storeName; //门店名称
    @ApiModelProperty(value = "供应商编码")
    private String supplyCode; //供应商编码
    @ApiModelProperty(value = "供应商名称")
    private String suppllyName; //供应商名称
    @ApiModelProperty(value = "条码编号")
    private String supplyProductNo; //条码编号
    @ApiModelProperty(value = "供应商内部商品编码")
    private String supplyInnerProdNo; //供应商内部商品编码(赠品关联的原商品行号)
    @ApiModelProperty(value = "ERP商品编码")
    private String erpProductCode; //ERP商品编码
    @ApiModelProperty(value = "商品单位")
    private String unit; //商品单位
    @ApiModelProperty(value = "中台品牌")
    private String brandNo; //中台品牌
    @ApiModelProperty(value = "中台品牌名称")
    private String brandName; //中台品牌名称
    @ApiModelProperty(value = "条形码")
    private String barcode; //条形码
    @ApiModelProperty(value = "产品编号")
    private String spuNo; //产品编号
    @ApiModelProperty(value = "sku编号")
    private String skuNo; //sku编号
    @ApiModelProperty(value = "颜色")
    private String colorNo; //颜色
    @ApiModelProperty(value = "颜色名称")
    private String colorName; //颜色名称
    @ApiModelProperty(value = "规格(证书编码)")
    private String sizeNo; //规格(证书编码)
    @ApiModelProperty(value = "规格名称(赠品关联的活动id)")
    private String sizeName; //规格名称(赠品关联的活动id)
    @ApiModelProperty(value = "商品标准价")
    private BigDecimal standPrice; //商品标准价
    @ApiModelProperty(value = "商品售价")
    private BigDecimal salesPrice; //商品售价
    @ApiModelProperty(value = "价格类型")
    private String priceType; //价格类型
    @ApiModelProperty(value = "退货数量")
    private Integer refundNum; //退货数量
    @ApiModelProperty(value = "允许退货数量")
    private Integer allowRefundNum; //允许退货数量
    @ApiModelProperty(value = "缺货数量")
    private Integer stockoutAmount; //缺货数量
    @ApiModelProperty(value = "销售数量")
    private Integer saleSum; //销售数量
    @ApiModelProperty(value = "提货数量")
    private Integer pickSum; //提货数量
    @ApiModelProperty(value = "商品折后总额")
    private BigDecimal paymentAmount; //商品折后总额
    @ApiModelProperty(value = "商品优惠金额")
    private BigDecimal totalDiscount; //商品优惠金额
    @ApiModelProperty(value = "物流属性")
    private String shippingAttribute; //物流属性
    @ApiModelProperty(value = "商品描述")
    private String productName; //商品描述
    @ApiModelProperty(value = "是否为赠品")
    private String isGift; //是否为赠品
    @ApiModelProperty(value = "商品图片地址")
    private String url; //商品图片地址
    @ApiModelProperty(value = "经营方式")
    private String businessMode; //经营方式
    @ApiModelProperty(value = "虚库类型")
    private String warehouseType; //虚库类型
    @ApiModelProperty(value = "运费分摊金额")
    private BigDecimal shippingFeeSplit; //运费分摊金额
    @ApiModelProperty(value = "实际运费分摊")
    private BigDecimal deliveryShippingFeeSplit; //实际运费分摊
    @ApiModelProperty(value = "发票金额")
    private BigDecimal invoiceAmount; //发票金额
    @ApiModelProperty(value = "是否已评论")
    private String hasRecommanded; //是否已评论
    @ApiModelProperty(value = "删除标记")
    private String deleteFlag; //删除标记
    @ApiModelProperty(value = "统计分类")
    private String statisticsCateNo; //统计分类
    @ApiModelProperty(value = "管理分类")
    private String mangerCateNo; //管理分类
    @ApiModelProperty(value = "标志收银损益在商品上还是在运费上")
    private String cashIncomeFlag; //标志收银损益在商品上还是在运费上
    @ApiModelProperty(value = "创建时间")
    private Date createdTime; //创建时间
    @ApiModelProperty(value = "最后更新时间")
    private Date latestUpdateTime; //最后更新时间
    @ApiModelProperty(value = "最后更新人")
    private String latestUpdateMan; //最后更新人
    @ApiModelProperty(value = "出库商品唯一编号")
    private String productOnlySn; //出库商品唯一编号
    @ApiModelProperty(value = "库存方式")
    private String stockMode;//库存方式
    @ApiModelProperty(value = "银行手续费")
    private BigDecimal bankServiceCharge;//银行手续费
    @ApiModelProperty(value = "货号")
    private String materialNum;//货号
    @ApiModelProperty(value = "是否支付减")
    private String isPayReduce;//是否支付减
    @ApiModelProperty(value = "第三方商品行ID")
    private String oid; //第三方商品行ID
    @ApiModelProperty(value = "工业一级分类")
    private String industryCategoryOne;//工业一级分类
    @ApiModelProperty(value = "是否为黄金珠宝类")
    private String isGold;//是否为黄金珠宝类
    @ApiModelProperty(value = "是否为特例品")
    private String isSpecial;//是否为特例品
    @ApiModelProperty(value = "商品分类")
    private String proType;//商品分类

    @ApiModelProperty(value = "商品短名称")
    private String shortName;   //商品短名称

    private List<OrderItemPromotionSplitDto> orderItemPromotionSplitDto;

    private List<OrderItemGetSplitDto> prOrderGetSplitDto;

    private List<OrderItemPaymentSplitDto> orderItemPaymentSplitList = new ArrayList<>();

    private String createdTimeStr;
    private String latestUpdateTimeStr;

    private String identityCard;

    private String realName; //真实姓名

    private String productChannleName;//渠道商品名称

    private String shopRate; //门店扣率

    private JSONArray salePropList;

    private String c1;//商品刻字

    private String c2;//刻字字体

    private String c3;//线下、线上标识 1线上  0线下

    private String c4;

    private String c5;//系列名称

    private String tradeType; //订单类型

    private List<PrSaleProductProp> saleProps = new ArrayList<>(); //销售属性

    private String curOrderNo;//凭证号

    private String buyerMessage; //买家留言

    private String skuPropertiesName; //买家留言

    private String zfigrNum; //指圈号

    private BigDecimal verificationPrice;//核销价格

    private String posId;//pos单号

    private Long omsToPosId; //修改omsToPos表用

    private String guideInfo;//导购信息

    //是否允许负库存销售 false 允许负库存销售，true 不允许负库存销售
    private boolean negativeStock = false;

    private BigDecimal cashAmount;//订单现金类支付金额



    private String supplierCode;

    private String supplierName;

    private String downType;

    private BigDecimal costPrice;
    //类型 1 kz
    private Integer c6;

    private BigDecimal c7;

    private String c8;

    private String c9;

    private String c10;

    private String kzType;

    private String flag;

    public List<PrSaleProductProp> getSaleProps() {
        return saleProps;
    }

    public void setSaleProps(List<PrSaleProductProp> saleProps) {
        this.saleProps = saleProps;
    }

    public JSONArray getSalePropList() {
        return salePropList;
    }

    public void setSalePropList(JSONArray salePropList) {
        this.salePropList = salePropList;
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

    public String getCreatedTimeStr() {
        return createdTimeStr;
    }

    public void setCreatedTimeStr(String createdTimeStr) {
        this.createdTimeStr = createdTimeStr;
    }

    public String getLatestUpdateTimeStr() {
        return latestUpdateTimeStr;
    }

    public void setLatestUpdateTimeStr(String latestUpdateTimeStr) {
        this.latestUpdateTimeStr = latestUpdateTimeStr;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderItemNo() {
        return orderItemNo;
    }

    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
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

    public String getSupplyCode() {
        return supplyCode;
    }

    public void setSupplyCode(String supplyCode) {
        this.supplyCode = supplyCode;
    }

    public String getSuppllyName() {
        return suppllyName;
    }

    public void setSuppllyName(String suppllyName) {
        this.suppllyName = suppllyName;
    }

    public String getSupplyProductNo() {
        return supplyProductNo;
    }

    public void setSupplyProductNo(String supplyProductNo) {
        this.supplyProductNo = supplyProductNo;
    }

    public String getSupplyInnerProdNo() {
        return supplyInnerProdNo;
    }

    public void setSupplyInnerProdNo(String supplyInnerProdNo) {
        this.supplyInnerProdNo = supplyInnerProdNo;
    }

    public String getErpProductCode() {
        return erpProductCode;
    }

    public void setErpProductCode(String erpProductCode) {
        this.erpProductCode = erpProductCode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBrandNo() {
        return brandNo;
    }

    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSpuNo() {
        return spuNo;
    }

    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public void setSkuNo(String skuNo) {
        this.skuNo = skuNo;
    }

    public String getColorNo() {
        return colorNo;
    }

    public void setColorNo(String colorNo) {
        this.colorNo = colorNo;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getSizeNo() {
        return sizeNo;
    }

    public void setSizeNo(String sizeNo) {
        this.sizeNo = sizeNo;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public BigDecimal getStandPrice() {
        return standPrice;
    }

    public void setStandPrice(BigDecimal standPrice) {
        this.standPrice = standPrice;
    }

    public BigDecimal getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(BigDecimal salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }

    public Integer getAllowRefundNum() {
        return allowRefundNum;
    }

    public void setAllowRefundNum(Integer allowRefundNum) {
        this.allowRefundNum = allowRefundNum;
    }

    public Integer getStockoutAmount() {
        return stockoutAmount;
    }

    public void setStockoutAmount(Integer stockoutAmount) {
        this.stockoutAmount = stockoutAmount;
    }

    public Integer getSaleSum() {
        return saleSum;
    }

    public void setSaleSum(Integer saleSum) {
        this.saleSum = saleSum;
    }

    public Integer getPickSum() {
        return pickSum;
    }

    public void setPickSum(Integer pickSum) {
        this.pickSum = pickSum;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getShippingAttribute() {
        return shippingAttribute;
    }

    public void setShippingAttribute(String shippingAttribute) {
        this.shippingAttribute = shippingAttribute;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getIsGift() {
        return isGift;
    }

    public void setIsGift(String isGift) {
        this.isGift = isGift;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBusinessMode() {
        return businessMode;
    }

    public void setBusinessMode(String businessMode) {
        this.businessMode = businessMode;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public BigDecimal getShippingFeeSplit() {
        return shippingFeeSplit;
    }

    public void setShippingFeeSplit(BigDecimal shippingFeeSplit) {
        this.shippingFeeSplit = shippingFeeSplit;
    }

    public BigDecimal getDeliveryShippingFeeSplit() {
        return deliveryShippingFeeSplit;
    }

    public void setDeliveryShippingFeeSplit(BigDecimal deliveryShippingFeeSplit) {
        this.deliveryShippingFeeSplit = deliveryShippingFeeSplit;
    }

    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getHasRecommanded() {
        return hasRecommanded;
    }

    public void setHasRecommanded(String hasRecommanded) {
        this.hasRecommanded = hasRecommanded;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getStatisticsCateNo() {
        return statisticsCateNo;
    }

    public void setStatisticsCateNo(String statisticsCateNo) {
        this.statisticsCateNo = statisticsCateNo;
    }

    public String getMangerCateNo() {
        return mangerCateNo;
    }

    public void setMangerCateNo(String mangerCateNo) {
        this.mangerCateNo = mangerCateNo;
    }

    public String getCashIncomeFlag() {
        return cashIncomeFlag;
    }

    public void setCashIncomeFlag(String cashIncomeFlag) {
        this.cashIncomeFlag = cashIncomeFlag;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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

    public String getProductOnlySn() {
        return productOnlySn;
    }

    public void setProductOnlySn(String productOnlySn) {
        this.productOnlySn = productOnlySn;
    }

    public List<OrderItemGetSplitDto> getPrOrderGetSplitDto() {
        return prOrderGetSplitDto;
    }

    public void setPrOrderGetSplitDto(List<OrderItemGetSplitDto> prOrderGetSplitDto) {
        this.prOrderGetSplitDto = prOrderGetSplitDto;
    }

    public String getShoppeProName() {
        return shoppeProName;
    }

    public void setShoppeProName(String shoppeProName) {
        this.shoppeProName = shoppeProName;
    }

    public List<OrderItemPaymentSplitDto> getOrderItemPaymentSplitList() {
        return orderItemPaymentSplitList;
    }

    public void setOrderItemPaymentSplitList(List<OrderItemPaymentSplitDto> orderItemPaymentSplitList) {
        this.orderItemPaymentSplitList = orderItemPaymentSplitList;
    }

    public List<OrderItemPromotionSplitDto> getOrderItemPromotionSplitDto() {
        return orderItemPromotionSplitDto;
    }

    public void setOrderItemPromotionSplitDto(List<OrderItemPromotionSplitDto> orderItemPromotionSplitDto) {
        this.orderItemPromotionSplitDto = orderItemPromotionSplitDto;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public String getStockMode() {
        return stockMode;
    }

    public void setStockMode(String stockMode) {
        this.stockMode = stockMode;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public BigDecimal getBankServiceCharge() {
        return bankServiceCharge;
    }

    public void setBankServiceCharge(BigDecimal bankServiceCharge) {
        this.bankServiceCharge = bankServiceCharge;
    }

    public String getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(String materialNum) {
        this.materialNum = materialNum;
    }

    public String getIsPayReduce() {
        return isPayReduce;
    }

    public void setIsPayReduce(String isPayReduce) {
        this.isPayReduce = isPayReduce;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getIndustryCategoryOne() {
        return industryCategoryOne;
    }

    public void setIndustryCategoryOne(String industryCategoryOne) {
        this.industryCategoryOne = industryCategoryOne;
    }

    public String getIsGold() {
        return isGold;
    }

    public void setIsGold(String isGold) {
        this.isGold = isGold;
    }

    public String getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(String isSpecial) {
        this.isSpecial = isSpecial;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProductChannleName() {
        return productChannleName;
    }

    public void setProductChannleName(String productChannleName) {
        this.productChannleName = productChannleName;
    }

    public String getShopRate() {
        return shopRate;
    }

    public void setShopRate(String shopRate) {
        this.shopRate = shopRate;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getCurOrderNo() {
        return curOrderNo;
    }

    public void setCurOrderNo(String curOrderNo) {
        this.curOrderNo = curOrderNo;
    }

    public String getC4() {
        return c4;
    }

    public void setC4(String c4) {
        this.c4 = c4;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getSkuPropertiesName() {
        return skuPropertiesName;
    }

    public void setSkuPropertiesName(String skuPropertiesName) {
        this.skuPropertiesName = skuPropertiesName;
    }

    public String getC5() {
        return c5;
    }

    public void setC5(String c5) {
        this.c5 = c5;
    }

    public String getZfigrNum() {
        return zfigrNum;
    }

    public void setZfigrNum(String zfigrNum) {
        this.zfigrNum = zfigrNum;
    }

    public BigDecimal getVerificationPrice() {
        return verificationPrice;
    }

    public void setVerificationPrice(BigDecimal verificationPrice) {
        this.verificationPrice = verificationPrice;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public Long getOmsToPosId() {
        return omsToPosId;
    }

    public void setOmsToPosId(Long omsToPosId) {
        this.omsToPosId = omsToPosId;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
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

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getDownType() {
        return downType;
    }

    public void setDownType(String downType) {
        this.downType = downType;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public Integer getC6() {
        return c6;
    }

    public void setC6(Integer c6) {
        this.c6 = c6;
    }

    public BigDecimal getC7() {
        return c7;
    }

    public void setC7(BigDecimal c7) {
        this.c7 = c7;
    }

    public String getC8() {
        return c8;
    }

    public void setC8(String c8) {
        this.c8 = c8;
    }

    public String getC9() {
        return c9;
    }

    public void setC9(String c9) {
        this.c9 = c9;
    }

    public String getC10() {
        return c10;
    }

    public void setC10(String c10) {
        this.c10 = c10;
    }

    public String getKzType() {
        return kzType;
    }

    public void setKzType(String kzType) {
        this.kzType = kzType;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "OrderItemDto{" +
                "orderNo='" + orderNo + '\'' +
                ", rowNo=" + rowNo +
                ", orderItemNo='" + orderItemNo + '\'' +
                ", itemStatus='" + itemStatus + '\'' +
                ", shoppeProName='" + shoppeProName + '\'' +
                ", shoppeNo='" + shoppeNo + '\'' +
                ", shoppeName='" + shoppeName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", storeName='" + storeName + '\'' +
                ", supplyCode='" + supplyCode + '\'' +
                ", suppllyName='" + suppllyName + '\'' +
                ", supplyProductNo='" + supplyProductNo + '\'' +
                ", supplyInnerProdNo='" + supplyInnerProdNo + '\'' +
                ", erpProductCode='" + erpProductCode + '\'' +
                ", unit='" + unit + '\'' +
                ", brandNo='" + brandNo + '\'' +
                ", brandName='" + brandName + '\'' +
                ", barcode='" + barcode + '\'' +
                ", spuNo='" + spuNo + '\'' +
                ", skuNo='" + skuNo + '\'' +
                ", colorNo='" + colorNo + '\'' +
                ", colorName='" + colorName + '\'' +
                ", sizeNo='" + sizeNo + '\'' +
                ", sizeName='" + sizeName + '\'' +
                ", standPrice=" + standPrice +
                ", salesPrice=" + salesPrice +
                ", priceType='" + priceType + '\'' +
                ", refundNum=" + refundNum +
                ", allowRefundNum=" + allowRefundNum +
                ", stockoutAmount=" + stockoutAmount +
                ", saleSum=" + saleSum +
                ", pickSum=" + pickSum +
                ", paymentAmount=" + paymentAmount +
                ", totalDiscount=" + totalDiscount +
                ", shippingAttribute='" + shippingAttribute + '\'' +
                ", productName='" + productName + '\'' +
                ", isGift='" + isGift + '\'' +
                ", url='" + url + '\'' +
                ", businessMode='" + businessMode + '\'' +
                ", warehouseType='" + warehouseType + '\'' +
                ", shippingFeeSplit=" + shippingFeeSplit +
                ", deliveryShippingFeeSplit=" + deliveryShippingFeeSplit +
                ", invoiceAmount=" + invoiceAmount +
                ", hasRecommanded='" + hasRecommanded + '\'' +
                ", deleteFlag='" + deleteFlag + '\'' +
                ", statisticsCateNo='" + statisticsCateNo + '\'' +
                ", mangerCateNo='" + mangerCateNo + '\'' +
                ", cashIncomeFlag='" + cashIncomeFlag + '\'' +
                ", createdTime=" + createdTime +
                ", latestUpdateTime=" + latestUpdateTime +
                ", latestUpdateMan='" + latestUpdateMan + '\'' +
                ", productOnlySn='" + productOnlySn + '\'' +
                ", stockMode='" + stockMode + '\'' +
                ", bankServiceCharge=" + bankServiceCharge +
                ", materialNum='" + materialNum + '\'' +
                ", isPayReduce='" + isPayReduce + '\'' +
                ", oid='" + oid + '\'' +
                ", industryCategoryOne='" + industryCategoryOne + '\'' +
                ", isGold='" + isGold + '\'' +
                ", isSpecial='" + isSpecial + '\'' +
                ", proType='" + proType + '\'' +
                ", shortName='" + shortName + '\'' +
                ", orderItemPromotionSplitDto=" + orderItemPromotionSplitDto +
                ", prOrderGetSplitDto=" + prOrderGetSplitDto +
                ", orderItemPaymentSplitList=" + orderItemPaymentSplitList +
                ", createdTimeStr='" + createdTimeStr + '\'' +
                ", latestUpdateTimeStr='" + latestUpdateTimeStr + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", realName='" + realName + '\'' +
                ", productChannleName='" + productChannleName + '\'' +
                ", shopRate='" + shopRate + '\'' +
                ", salePropList=" + salePropList +
                ", c1='" + c1 + '\'' +
                ", c2='" + c2 + '\'' +
                ", c3='" + c3 + '\'' +
                ", c4='" + c4 + '\'' +
                ", c5='" + c5 + '\'' +
                ", tradeType='" + tradeType + '\'' +
                ", saleProps=" + saleProps +
                ", curOrderNo='" + curOrderNo + '\'' +
                ", buyerMessage='" + buyerMessage + '\'' +
                ", skuPropertiesName='" + skuPropertiesName + '\'' +
                ", zfigrNum='" + zfigrNum + '\'' +
                ", verificationPrice=" + verificationPrice +
                ", posId='" + posId + '\'' +
                ", omsToPosId=" + omsToPosId +
                ", guideInfo='" + guideInfo + '\'' +
                ", negativeStock=" + negativeStock +
                ", cashAmount=" + cashAmount +
                ", supplierCode='" + supplierCode + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", downType='" + downType + '\'' +
                ", costPrice=" + costPrice +
                ", c6=" + c6 +
                ", c7=" + c7 +
                ", c8='" + c8 + '\'' +
                ", c9='" + c9 + '\'' +
                ", c10='" + c10 + '\'' +
                ", kzType='" + kzType + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}

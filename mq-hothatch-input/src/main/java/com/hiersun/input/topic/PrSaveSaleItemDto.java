package com.hiersun.input.topic;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PrSaveSaleItemDto {

	private Long sid;

    private String salesItemNo;

    private String orderNo;
 
    private String saleNo;

    private String skuNo;

    private String spuNo;

    private String supplyProductNo;

    private String erpProductNo;

    private String supplyInnerProdNo;

    private String unit;

    private String brandNo;

    private String brandName;

    private String barcode;

    private String colorNo;

    private String sizeNo;

    private String colorName;

    private String sizeName;

    private String managerCateNo;

    private String statisticsCateNo;

    private BigDecimal standPrice;

    private BigDecimal salePrice;

    private String priceType;

    private Integer saleSum;

    private BigDecimal paymentAmount;
    
    private BigDecimal totalDiscount; //商品优惠金额

    private String shippingAttribute;

    private String isGift;

    private BigDecimal shippingFeeSplit;

    private Integer stockoutAmount;

    private String hasReturned;

    private String deleteFlag;

    private String cashIncomeFlag;

    private Date createdTime;

    private Date latestUpdateTime;

    private String latestUpdateMan;

    private Integer refundNum;

    private Integer pickSum;

    private String discountCode;
    
    private Integer rowNo;
    
    private String productClass;
    
    private String productType;
    
    private BigDecimal incomeAmount;
    
    private BigDecimal tax;
    
    private String shoppeProName;
    
    private String stockMode;//库存方式
    
    private String businessMode;//经营方式
    
    private String discountLimit;//折扣底限
	
	private String shoppeGroup;//柜组
	
	private Integer codeType;//大码类型：0  价格码,1 长期统码,2 促销统码,3 特卖统码,4 扣率码,5 促销扣率码,6 单品码
	
	private BigDecimal bankServiceCharge;
	
	private String materialNum;//货号
	
	private Date libraryOutTime; //出库时间
	
	private String oid;

	private List<PrPromotionSplitDto> promotionSplitDto;

	private List<PrOrderGetSplitDto> prOrderGetSplitDto;
	
	private List<PrPaymentsSplitDto> prPaymentsSplitDto;
	
	private String identityCard;

	private String realName; //真实姓名
	
	private String productChannleName;//渠道商品名称
	
	private String shopRate; //门店扣率

	private String attribute1;//商品刻字

	private String attribute2;//刻字字体

	private String attribute5;//产品系列
	private String url;//产品图片

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getShopRate() {
		return shopRate;
	}

	public void setShopRate(String shopRate) {
		this.shopRate = shopRate;
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

	public Integer getRowNo() {
		return rowNo;
	}

	public void setRowNo(Integer rowNo) {
		this.rowNo = rowNo;
	}

	public String getSupplyProductNo() {
		return supplyProductNo;
	}

	public void setSupplyProductNo(String supplyProductNo) {
		this.supplyProductNo = supplyProductNo;
	}

	public String getErpProductNo() {
		return erpProductNo;
	}

	public void setErpProductNo(String erpProductNo) {
		this.erpProductNo = erpProductNo;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getSaleSum() {
		return saleSum;
	}

	public void setSaleSum(Integer saleSum) {
		this.saleSum = saleSum;
	}

	public String getIsGift() {
		return isGift;
	}

	public void setIsGift(String isGift) {
		this.isGift = isGift;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getSkuNo() {
		return skuNo;
	}

	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

	public String getSpuNo() {
		return spuNo;
	}

	public void setSpuNo(String spuNo) {
		this.spuNo = spuNo;
	}

	public String getSupplyInnerProdNo() {
		return supplyInnerProdNo;
	}

	public void setSupplyInnerProdNo(String supplyInnerProdNo) {
		this.supplyInnerProdNo = supplyInnerProdNo;
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

	public String getManagerCateNo() {
		return managerCateNo;
	}

	public void setManagerCateNo(String managerCateNo) {
		this.managerCateNo = managerCateNo;
	}

	public String getStatisticsCateNo() {
		return statisticsCateNo;
	}

	public void setStatisticsCateNo(String statisticsCateNo) {
		this.statisticsCateNo = statisticsCateNo;
	}

	public BigDecimal getStandPrice() {
		return standPrice;
	}

	public void setStandPrice(BigDecimal standPrice) {
		this.standPrice = standPrice;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getShippingAttribute() {
		return shippingAttribute;
	}

	public void setShippingAttribute(String shippingAttribute) {
		this.shippingAttribute = shippingAttribute;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getSalesItemNo() {
		return salesItemNo;
	}

	public void setSalesItemNo(String salesItemNo) {
		this.salesItemNo = salesItemNo;
	}

	public List<PrPromotionSplitDto> getPromotionSplitDto() {
		return promotionSplitDto;
	}

	public void setPromotionSplitDto(List<PrPromotionSplitDto> promotionSplitDto) {
		this.promotionSplitDto = promotionSplitDto;
	}

	public List<PrOrderGetSplitDto> getPrOrderGetSplitDto() {
		return prOrderGetSplitDto;
	}

	public void setPrOrderGetSplitDto(
			List<PrOrderGetSplitDto> prOrderGetSplitDto) {
		this.prOrderGetSplitDto = prOrderGetSplitDto;
	}

	public String getProductClass() {
		return productClass;
	}

	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(BigDecimal incomeAmount) {
		this.incomeAmount = incomeAmount;
	}


	public String getSaleNo() {
		return saleNo;
	}

	public void setSaleNo(String saleNo) {
		this.saleNo = saleNo;
	}

	public BigDecimal getShippingFeeSplit() {
		return shippingFeeSplit;
	}

	public void setShippingFeeSplit(BigDecimal shippingFeeSplit) {
		this.shippingFeeSplit = shippingFeeSplit;
	}

	public Integer getStockoutAmount() {
		return stockoutAmount;
	}

	public void setStockoutAmount(Integer stockoutAmount) {
		this.stockoutAmount = stockoutAmount;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
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

	public Integer getRefundNum() {
		return refundNum;
	}

	public void setRefundNum(Integer refundNum) {
		this.refundNum = refundNum;
	}

	public Integer getPickSum() {
		return pickSum;
	}

	public void setPickSum(Integer pickSum) {
		this.pickSum = pickSum;
	}

	public String getHasReturned() {
		return hasReturned;
	}

	public void setHasReturned(String hasReturned) {
		this.hasReturned = hasReturned;
	}

	public String getShoppeProName() {
		return shoppeProName;
	}

	public void setShoppeProName(String shoppeProName) {
		this.shoppeProName = shoppeProName;
	}

	public List<PrPaymentsSplitDto> getPrPaymentsSplitDto() {
		return prPaymentsSplitDto;
	}

	public void setPrPaymentsSplitDto(List<PrPaymentsSplitDto> prPaymentsSplitDto) {
		this.prPaymentsSplitDto = prPaymentsSplitDto;
	}

	public String getStockMode() {
		return stockMode;
	}

	public void setStockMode(String stockMode) {
		this.stockMode = stockMode;
	}

	public String getBusinessMode() {
		return businessMode;
	}

	public void setBusinessMode(String businessMode) {
		this.businessMode = businessMode;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public String getDiscountLimit() {
		return discountLimit;
	}

	public void setDiscountLimit(String discountLimit) {
		this.discountLimit = discountLimit;
	}

	public String getShoppeGroup() {
		return shoppeGroup;
	}

	public void setShoppeGroup(String shoppeGroup) {
		this.shoppeGroup = shoppeGroup;
	}

	public Integer getCodeType() {
		return codeType;
	}

	public void setCodeType(Integer codeType) {
		this.codeType = codeType;
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

	public Date getLibraryOutTime() {
		return libraryOutTime;
	}

	public void setLibraryOutTime(Date libraryOutTime) {
		this.libraryOutTime = libraryOutTime;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getProductChannleName() {
		return productChannleName;
	}

	public void setProductChannleName(String productChannleName) {
		this.productChannleName = productChannleName;
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	@Override
	public String toString() {
		return "PrSaveSaleItemDto{" +
				"sid=" + sid +
				", salesItemNo='" + salesItemNo + '\'' +
				", orderNo='" + orderNo + '\'' +
				", saleNo='" + saleNo + '\'' +
				", skuNo='" + skuNo + '\'' +
				", spuNo='" + spuNo + '\'' +
				", supplyProductNo='" + supplyProductNo + '\'' +
				", erpProductNo='" + erpProductNo + '\'' +
				", supplyInnerProdNo='" + supplyInnerProdNo + '\'' +
				", unit='" + unit + '\'' +
				", brandNo='" + brandNo + '\'' +
				", brandName='" + brandName + '\'' +
				", barcode='" + barcode + '\'' +
				", colorNo='" + colorNo + '\'' +
				", sizeNo='" + sizeNo + '\'' +
				", colorName='" + colorName + '\'' +
				", sizeName='" + sizeName + '\'' +
				", managerCateNo='" + managerCateNo + '\'' +
				", statisticsCateNo='" + statisticsCateNo + '\'' +
				", standPrice=" + standPrice +
				", salePrice=" + salePrice +
				", priceType='" + priceType + '\'' +
				", saleSum=" + saleSum +
				", paymentAmount=" + paymentAmount +
				", totalDiscount=" + totalDiscount +
				", shippingAttribute='" + shippingAttribute + '\'' +
				", isGift='" + isGift + '\'' +
				", shippingFeeSplit=" + shippingFeeSplit +
				", stockoutAmount=" + stockoutAmount +
				", hasReturned='" + hasReturned + '\'' +
				", deleteFlag='" + deleteFlag + '\'' +
				", cashIncomeFlag='" + cashIncomeFlag + '\'' +
				", createdTime=" + createdTime +
				", latestUpdateTime=" + latestUpdateTime +
				", latestUpdateMan='" + latestUpdateMan + '\'' +
				", refundNum=" + refundNum +
				", pickSum=" + pickSum +
				", discountCode='" + discountCode + '\'' +
				", rowNo=" + rowNo +
				", productClass='" + productClass + '\'' +
				", productType='" + productType + '\'' +
				", incomeAmount=" + incomeAmount +
				", tax=" + tax +
				", shoppeProName='" + shoppeProName + '\'' +
				", stockMode='" + stockMode + '\'' +
				", businessMode='" + businessMode + '\'' +
				", discountLimit='" + discountLimit + '\'' +
				", shoppeGroup='" + shoppeGroup + '\'' +
				", codeType=" + codeType +
				", bankServiceCharge=" + bankServiceCharge +
				", materialNum='" + materialNum + '\'' +
				", libraryOutTime=" + libraryOutTime +
				", oid='" + oid + '\'' +
				", promotionSplitDto=" + promotionSplitDto +
				", prOrderGetSplitDto=" + prOrderGetSplitDto +
				", prPaymentsSplitDto=" + prPaymentsSplitDto +
				", identityCard='" + identityCard + '\'' +
				", realName='" + realName + '\'' +
				", productChannleName='" + productChannleName + '\'' +
				", shopRate='" + shopRate + '\'' +
				", attribute1='" + attribute1 + '\'' +
				", attribute2='" + attribute2 + '\'' +
				", attribute5='" + attribute5 + '\'' +
				'}';
	}
}

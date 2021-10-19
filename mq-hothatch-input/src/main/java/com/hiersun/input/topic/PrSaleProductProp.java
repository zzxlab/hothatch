package com.hiersun.input.topic;

public class PrSaleProductProp {
    private Long sid;

    private String orderItemNo;

    private String productcode;

    private String propsname;

    private String propscode;

    private String propsvalue;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getOrderItemNo() {
        return orderItemNo;
    }

    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo == null ? null : orderItemNo.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public String getPropsname() {
        return propsname;
    }

    public void setPropsname(String propsname) {
        this.propsname = propsname == null ? null : propsname.trim();
    }

    public String getPropscode() {
        return propscode;
    }

    public void setPropscode(String propscode) {
        this.propscode = propscode == null ? null : propscode.trim();
    }

    public String getPropsvalue() {
        return propsvalue;
    }

    public void setPropsvalue(String propsvalue) {
        this.propsvalue = propsvalue == null ? null : propsvalue.trim();
    }
}
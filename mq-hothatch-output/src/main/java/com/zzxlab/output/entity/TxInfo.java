package com.zzxlab.output.entity;

import java.io.Serializable;
import java.util.Date;

public class TxInfo implements Serializable {
    private Long sid;

    private String messageId;

    private Integer queueConfSid;

    private Integer status;

    private Date inTime;

    private Date outTime;

    private String systemNo;

    private String serviceNo;

    private Integer retryTimes;

    private Integer exchangeType;

    private Integer totalRetryTimes;

    private static final long serialVersionUID = 1L;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public Integer getQueueConfSid() {
        return queueConfSid;
    }

    public void setQueueConfSid(Integer queueConfSid) {
        this.queueConfSid = queueConfSid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getSystemNo() {
        return systemNo;
    }

    public void setSystemNo(String systemNo) {
        this.systemNo = systemNo == null ? null : systemNo.trim();
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String serviceNo) {
        this.serviceNo = serviceNo == null ? null : serviceNo.trim();
    }

    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public Integer getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(Integer exchangeType) {
        this.exchangeType = exchangeType;
    }

    public Integer getTotalRetryTimes() {
        return totalRetryTimes;
    }

    public void setTotalRetryTimes(Integer totalRetryTimes) {
        this.totalRetryTimes = totalRetryTimes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", messageId=").append(messageId);
        sb.append(", queueConfSid=").append(queueConfSid);
        sb.append(", status=").append(status);
        sb.append(", inTime=").append(inTime);
        sb.append(", outTime=").append(outTime);
        sb.append(", systemNo=").append(systemNo);
        sb.append(", serviceNo=").append(serviceNo);
        sb.append(", retryTimes=").append(retryTimes);
        sb.append(", exchangeType=").append(exchangeType);
        sb.append(", totalRetryTimes=").append(totalRetryTimes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
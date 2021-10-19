package com.hiersun.input.topic;

import java.util.List;

public class MqMessage<T> {
    private List<T> data;
    private String source; //请求服务编号
    private String target; //响应服务编号
    private String timestamp; //毫秒数，如果不传输，将以接收时间为准
    private String dest; //目标URL
    private String callback; //回调地址
    private Integer type; //出队方式：0 POST，1 WS(SOAP)，2 service，默认为0
    private Integer exchange; //出队数据：0 全数据传输，1 data数据传输，默认为0
    private String mid;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getExchange() {
        return exchange;
    }

    public void setExchange(Integer exchange) {
        this.exchange = exchange;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "MqMessage{" +
                "data=" + data +
                ", source='" + source + '\'' +
                ", target='" + target + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", dest='" + dest + '\'' +
                ", callback='" + callback + '\'' +
                ", type=" + type +
                ", exchange=" + exchange +
                ", mid='" + mid + '\'' +
                '}';
    }
}

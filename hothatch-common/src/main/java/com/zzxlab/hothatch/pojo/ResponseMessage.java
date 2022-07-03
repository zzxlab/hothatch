package com.zzxlab.hothatch.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResponseMessage {
    private int statusCode;
    private String callResult;
    private Map<String, List<String>> header = new HashMap<>();
    private String messageId;

    public int getStatusCode() {
        return statusCode;
    }

    public ResponseMessage setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getCallResult() {
        return callResult;
    }

    public ResponseMessage setCallResult(String callResult) {
        this.callResult = callResult;
        return this;
    }

    public Map<String, List<String>> getHeader() {
        return header;
    }

    public ResponseMessage setHeader(Map<String, List<String>> header) {
        this.header = header;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public ResponseMessage setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                ", statusCode=" + statusCode +
                ", callResult='" + (callResult.length() > 100 ? callResult.substring(0, 100) : callResult) + '\'' +
                ", header=" + header +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}

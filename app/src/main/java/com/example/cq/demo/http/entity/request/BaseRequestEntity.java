package com.example.cq.demo.http.entity.request;


import com.example.cq.demo.http.entity.Entity;

public class BaseRequestEntity<T> extends Entity {
//    请求信息
    private T data;
//    请求流水
    private String flowmark;
//    手机串码
    private String imei;
//    通讯令牌
    private String token;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getFlowmark() {
        return flowmark;
    }

    public void setFlowmark(String flowmark) {
        this.flowmark = flowmark;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

package com.example.cq.demo.http.entity.response;

import com.example.cq.demo.http.entity.Entity;

public class BaseResponseEntity extends Entity {

    private String state = "";
    private String flowmark ="";
    private String imei = "";
    private long serverMilis;

    public long getServerMilis() {
        return serverMilis;
    }

    public void setServerMilis(long serverMilis) {
        this.serverMilis = serverMilis;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getFlowmark() {
        return flowmark;
    }

    public void setFlowmark(String flowmark) {
        this.flowmark = flowmark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

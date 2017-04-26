package com.example.cq.demo.http;

public class RequestData<T> {

    private T data;
    private String flowmark;
    private String imei;
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

    private transient int page = -1;
    private transient int pageSize = -1;
    /*  请求路径 */
    private transient String httpUrls;
    /*  请求缓存key*/
    private transient String cacheKey;
    /*  请求超时时间*/
    private transient int timeOut = 10 * 1000;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getHttpUrls() {
        return httpUrls;
    }

    public void setHttpUrls(String httpUrls) {
        this.httpUrls = httpUrls;
    }

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }


}

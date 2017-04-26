package com.example.cq.demo.http;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.cq.demo.app.AppApplication;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by cq on 17-4-24.
 */

public class HttpHelper {
    public static HttpHelper httpHelper;

    public static HttpHelper getInstance(){
        if(httpHelper == null){
            httpHelper = new HttpHelper();
        }
        return httpHelper;
    }

    private <T> void sendRequest(final RequestData reqData, Class<T> respClass){
        Logger.getAnonymousLogger().info(reqData.getHttpUrls());

        Request request = new StringRequest(Request.Method.POST, reqData.getHttpUrls(),
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
            @Override
            public byte[] getBody() throws AuthFailureError {
                return super.getBody();
            }
//          设置请求参数编码格式,默认application/x-www-form-urlencoded; charset=utf-8
            @Override
            public String getBodyContentType() {
                return super.getBodyContentType();
            }
//          设置请求头
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return super.getHeaders();
            }
        };
        AppApplication.getInstance().getRequestQueue().add(request);
    }

}

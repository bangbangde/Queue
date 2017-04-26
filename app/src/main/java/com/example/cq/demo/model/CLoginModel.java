package com.example.cq.demo.model;

import android.os.Handler;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.cq.demo.app.AppApplication;
import com.example.cq.demo.http.GsonRequest;
import com.example.cq.demo.http.Urls;
import com.example.cq.demo.http.entity.listener.OnLoginListener;
import com.example.cq.demo.http.entity.response.LoginResponse;
import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by cq on 17-4-25.
 */

public class CLoginModel implements ILoginModel{

    @Override
    public void login(Map<String, String> params, final OnLoginListener listener) {
        final GsonRequest<LoginResponse> request = new GsonRequest<>(Request.Method.POST, Urls.getLogin(), LoginResponse.class, new Gson().toJson(params),
                new Response.Listener<LoginResponse>() {
                    @Override
                    public void onResponse(LoginResponse response) {
                        listener.onSuccess(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError(error.getMessage());
                    }
                });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                AppApplication.getInstance().getRequestQueue().add(request);
            }
        },5000L);

    }
}

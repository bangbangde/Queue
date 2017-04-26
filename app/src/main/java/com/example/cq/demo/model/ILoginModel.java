package com.example.cq.demo.model;

import com.example.cq.demo.http.entity.listener.OnLoginListener;

import java.util.Map;

/**
 * Created by cq on 17-4-25.
 */

public interface ILoginModel {
    void login(Map<String,String> params, OnLoginListener listener);
}

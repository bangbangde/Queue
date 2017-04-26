package com.example.cq.demo.http.entity.listener;

import com.example.cq.demo.http.entity.response.LoginResponse;

/**
 * Created by cq on 17-4-25.
 */

public interface OnLoginListener {
    void onSuccess(LoginResponse loginResponse);
    void onError(String error);
}

package com.example.cq.demo.http;

import android.text.TextUtils;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonRequest;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;

/**
 * Created by cq on 17-4-25.
 */

public class GsonRequest<T> extends JsonRequest<T> {

    private Gson gson;
    private Class<T> clazz;

//    content-type:application/json; 所以消息主体直接放json字符串
    public GsonRequest(int method, String url, Class<T> clazz, String requestBody, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        super(method, url, requestBody, listener, errorListener);
        gson = new Gson();
        this.clazz = clazz;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String jsonString = new String(response.data,
                    HttpHeaderParser.parseCharset(response.headers));
            if (TextUtils.isEmpty(jsonString)) {
                VolleyError v_error = new VolleyError("网络异常");
                return Response.error(v_error);
            }

            try {
                T entity = gson.fromJson(jsonString, clazz);
                return Response.success(entity,HttpHeaderParser.parseCacheHeaders(response));
            } catch (Exception e) {
                e.printStackTrace();
                return Response.error(new ParseError(e));
            }

        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (Exception e) {
            return Response.error(new ParseError(e));
        }
    }

}

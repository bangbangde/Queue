package com.example.cq.demo.http;

/**
 * Created by cq on 17-4-25.
 */

public class Urls {
    public static boolean isDebug = true;

    public static final String BASE_URL_DEBUG = "http://192.168.1.100/queue";
    public static final String BASE_URL = "http://192.168.1.100/queue";
    public static final String LOGIN = "login";

    public static String getAddress(){
        if(isDebug){
            return BASE_URL_DEBUG;
        }else{
            return BASE_URL;
        }
    }

    public static String getLogin(){
        return getAddress()+LOGIN;
    }

}

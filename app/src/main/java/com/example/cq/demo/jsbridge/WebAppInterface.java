package com.example.cq.demo.jsbridge;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by cq on 17-4-26.
 */

public class WebAppInterface {
    Context context;
    public WebAppInterface(Context context){
        this.context = context;
    }

    @JavascriptInterface
    public void toast(String toast){
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }
}

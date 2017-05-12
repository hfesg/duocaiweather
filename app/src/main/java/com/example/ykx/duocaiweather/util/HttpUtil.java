package com.example.ykx.duocaiweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by YKX on 2017/5/10.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);      //enqueue方法中帮我们打开了一个子线程
    }
}

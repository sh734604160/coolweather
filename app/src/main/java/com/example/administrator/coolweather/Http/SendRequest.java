package com.example.administrator.coolweather.Http;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/9/16.
 */

public class SendRequest {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        //调用call.execute()将直接执行网络请求，阻塞直到获得响应。
        //而调用call.enqueue()传入回调，则会将Call放入一个异步执行队列，由ExecutorService在后台执行
        client.newCall(request).enqueue(callback);
    }
}

package com.example.mdd.mytestproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.example.mdd.mytestproject.Interface.LoggingInterceptor;
import com.example.mdd.mytestproject.Interface.PostRequest_Interface;
import com.example.mdd.mytestproject.Interface.Translation;

import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class NetWorkActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.network_layout);

    }

    public void PostPress(View view) {

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl("http://10.100.161.111:8080/adviser/")
                //增加返回值为String的支持
                .addConverterFactory(ScalarsConverterFactory.create())
                //增加返回值为Gson的支持(以实体类返回)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

//        PostRequest_Interface requestSerives = retrofit.create(PostRequest_Interface.class);//这里采用的是Java的动态代理模式
//        Call<Translation> call = requestSerives.login("00004293","Z3FpLjIwMTg=","ios_enterprise","12345","3.0.1","3.0.1");//传入我们请求的键值对的值
//
//        call.enqueue(new Callback<Translation>() {
//            @Override
//            public void onResponse(Call<Translation> call, Response<Translation> response) {
//                Log.e("==== 成功",response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<Translation> call, Throwable t) {
//                Log.e("===","失败");
//            }
//        });

        Map<String, String> map = new HashMap<String, String>();

        // 创建元素并添加到集合
        map.put("device", "ios_enterprise");
        map.put("password", "Z3FpLjIwMTg=");
        map.put("registrationId", "12345");
        map.put("userName", "00004293");
        map.put("ver", "3.0.1");
        map.put("version", "3.0.1");



        PostRequest_Interface requestSerives = retrofit.create(PostRequest_Interface.class);//这里采用的是Java的动态代理模式
        Call<Translation> call = requestSerives.login2(map);
        call.enqueue(new Callback<Translation>() {
            @Override
            public void onResponse(Call<Translation> call, Response<Translation> response) {
                Log.e("==== 成功",response.body().toString());
            }

            @Override
            public void onFailure(Call<Translation> call, Throwable t) {
                Log.e("===","失败");
            }
        });
    }
}

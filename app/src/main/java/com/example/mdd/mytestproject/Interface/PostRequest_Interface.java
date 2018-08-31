package com.example.mdd.mytestproject.Interface;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface PostRequest_Interface {

    @POST("loginAppSystem")
    Call<Translation> login(@Query("userName") String userName,
                            @Query("password") String password,
                            @Query("device") String device,
                            @Query("registrationId") String registrationId,
                            @Query("ver") String ver,
                            @Query("version") String version);

    @POST("loginAppSystem")
    Call<Translation> login1(@QueryMap Map<String,String> map);

    @HTTP(method = "POST",path = "loginAppSystem",hasBody = true)
    Call<Translation> login2(@QueryMap Map<String,String> map);

}

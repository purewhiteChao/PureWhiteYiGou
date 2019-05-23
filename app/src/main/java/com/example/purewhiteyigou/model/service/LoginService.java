package com.example.purewhiteyigou.model.service;

import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/23 0023
 * Time: 9:18
 * Describe: ${as}
 */
public interface LoginService {

    @FormUrlEncoded
    @POST("createUserKey")
    Observable<ResponseBody> postUserKey(@Field("appId") String appid,@Field("passwd")String passwd);

    @FormUrlEncoded
    @POST("login")
    Observable<ResponseBody> postLogin(@Field("key")String key,@Field("phone")String phone,@Field("passwd")String passwd);

    @FormUrlEncoded
    @POST("createUser")
    Observable<ResponseBody> postRegister(@Field("key")String key,@Field("phone")String phone,@Field("passwd")String passwd,@Field("name")String name);
}

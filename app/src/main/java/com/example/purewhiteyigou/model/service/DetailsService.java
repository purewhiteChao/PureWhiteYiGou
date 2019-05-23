package com.example.purewhiteyigou.model.service;

import com.example.purewhiteyigou.model.bean.DetailsBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/22 0022
 * Time: 20:51
 * Describe: ${as}
 */
public interface DetailsService {

    @GET("app/tk/v2/getGoodsDetailSingle")
    Observable<DetailsBean> getDetail(@Query("goods_id") long goods_id);
}

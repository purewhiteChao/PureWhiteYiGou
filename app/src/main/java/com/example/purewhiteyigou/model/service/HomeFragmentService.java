package com.example.purewhiteyigou.model.service;

import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 17:56
 * Describe: ${as}
 */
public interface HomeFragmentService {
    @GET("app/tk/v2/getIndex")
    Observable<BannerBean> getBanner();

    @GET("app/tk/v2/getGoodsHomePageOpt")
    Observable<TablayoutBean> getTablayout();

    @GET("app/tk/v2/getChaoJiBaoKuanMore")
    Observable<BaoKuanBean> getBaoKuan();

    @GET("app/getCsTheme")
    Observable<GifBean> getGif();

    @GET("app/tk/v2/getGoodsHomePagSearch")
    Observable<RecyclerBean> getRecycler(@Query("page") String page, @Query("opt_id") String id);

    @GET("app/tk/v2/getGoodsSearch")
    Observable<SearchBean> getSearch(@Query("keyword")String keyword);
}

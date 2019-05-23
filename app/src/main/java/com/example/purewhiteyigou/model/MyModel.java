package com.example.purewhiteyigou.model;

import android.icu.util.ULocale;

import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.DetailsBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.model.service.DetailsService;
import com.example.purewhiteyigou.model.service.HomeFragmentService;
import com.example.purewhiteyigou.model.service.LoginService;
import com.example.purewhiteyigou.model.uri.URLs;
import com.example.purewhiteyigou.utils.RetrofitHelper;

import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 18:03
 * Describe: ${as}
 */
public class MyModel {
    public Observable<BannerBean> getBanner(){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        HomeFragmentService homeFragmentService = retrofit.create(HomeFragmentService.class);
        Observable<BannerBean> banner = homeFragmentService.getBanner();
        return banner;
    }
    public Observable<TablayoutBean> getTablayout(){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        HomeFragmentService homeFragmentService = retrofit.create(HomeFragmentService.class);
        Observable<TablayoutBean> tablayout = homeFragmentService.getTablayout();
        return tablayout;
    }
    public Observable<BaoKuanBean> getBaoKuan(){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        HomeFragmentService homeFragmentService = retrofit.create(HomeFragmentService.class);
        Observable<BaoKuanBean> baoKuan = homeFragmentService.getBaoKuan();
        return baoKuan;
    }

    public Observable<GifBean> getGif(){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        HomeFragmentService homeFragmentService = retrofit.create(HomeFragmentService.class);
        Observable<GifBean> gif = homeFragmentService.getGif();
        return gif;
    }

    public Observable<RecyclerBean> getRecycler(String page,String id){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        HomeFragmentService homeFragmentService = retrofit.create(HomeFragmentService.class);
        Observable<RecyclerBean> recycler = homeFragmentService.getRecycler(page, id);
        return recycler;
    }

    public Observable<SearchBean> getSearch(String key){

        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        HomeFragmentService homeFragmentService = retrofit.create(HomeFragmentService.class);
        Observable<SearchBean> search = homeFragmentService.getSearch(key);
        return search;
    }
    
    public Observable<DetailsBean> getDetails(long goods_id){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.urls);
        DetailsService detailsService = retrofit.create(DetailsService.class);
        Observable<DetailsBean> detail = detailsService.getDetail(goods_id);
        return detail;
    }

    public Observable<ResponseBody> postUserKey(String key,String pwd){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.loginUrl);
        LoginService loginService = retrofit.create(LoginService.class);
        Observable<ResponseBody> responseBodyObservable = loginService.postUserKey(key, pwd);
        return responseBodyObservable;
    }

    public Observable<ResponseBody> postLogin(String phone,String pwd,String appkey){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.loginUrl);
        LoginService loginService = retrofit.create(LoginService.class);
        Observable<ResponseBody> responseBodyObservable = loginService.postLogin(appkey, phone, pwd);
        return responseBodyObservable;
    }

    public Observable<ResponseBody> postRegisget(String appkey,String phone,String pwd,String name){
        Retrofit retrofit = RetrofitHelper.getInstance().initRetrofit(URLs.loginUrl);
        LoginService loginService = retrofit.create(LoginService.class);
        Observable<ResponseBody> responseBodyObservable = loginService.postRegister(appkey, phone, pwd, name);
        return responseBodyObservable;
    }

}

package com.example.purewhiteyigou.presenter.home;

import android.util.Log;

import com.example.purewhiteyigou.base.BasePresenter;
import com.example.purewhiteyigou.model.MyModel;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 15:10
 * Describe: ${as}
 */
public class HomePresenter extends BasePresenter<HomeView> {

    private MyModel myModel;
    public HomePresenter(){
        myModel = new MyModel();
    }
    public void getBanner(){
        Observable<BannerBean> banner = myModel.getBanner();
        banner.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                        Log.i("guochao","HomeFragmentBannerOnError:"+e.getMessage());
                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {

                        if(isAttach()){

                            getView().successBanner(bannerBean);
                        }

                    }
                });
    }

    public void getGif(){
        Observable<GifBean> gif = myModel.getGif();
        gif.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GifBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","HomeFragmentGifOnError:"+e.getMessage());

                    }

                    @Override
                    public void onNext(GifBean gifBean) {

                        if(isAttach()){
                            getView().successGif(gifBean);
                        }

                    }
                });

    }
    public void getBaoKuan(){
        Observable<BaoKuanBean> baoKuan = myModel.getBaoKuan();
        baoKuan.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaoKuanBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","HomeFragmentBaoKuanOnError:"+e.getMessage());

                    }

                    @Override
                    public void onNext(BaoKuanBean baoKuanBean) {

                        if(isAttach()){
                            getView().successBaoKuan(baoKuanBean);
                        }
                    }
                });
    }

    public void getTabLayout(){
        Observable<TablayoutBean> tablayout = myModel.getTablayout();
        tablayout.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TablayoutBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","HomeFragmentTabLayoutOnError:"+e.getMessage());

                    }

                    @Override
                    public void onNext(TablayoutBean tablayoutBean) {

                        if(isAttach()){
                            getView().successTabLayout(tablayoutBean);
                        }
                    }
                });
    }
    public void getRecycler(int page,int id){
        Observable<RecyclerBean> recycler = myModel.getRecycler(page + "", id + "");
        recycler.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecyclerBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","HomeFragmentRecylerOnError:"+e.getMessage());

                    }

                    @Override
                    public void onNext(RecyclerBean bean) {

                        if(isAttach()){
                            getView().successRecycler(bean);
                        }
                    }
                });
    }

    public void getSearch(String key){
        final Observable<SearchBean> search = myModel.getSearch(key);
        search.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("guochao","HomeFragmentSearchOnError:"+e.getMessage());

                    }

                    @Override
                    public void onNext(SearchBean searchBean) {

                        List<SearchBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = searchBean.getEntity().getGoods_search_response().getGoods_list();
                        if(isAttach()){
                            getView().successSearch(goods_list);
                        }
                    }
                });
    }
}

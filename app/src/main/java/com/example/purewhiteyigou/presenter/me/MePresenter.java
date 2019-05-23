package com.example.purewhiteyigou.presenter.me;

import com.example.purewhiteyigou.base.BasePresenter;
import com.example.purewhiteyigou.model.MyModel;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/20 0020
 * Time: 11:36
 * Describe: ${as}
 */
public class MePresenter extends BasePresenter<MeView> {

    private MyModel myModel;
    public MePresenter(){
        myModel = new MyModel();
    }
    public void getPicture(){
        Observable<BannerBean> banner = myModel.getBanner();
        banner.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BannerBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(BannerBean bannerBean) {

                        if(isAttach()){
                            getView().getPicture(bannerBean);
                        }
                    }
                });
    }

    public void getRecyclier(){
        Observable<BaoKuanBean> baoKuan = myModel.getBaoKuan();
        baoKuan.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaoKuanBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(BaoKuanBean baoKuanBean) {

                        getView().getRecyclerView(baoKuanBean);
                    }
                });
    }
}

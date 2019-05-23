package com.example.purewhiteyigou.presenter.details;

import android.util.Log;

import com.example.purewhiteyigou.MyApp;
import com.example.purewhiteyigou.base.BasePresenter;
import com.example.purewhiteyigou.model.MyModel;
import com.example.purewhiteyigou.model.bean.DetailsBean;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/22 0022
 * Time: 20:32
 * Describe: ${as}
 */
public class DetailsPresenter extends BasePresenter<DetailsView> {

    public void getDetails(long goods_id){
        final Observable<DetailsBean> details = new MyModel().getDetails(goods_id);
        details.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DetailsBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                        Log.i("guochao","DetailPresenterOnError"+e.getMessage());
                    }

                    @Override
                    public void onNext(DetailsBean detailsBean) {

                        DetailsBean.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean goodsDetailsBean = detailsBean.getEntity().getGoods_detail_response().getGoods_details().get(0);
                        if(isAttach()){
                            getView().success(goodsDetailsBean);
                        }
                    }
                });
    }
}

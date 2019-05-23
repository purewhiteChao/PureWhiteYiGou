package com.example.purewhiteyigou.presenter.classify;

import com.example.purewhiteyigou.base.BasePresenter;
import com.example.purewhiteyigou.model.MyModel;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;

import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/17 0017
 * Time: 10:39
 * Describe: ${as}
 */
public class ClassifyPresenter extends BasePresenter<ClassifyView> {
    private MyModel myModel;
    public ClassifyPresenter(){
        myModel = new MyModel();
    }

    public void getTitle(){
        Observable<TablayoutBean> tablayout = myModel.getTablayout();
        tablayout.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TablayoutBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(TablayoutBean bean) {

                        List<TablayoutBean.EntityBean.GoodsOptListBean> goods_opt_list =bean.getEntity().getGoods_opt_list();
                        if(isAttach()){
                            getView().getTitle(goods_opt_list);
                        }
                    }
                });
    }
    public void getContent(int page,int id){
        Observable<RecyclerBean> recycler = myModel.getRecycler(page + "", id + "");
        recycler.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecyclerBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(RecyclerBean bean) {

                        List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = bean.getEntity().getGoods_search_response().getGoods_list();
                        if(isAttach()){
                            getView().getContent(goods_list);
                        }
                    }
                });
    }
}

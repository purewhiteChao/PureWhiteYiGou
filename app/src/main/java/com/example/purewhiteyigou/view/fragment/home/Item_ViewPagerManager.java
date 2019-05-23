package com.example.purewhiteyigou.view.fragment.home;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_item_ViewPager;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.presenter.home.HomePresenter;
import com.example.purewhiteyigou.presenter.home.HomeView;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/16 0016
 * Time: 14:49
 * Describe: ${as}
 */
public class Item_ViewPagerManager implements HomeView {
    public View view;
    public Context context;
    private RecyclerView recyclerView;
    private HomePresenter presenter;
    RecyclerAdapter_item_ViewPager adapter;
    private int id;

    public Item_ViewPagerManager(View view,Context context,int id){
        this.view = view;
        this.context = context;
        this.id = id;
        presenter = new HomePresenter();
        presenter.attachView(this);
    }
    public void init(){
        recyclerView = view.findViewById(R.id.recycler_view_viewpager);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(manager);
        adapter = new RecyclerAdapter_item_ViewPager();
        recyclerView.setAdapter(adapter);
    }
    public void initData(){

        presenter.getRecycler(1,id);
    }

    @Override
    public void successBanner(BannerBean bannerBean) {

    }

    @Override
    public void successGif(GifBean bean) {

    }

    @Override
    public void successBaoKuan(BaoKuanBean bean) {

//        List<BaoKuanBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = bean.getEntity().getGoods_search_response().getGoods_list();
//        adapter.refresh(goods_list);
    }

    @Override
    public void successTabLayout(TablayoutBean bean) {

    }

    @Override
    public void successRecycler(RecyclerBean bean) {
        List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = bean.getEntity().getGoods_search_response().getGoods_list();
        adapter.refresh(goods_list);
    }

    @Override
    public void successSearch(List<SearchBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list) {

    }

    @Override
    public void success(String data) {

    }

    @Override
    public void failess(String message) {

    }
}

package com.example.purewhiteyigou.view.fragment.college;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_college;
import com.example.purewhiteyigou.base.BaseMVPFragment;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.model.uri.URLs;
import com.example.purewhiteyigou.presenter.home.HomePresenter;
import com.example.purewhiteyigou.presenter.home.HomeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/18 0018
 * Time: 9:43
 * Describe: ${as}
 */
public class CollegeFragment extends BaseMVPFragment<HomePresenter, HomeView, String> implements HomeView {
    @BindView(R.id.image_college)
    ImageView imageCollege;
    @BindView(R.id.recycler_college)
    RecyclerView recyclerCollege;
    RecyclerAdapter_college adapter;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    private void initData() {
        presenter.getBanner();
    }

    private void initView() {
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerCollege.setLayoutManager(manager);
        adapter = new RecyclerAdapter_college();
        recyclerCollege.setAdapter(adapter);
    }

    @Override
    protected HomePresenter getPresenter() {
        return new HomePresenter();
    }

    @Override
    public int getContextView() {
        return R.layout.fragment_college;
    }

    @Override
    public void successBanner(BannerBean bannerBean) {

        Glide.with(this).load(URLs.urls+bannerBean.getEntity().getWebsiteImages().getAppArticleAdvertising().get(0).getImagesUrl()).into(imageCollege);
        List<BannerBean.EntityBean.HomeRecommendBean> homeRecommend = bannerBean.getEntity().getHomeRecommend();
        adapter.refresh(homeRecommend);
    }

    @Override
    public void successGif(GifBean bean) {

    }

    @Override
    public void successBaoKuan(BaoKuanBean bean) {

    }

    @Override
    public void successTabLayout(TablayoutBean bean) {

    }

    @Override
    public void successRecycler(RecyclerBean bean) {

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

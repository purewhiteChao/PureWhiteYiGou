package com.example.purewhiteyigou.view.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_HomeFragment;
import com.example.purewhiteyigou.base.BaseMVPFragment;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.presenter.home.HomePresenter;
import com.example.purewhiteyigou.presenter.home.HomeView;
import com.example.purewhiteyigou.view.activity.search.SearchActivity;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/14 0014
 * Time: 20:39
 * Describe: ${as}
 */
public class HomeFragment extends BaseMVPFragment<HomePresenter, HomeView,String> implements HomeView {


    @BindView(R.id.recycler_homefragment)
    RecyclerView recyclerHomefragment;
    @BindView(R.id.edittext_homefragment)
    EditText edittextHomefragment;
    @BindView(R.id.text_search_homefragment)
    TextView textSearchHomefragment;
    private RecyclerAdapter_HomeFragment adapter;
    private String s1;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initListener();
    }

    private void initListener() {
        edittextHomefragment.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode==KeyEvent.KEYCODE_ENTER&&event.getAction()==KeyEvent.ACTION_DOWN){
                    s1 = edittextHomefragment.getText().toString();
                    presenter.getSearch(s1);
                }
                return true;
            }
        });

    }

    private void initData() {
        presenter.getBanner();
        presenter.getGif();
        presenter.getBaoKuan();
        presenter.getTabLayout();
    }

    private void initView() {
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerHomefragment.setLayoutManager(manager);
        adapter = new RecyclerAdapter_HomeFragment();
        recyclerHomefragment.setAdapter(adapter);
    }

    @Override
    public int getContextView() {
        return R.layout.fragment_home;
    }


    @Override
    protected HomePresenter getPresenter() {
        return new HomePresenter();
    }


    @Override
    public void success(String data) {

    }

    @Override
    public void failess(String message) {

    }

    @Override
    public void successBanner(BannerBean bannerBean) {
        adapter.refreshBanner(bannerBean);
    }

    @Override
    public void successGif(GifBean bean) {
        adapter.refreshGif(bean);
    }

    @Override
    public void successBaoKuan(BaoKuanBean bean) {
        adapter.refreshBaoKuan(bean);
    }

    @Override
    public void successTabLayout(TablayoutBean bean) {
        adapter.refreshTabLayout(bean);
    }

    @Override
    public void successRecycler(RecyclerBean bean) {

    }

    @Override
    public void successSearch(List<SearchBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list) {
        Intent intent = new Intent(getActivity(), SearchActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("list", (Serializable) list);
        bundle.putString("title",s1);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}

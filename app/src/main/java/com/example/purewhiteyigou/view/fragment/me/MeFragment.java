package com.example.purewhiteyigou.view.fragment.me;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_item_Me;
import com.example.purewhiteyigou.base.BaseMVPFragment;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.uri.URLs;
import com.example.purewhiteyigou.presenter.me.MePresenter;
import com.example.purewhiteyigou.presenter.me.MeView;
import com.example.purewhiteyigou.view.activity.login.LoginAvtivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/20 0020
 * Time: 11:34
 * Describe: ${as}
 */
public class MeFragment extends BaseMVPFragment<MePresenter, MeView, String> implements MeView {

    @BindView(R.id.avater_me)
    ImageView avaterMe;
    @BindView(R.id.text_login_me)
    TextView textLoginMe;
    @BindView(R.id.image_chat_me)
    ImageView imageChatMe;
    @BindView(R.id.image_set_me)
    ImageView imageSetMe;
    @BindView(R.id.constrain_me)
    ConstraintLayout constrainMe;
    @BindView(R.id.text_gongju_me)
    TextView textGongjuMe;
    @BindView(R.id.text_taobaodingdan_me)
    TextView textTaobaodingdanMe;
    @BindView(R.id.text_pinduoduodingdan_me)
    TextView textPinduoduodingdanMe;
    @BindView(R.id.text_shequn_me)
    TextView textShequnMe;
    @BindView(R.id.text_collect_me)
    TextView textCollectMe;
    @BindView(R.id.text_callme_me)
    TextView textCallmeMe;
    @BindView(R.id.linear_me)
    LinearLayout linearMe;
    @BindView(R.id.images_me)
    ImageView imagesMe;
    @BindView(R.id.recycler_me)
    RecyclerView recyclerMe;
    RecyclerAdapter_item_Me adapter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initListener();

    }

    private void initListener() {
        textLoginMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginAvtivity.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        presenter.getPicture();
        presenter.getRecyclier();
    }

    private void initView() {
        GridLayoutManager manager = new GridLayoutManager(getContext(),3);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerMe.setLayoutManager(manager);
    }

    @Override
    protected MePresenter getPresenter() {
        return new MePresenter();
    }

    @Override
    public int getContextView() {
        return R.layout.fragment_me;
    }

    @Override
    public void success(String data) {

    }

    @Override
    public void failess(String message) {

    }

    @Override
    public void getPicture(BannerBean bannerBean) {

        String url = URLs.urls+bannerBean.getEntity().getWebsiteImages().getIndexBangDan().get(0).getImagesUrl();
        Glide.with(getContext()).load(url).into(imagesMe);
    }

    @Override
    public void getRecyclerView(BaoKuanBean baoKuanBean) {

        List<BaoKuanBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = baoKuanBean.getEntity().getGoods_search_response().getGoods_list();

        adapter = new RecyclerAdapter_item_Me(goods_list);
        recyclerMe.setAdapter(adapter);
    }

}

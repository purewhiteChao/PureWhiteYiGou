package com.example.purewhiteyigou.view.fragment.classify;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_goods_classify;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_left_classify;
import com.example.purewhiteyigou.base.BaseMVPFragment;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.presenter.classify.ClassifyPresenter;
import com.example.purewhiteyigou.presenter.classify.ClassifyView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/17 0017
 * Time: 10:39
 * Describe: ${as}
 */
public class ClassifyFragment extends BaseMVPFragment<ClassifyPresenter, ClassifyView, String> implements ClassifyView {


    @BindView(R.id.recyclerleft_classify)
    RecyclerView recyclerleftClassify;
    @BindView(R.id.image_classify)
    ImageView imageClassify;
    @BindView(R.id.recyclergood_classify)
    RecyclerView recyclergoodClassify;
    RecyclerAdapter_left_classify adapter_left;
    RecyclerAdapter_goods_classify adapter_goods;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initListener();
    }

    private void initListener() {

        adapter_left.setClick(new RecyclerAdapter_left_classify.OnClick() {
            @Override
            public void onCallBack(int id) {

                presenter.getContent(1,id);
            }
        });
    }

    private void initData() {
        presenter.getTitle();
    }

    private void initView() {

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerleftClassify.setLayoutManager(manager);
        GridLayoutManager manager1 = new GridLayoutManager(getContext(),3);
        manager1.setOrientation(LinearLayoutManager.VERTICAL);
        recyclergoodClassify.setLayoutManager(manager1);
        adapter_left = new RecyclerAdapter_left_classify();
        recyclerleftClassify.setAdapter(adapter_left);
        adapter_goods = new RecyclerAdapter_goods_classify();
        recyclergoodClassify.setAdapter(adapter_goods);
    }

    @Override
    protected ClassifyPresenter getPresenter() {
        return new ClassifyPresenter();
    }

    @Override
    public int getContextView() {
        return R.layout.fragment_classify;
    }

    @Override
    public void success(String data) {

    }

    @Override
    public void failess(String message) {

    }

    @Override
    public void getTitle(List<TablayoutBean.EntityBean.GoodsOptListBean> list) {

        adapter_left.refresh(list);
    }

    @Override
    public void getContent(List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list) {

        adapter_goods.refresh(list);
    }
}

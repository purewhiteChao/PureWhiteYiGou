package com.example.purewhiteyigou.presenter.classify;

import com.example.purewhiteyigou.base.BaseView;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/17 0017
 * Time: 10:40
 * Describe: ${as}
 */
public interface ClassifyView extends BaseView<String> {
    void getTitle(List<TablayoutBean.EntityBean.GoodsOptListBean> list);
    void getContent(List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list);
}

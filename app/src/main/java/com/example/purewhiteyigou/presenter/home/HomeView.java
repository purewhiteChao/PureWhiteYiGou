package com.example.purewhiteyigou.presenter.home;

import com.example.purewhiteyigou.base.BaseView;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.model.bean.SearchBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 15:11
 * Describe: ${as}
 */
public interface HomeView extends BaseView<String> {
    void successBanner(BannerBean bannerBean);
    void successGif(GifBean bean);
    void successBaoKuan(BaoKuanBean bean);
    void successTabLayout(TablayoutBean bean);
    void successRecycler(RecyclerBean bean);
    void successSearch(List<SearchBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list);
}

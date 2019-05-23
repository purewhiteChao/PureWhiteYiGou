package com.example.purewhiteyigou.presenter.me;

import com.example.purewhiteyigou.base.BaseView;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/20 0020
 * Time: 11:37
 * Describe: ${as}
 */
public interface MeView extends BaseView<String> {
    void getPicture(BannerBean bannerBean);
    void getRecyclerView(BaoKuanBean baoKuanBean);
}

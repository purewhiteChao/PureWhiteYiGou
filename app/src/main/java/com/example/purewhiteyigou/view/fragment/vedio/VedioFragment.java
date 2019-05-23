package com.example.purewhiteyigou.view.fragment.vedio;

import com.example.purewhiteyigou.base.BaseMVPFragment;
import com.example.purewhiteyigou.presenter.vedio.VedioPresenter;
import com.example.purewhiteyigou.presenter.vedio.VedioView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/21 0021
 * Time: 10:50
 * Describe: ${as}
 */
public class VedioFragment extends BaseMVPFragment<VedioPresenter, VedioView,String> implements VedioView {
    @Override
    protected VedioPresenter getPresenter() {
        return null;
    }

    @Override
    public int getContextView() {
        return 0;
    }

    @Override
    public void success(String data) {

    }

    @Override
    public void failess(String message) {

    }
}

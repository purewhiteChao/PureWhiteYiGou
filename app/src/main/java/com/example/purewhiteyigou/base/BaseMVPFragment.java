package com.example.purewhiteyigou.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/9 0009
 * Time: 21:36
 * Describe: ${as}
 */
public abstract class BaseMVPFragment<P extends BasePresenter,V extends BaseView,D> extends BaseFragment implements BaseView<D> {

    protected P presenter;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        presenter = getPresenter();
        presenter.attachView((V)this);
    }

    protected abstract P getPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.deachView();
    }
}

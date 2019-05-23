package com.example.purewhiteyigou.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/9 0009
 * Time: 19:51
 * Describe: ${as}
 */
public abstract class BaseActivity extends FragmentActivity {

    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        bind = ButterKnife.bind(this);
    }
    protected abstract int getContentView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}

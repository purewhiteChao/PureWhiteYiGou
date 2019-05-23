package com.example.purewhiteyigou.view.activity.forget;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/23 0023
 * Time: 10:13
 * Describe: ${as}
 */
public class ForgetAvtivity extends BaseActivity {

    @BindView(R.id.image_back_forget)
    ImageView imageBackForget;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initListener();
    }

    private void initListener() {

        imageBackForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ForgetAvtivity.this.finish();
            }
        });
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_forget;
    }

}

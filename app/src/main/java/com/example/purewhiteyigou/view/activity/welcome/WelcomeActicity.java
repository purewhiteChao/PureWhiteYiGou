package com.example.purewhiteyigou.view.activity.welcome;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.BaseActivity;
import com.example.purewhiteyigou.view.activity.MainActivity;
import com.example.purewhiteyigou.view.activity.guide.GuideActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/17 0017
 * Time: 11:47
 * Describe: ${as}
 */
public class WelcomeActicity extends BaseActivity {
    @BindView(R.id.image_welcomeactivity)
    ImageView imageWelcomeactivity;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent intent = new Intent(WelcomeActicity.this, GuideActivity.class);
            startActivity(intent);
            WelcomeActicity.this.finish();
        }
    };

    @Override
    protected int getContentView() {
        return R.layout.acticity_welcome;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }

        handler.sendEmptyMessageDelayed(100,1000);
    }
}

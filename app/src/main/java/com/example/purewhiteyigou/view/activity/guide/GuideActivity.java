package com.example.purewhiteyigou.view.activity.guide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.ViewPagerAdapter_guide;
import com.example.purewhiteyigou.base.BaseActivity;
import com.example.purewhiteyigou.view.activity.MainActivity;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/21 0021
 * Time: 19:50
 * Describe: ${as}
 */
public class GuideActivity extends BaseActivity {
    @BindView(R.id.viewpgaer_guide)
    ViewPager viewpgaerGuide;
    @BindView(R.id.constrain_guide)
    ConstraintLayout constrainGuide;
    ViewPagerAdapter_guide adapter;
    @BindView(R.id.button_skip_guide)
    Button buttonSkipGuide;
    @BindView(R.id.button_start_guide)
    Button buttonStartGuide;

    @Override
    protected int getContentView() {
        return R.layout.activity_guide;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }

        initView();
        initListener();
    }

    private void initListener() {
        viewpgaerGuide.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                switch (i){
                    case 0:
                        constrainGuide.setBackgroundResource(R.drawable.img_guide_one);
                        buttonSkipGuide.setVisibility(View.VISIBLE);
                        buttonStartGuide.setVisibility(View.GONE);
                        break;
                    case 1:
                        constrainGuide.setBackgroundResource(R.drawable.img_guide_two);
                        buttonSkipGuide.setVisibility(View.VISIBLE);
                        buttonStartGuide.setVisibility(View.GONE);
                        break;
                    case 2:
                        constrainGuide.setBackgroundResource(R.drawable.img_guide_three);
                        buttonSkipGuide.setVisibility(View.VISIBLE);
                        buttonStartGuide.setVisibility(View.GONE);
                        break;
                    case 3:
                        constrainGuide.setBackgroundResource(R.drawable.img_guide_four);
                        buttonSkipGuide.setVisibility(View.GONE);
                        buttonStartGuide.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        buttonSkipGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideActivity.this, MainActivity.class);
                startActivity(intent);
                GuideActivity.this.finish();
            }
        });
        buttonStartGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideActivity.this, MainActivity.class);
                startActivity(intent);
                GuideActivity.this.finish();

            }
        });
    }

    private void initView() {
        adapter = new ViewPagerAdapter_guide();
        viewpgaerGuide.setAdapter(adapter);
    }
}

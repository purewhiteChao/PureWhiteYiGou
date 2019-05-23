package com.example.purewhiteyigou.view.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.BaseActivity;
import com.example.purewhiteyigou.view.fragment.classify.ClassifyFragment;
import com.example.purewhiteyigou.view.fragment.college.CollegeFragment;
import com.example.purewhiteyigou.view.fragment.home.HomeFragment;
import com.example.purewhiteyigou.view.fragment.me.MeFragment;
import com.example.purewhiteyigou.view.fragment.vedio.VedioFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.rg_main)
    RadioGroup bottomnavigationMain;
    @BindView(R.id.framlayout_main)
    FrameLayout framlayoutMain;
    @BindView(R.id.radio_home_main)
    RadioButton radioHomeMain;
    @BindView(R.id.radio_fenlei_main)
    RadioButton radioFenleiMain;
    @BindView(R.id.radio_freeviey_main)
    RadioButton radioFreevieyMain;
    @BindView(R.id.radio_college_main)
    RadioButton radioCollegeMain;
    @BindView(R.id.radio_me_main)
    RadioButton radioMeMain;
    List<Fragment> list_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= 21) {
//            View decorView = getWindow().getDecorView();
//            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }
        initData();
        initlistener();

    }

    private void initData() {
        list_fragment = new ArrayList<>();
        list_fragment.add(new HomeFragment());
        list_fragment.add(new ClassifyFragment());
        list_fragment.add(new VedioFragment());
        list_fragment.add(new CollegeFragment());
        list_fragment.add(new MeFragment());
    }

    private void initlistener() {
        bottomnavigationMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_home_main:
                        replaceFragment(list_fragment.get(0));
                        break;
                    case R.id.radio_college_main:
                        replaceFragment(list_fragment.get(3));
                        break;
                    case R.id.radio_me_main:
                        replaceFragment(list_fragment.get(4));
                        break;
                    case R.id.radio_fenlei_main:
                        replaceFragment(list_fragment.get(1));
                        break;
                }
            }
        });
        radioHomeMain.setChecked(true);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        for(int i=0;i<list_fragment.size();i++){
            if(!list_fragment.get(i).isHidden()){
                fragmentTransaction.hide(list_fragment.get(i));
            }
        }
        if(fragment.isAdded()){
            fragmentTransaction.show(fragment).commit();

        }else{
            fragmentTransaction.add(R.id.framlayout_main,fragment).show(fragment).commit();
        }
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

}

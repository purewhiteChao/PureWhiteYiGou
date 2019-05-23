package com.example.purewhiteyigou.view.activity.login;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.MVPActivity;
import com.example.purewhiteyigou.presenter.login.LoginPresenter;
import com.example.purewhiteyigou.presenter.login.LoginView;
import com.zhenzi.sms.ZhenziSmsClient;

import java.util.concurrent.Executors;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/23 0023
 * Time: 11:47
 * Describe: ${as}
 */
public class UserPhoneActicity extends MVPActivity<LoginPresenter, LoginView, String> implements LoginView {
    @BindView(R.id.image_back_usephone)
    ImageView imageBackUsephone;
    @BindView(R.id.edit_phone_userphone)
    EditText editPhoneUserphone;
    @BindView(R.id.edit_yanzhengma_usephone)
    EditText editYanzhengmaUsephone;
    @BindView(R.id.btn_huoqu_usephone)
    Button btnHuoquUsephone;
    @BindView(R.id.btn_login_usephone)
    Button btnLoginUsephone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initListener();
    }

    private void initListener() {
        imageBackUsephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserPhoneActicity.this.finish();
            }
        });
        btnHuoquUsephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_userphone;
    }

    @Override
    public void successAppKey(String appkey) {

    }

    @Override
    public void success(String data) {

    }

    @Override
    public void failess(String message) {

    }

}

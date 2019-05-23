package com.example.purewhiteyigou.view.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.MVPActivity;
import com.example.purewhiteyigou.presenter.login.LoginPresenter;
import com.example.purewhiteyigou.presenter.login.LoginView;
import com.example.purewhiteyigou.view.activity.forget.ForgetAvtivity;
import com.example.purewhiteyigou.view.activity.register.RegisterActivity;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/23 0023
 * Time: 9:03
 * Describe: ${as}
 */
public class LoginAvtivity extends MVPActivity<LoginPresenter, LoginView, String> implements LoginView {
    @BindView(R.id.image_back_login)
    ImageView imageBackLogin;
    @BindView(R.id.image_avator_login)
    ImageView imageAvatorLogin;
    @BindView(R.id.tvUsername)
    TextView tvUsername;
    @BindView(R.id.edit_username_login)
    EditText editUsernameLogin;
    @BindView(R.id.tvPassword)
    TextView tvPassword;
    @BindView(R.id.edit_password_login)
    EditText editPasswordLogin;
    @BindView(R.id.text_login_login)
    TextView textLoginLogin;
    @BindView(R.id.text_register_login)
    TextView textRegisterLogin;
    @BindView(R.id.text_forget_login)
    TextView textForgetLogin;
    String appkey;
    @BindView(R.id.text_userphone_login)
    TextView textUserphoneLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.postUserKey("com.example.purewhiteyigou", "123456");
        initListener();
    }

    private void initListener() {
        textUserphoneLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginAvtivity.this,UserPhoneActicity.class);
                startActivity(intent);
            }
        });
        imageBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginAvtivity.this.finish();
            }
        });
        textRegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginAvtivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        textForgetLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginAvtivity.this, ForgetAvtivity.class);
                startActivity(intent);
            }
        });
        textLoginLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (appkey == null) {
                    Toast.makeText(LoginAvtivity.this, "appkey还没有获取到", Toast.LENGTH_SHORT).show();
                    return;
                }
                String phone = editUsernameLogin.getText().toString();
                String pwd = editPasswordLogin.getText().toString();
                if (TextUtils.isEmpty(pwd) || TextUtils.isEmpty(phone)) {
                    Toast.makeText(LoginAvtivity.this, "用户名或者密码为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                presenter.postLogin(appkey, phone, pwd);
            }
        });
    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_login;
    }

    @Override
    public void success(String data) {

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failess(String message) {

    }


    @Override
    public void successAppKey(String appkey) {

        this.appkey = appkey;
    }
}

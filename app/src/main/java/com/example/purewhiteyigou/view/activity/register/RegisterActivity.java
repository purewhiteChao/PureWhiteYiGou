package com.example.purewhiteyigou.view.activity.register;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.MVPActivity;
import com.example.purewhiteyigou.presenter.login.LoginPresenter;
import com.example.purewhiteyigou.presenter.login.LoginView;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/23 0023
 * Time: 9:14
 * Describe: ${as}
 */
public class RegisterActivity extends MVPActivity<LoginPresenter, LoginView, String> implements LoginView {
    @BindView(R.id.image_back_register)
    ImageView imageBackRegister;
    @BindView(R.id.toolbarRegister)
    Toolbar toolbarRegister;
    @BindView(R.id.tvNameReg)
    TextView tvNameReg;
    @BindView(R.id.edit_username_register)
    EditText editUsernameRegister;
    @BindView(R.id.tvPwdReg)
    TextView tvPwdReg;
    @BindView(R.id.edit_password_register)
    EditText editPasswordRegister;
    @BindView(R.id.tvConfirmPwdReg)
    TextView tvConfirmPwdReg;
    @BindView(R.id.edit_repassword_register)
    EditText editRepasswordRegister;
    @BindView(R.id.btn_register_register)
    Button btnRegisterRegister;
    String appkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.postUserKey("com.example.purewhiteyigou", "123456");
        initListener();
    }

    private void initListener() {
        imageBackRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterActivity.this.finish();
            }
        });
        btnRegisterRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (appkey == null) {
                    Toast.makeText(RegisterActivity.this, "appkey还没有获取到", Toast.LENGTH_SHORT).show();
                    return;
                }
                String phone = editUsernameRegister.getText().toString();
                String pwd = editPasswordRegister.getText().toString();
                if (TextUtils.isEmpty(pwd) || TextUtils.isEmpty(phone)) {
                    Toast.makeText(RegisterActivity.this, "用户名或者密码为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                presenter.postRegister(appkey, phone, pwd, "purewhite");
            }
        });
    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_register;
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

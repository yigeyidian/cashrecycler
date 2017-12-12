package com.cy.cuyin.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.EditText;

import com.cy.cuyin.R;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.et_account)
    EditText etAccount;
    @BindView(R.id.et_password)
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toolbar.setTitle("登录");


    }

    @Override
    protected int getContentView() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.bt_login)
    public void loginClick() {

        String accountStr = etAccount.getText().toString();
        String passwordStr = etPassword.getText().toString();

        if (TextUtils.isEmpty(accountStr)) {
            showToast("请输入账号");
            return;
        }

        if (TextUtils.isEmpty(passwordStr)) {
            showToast("请输入密码");
            return;
        }

        startActivity(MainActivity.class);

    }
}

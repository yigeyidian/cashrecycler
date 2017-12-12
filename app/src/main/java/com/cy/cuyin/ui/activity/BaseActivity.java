package com.cy.cuyin.ui.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.cy.cuyin.R;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/12/6.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected SharedPreferences sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        ButterKnife.bind(this);

        initWindow();

        sp = PreferenceManager.getDefaultSharedPreferences(this);
    }

    protected abstract int getContentView();

    @TargetApi(19)
    protected void initWindow() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setNavigationBarTintEnabled(false);
            tintManager.setStatusBarTintColor(getResources().getColor(R.color.white));

            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    protected void startActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

    protected void startActivity(Class<?> cls, boolean flag) {
        startActivity(cls);
        if (flag) {
            finish();
        }
    }

    protected void startActivityForResult(Class<?> cls, int resultCode) {
        startActivityForResult(new Intent(this, cls), resultCode);
    }
}

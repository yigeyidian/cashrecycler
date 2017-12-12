package com.cy.cuyin.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

import com.cy.cuyin.R;
import com.cy.cuyin.bean.MainItemBean;
import com.cy.cuyin.ui.activity.BaseActivity;
import com.cy.cuyin.ui.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    List<MainItemBean> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        toolbar.setTitle("首页");


        datas.add(new MainItemBean(R.mipmap.ic_launcher, "库存"));
        datas.add(new MainItemBean(R.mipmap.ic_launcher, "合同"));
        datas.add(new MainItemBean(R.mipmap.ic_launcher, "历史"));

        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(new MainAdapter(R.layout.item_main, datas));

    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true);
            return true;
        }
        return false;
    }
}

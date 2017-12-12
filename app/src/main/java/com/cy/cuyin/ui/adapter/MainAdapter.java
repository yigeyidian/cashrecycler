package com.cy.cuyin.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cy.cuyin.R;
import com.cy.cuyin.bean.MainItemBean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/6.
 */

public class MainAdapter extends BaseQuickAdapter<MainItemBean, BaseViewHolder> {


    public MainAdapter(int layoutResId, @Nullable List<MainItemBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainItemBean item) {
        helper.setText(R.id.item_text, item.getName());
        helper.setImageResource(R.id.item_image, item.getImage());
    }
}

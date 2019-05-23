package com.example.purewhiteyigou.view.activity.search;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.adapter.RecyclerAdapter_Search;
import com.example.purewhiteyigou.base.BaseActivity;
import com.example.purewhiteyigou.model.bean.SearchBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/22 0022
 * Time: 11:56
 * Describe: ${as}
 */
public class SearchActivity extends BaseActivity {
    @BindView(R.id.image_back_search)
    ImageView imageBackSearch;
    @BindView(R.id.title_search)
    TextView titleSearch;
    @BindView(R.id.constrain_search)
    ConstraintLayout constrainSearch;
    @BindView(R.id.recycler_search)
    RecyclerView recyclerSearch;
    RecyclerAdapter_Search adapter;

    @Override
    protected int getContentView() {
        return R.layout.activity_search;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        List<SearchBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list = (List<SearchBean.EntityBean.GoodsSearchResponseBean.GoodsListBean>) extras.getSerializable("list");
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerSearch.setLayoutManager(manager);
        adapter = new RecyclerAdapter_Search(list);
        recyclerSearch.setAdapter(adapter);
        String title = extras.getString("title");
        titleSearch.setText(title);
        initListener();
    }

    private void initListener() {
        imageBackSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchActivity.this.finish();
            }
        });
    }
}

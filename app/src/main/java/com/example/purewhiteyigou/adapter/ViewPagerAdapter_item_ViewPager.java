package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.view.fragment.home.Item_ViewPagerManager;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/16 0016
 * Time: 10:18
 * Describe: ${as}
 */
public class ViewPagerAdapter_item_ViewPager extends PagerAdapter {
    private List<TablayoutBean.EntityBean.GoodsOptListBean> list;
    private Context context;

    public ViewPagerAdapter_item_ViewPager(List<TablayoutBean.EntityBean.GoodsOptListBean> list){
        this.list = list;

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        context = container.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_view_viewpager,container,false);
        Item_ViewPagerManager manager = new Item_ViewPagerManager(view,context,list.get(position).getOpt_id());
        manager.init();
        manager.initData();
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getOpt_name();
    }
}

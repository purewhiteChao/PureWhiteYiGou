package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.purewhiteyigou.R;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/21 0021
 * Time: 21:28
 * Describe: ${as}
 */
public class ViewPagerAdapter_guide extends PagerAdapter {

    private Context context;

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        context = container.getContext();
        View view  = LayoutInflater.from(context).inflate(R.layout.item_viewpager_guide,container,false);
        ImageView imageView = view.findViewById(R.id.image_item_viewpager_guide);
        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.img_guide_forground_one);
                break;
            case 1:
                imageView.setImageResource(R.drawable.img_guide_forground_two);
                break;
            case 2:
                imageView.setImageResource(R.drawable.img_guide_forground_three);
                break;
            case 3:
                imageView.setImageResource(R.drawable.img_guide_forground_four);
                break;
        }
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}

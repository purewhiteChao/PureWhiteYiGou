package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.uri.URLs;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 20:34
 * Describe: ${as}
 */
public class RecyclerAdapter_item_Today extends RecyclerView.Adapter<RecyclerAdapter_item_Today.MyViewHolder> {
    private List<BannerBean.EntityBean.WebsiteImagesBean.TaobaoGoodsOptBean> list;
    private Context context;

    public RecyclerAdapter_item_Today(List<BannerBean.EntityBean.WebsiteImagesBean.TaobaoGoodsOptBean> list){
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_today,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.textView.setText(list.get(i).getTitle());
        Glide.with(context).load(URLs.urls+list.get(i).getImagesUrl()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_item_today);
            imageView = itemView.findViewById(R.id.image_item_today);
        }
    }
}

package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.view.activity.details.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/20 0020
 * Time: 22:03
 * Describe: ${as}
 */
public class RecyclerAdapter_goods_classify extends RecyclerView.Adapter<RecyclerAdapter_goods_classify.MyViewholder> {
    private List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list = new ArrayList<>();
    private Context context;

    public void refresh(List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list){
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recyclergood_classify,viewGroup,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder myViewholder, final int i) {

        myViewholder.textView.setText(list.get(i).getGoods_name());
        Glide.with(context).load(list.get(i).getGoods_thumbnail_url()).into(myViewholder.imageView);
        myViewholder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("goods_id",list.get(i).getGoods_id());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewholder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_recyclergood_classify);
            textView = itemView.findViewById(R.id.title_recyclergood_classify);
        }
    }
}

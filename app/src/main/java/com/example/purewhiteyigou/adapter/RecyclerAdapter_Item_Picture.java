package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
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
 * Time: 21:38
 * Describe: ${as}
 */
public class RecyclerAdapter_Item_Picture extends RecyclerView.Adapter<RecyclerAdapter_Item_Picture.MyViewHolder> {
    private List<BannerBean.EntityBean.WebsiteImagesBean.FourThreeBean> list;
    private Context context;

    public RecyclerAdapter_Item_Picture(List<BannerBean.EntityBean.WebsiteImagesBean.FourThreeBean> list){
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_picture,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.title.setText(list.get(i).getTitle());
        Glide.with(context).load(URLs.urls+list.get(i).getImagesUrl()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_item_picture);
            imageView = itemView.findViewById(R.id.image_item_picture);
        }
    }
}

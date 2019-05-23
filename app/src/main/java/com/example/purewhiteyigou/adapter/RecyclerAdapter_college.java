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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import javax.xml.validation.Validator;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/17 0017
 * Time: 19:40
 * Describe: ${as}
 */
public class RecyclerAdapter_college extends RecyclerView.Adapter<RecyclerAdapter_college.MyViewHolder> {

    private Context context;
    private List<BannerBean.EntityBean.HomeRecommendBean> list = new ArrayList<>();
    public void refresh(List<BannerBean.EntityBean.HomeRecommendBean> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_college, viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.title.setText(list.get(i).getTitle());
        myViewHolder.author.setText(list.get(i).getAuthor());
        Glide.with(context).load(URLs.urls+list.get(i).getPicture()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView title;
        private TextView author;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_item_college);
            title = itemView.findViewById(R.id.title_item_college);
            author = itemView.findViewById(R.id.author_item_college);
        }
    }
}

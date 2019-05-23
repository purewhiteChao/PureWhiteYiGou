package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.RecyclerBean;
import com.example.purewhiteyigou.view.activity.details.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/16 0016
 * Time: 20:03
 * Describe: ${as}
 */
public class RecyclerAdapter_item_ViewPager extends RecyclerView.Adapter<RecyclerAdapter_item_ViewPager.MyViewHolder> {

    private Context context;
    private List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list = new ArrayList<>();
    public void refresh(List<RecyclerBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_viewpager,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        myViewHolder.title.setText(list.get(i).getGoods_name());
        myViewHolder.xiaoliang.setText("销"+list.get(i).getSales_tip());
        myViewHolder.priceAfter.setText("劵后￥"+(list.get(i).getMin_normal_price()*1.0/100));
        myViewHolder.priceBefore.setText("￥"+(list.get(i).getMin_group_price()*1.0/100));
        myViewHolder.shop.setText(list.get(i).getMall_name());
        myViewHolder.juan.setText("券"+(list.get(i).getAwardAmount()*1.0/10));
        myViewHolder.zhuan.setText("赚"+(list.get(i).getPlusAmount()*1.0/10));
        Glide.with(context).load(list.get(i).getGoods_thumbnail_url()).into(myViewHolder.imageView);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
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

    class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView title;
        public TextView shop;
        public TextView priceAfter;
        public TextView priceBefore;
        public TextView xiaoliang;
        public Button zhuan;
        public Button juan;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_item_viewpager);
            title = itemView.findViewById(R.id.title_item_viewpager);
            shop = itemView.findViewById(R.id.shop_item_viewpager);
            priceAfter = itemView.findViewById(R.id.priceafter_item_viewpager);
            priceBefore = itemView.findViewById(R.id.pricebefore_item_viewpager);
            xiaoliang = itemView.findViewById(R.id.xiaoliang_item_viewpager);
            zhuan = itemView.findViewById(R.id.btnzhuan_item_viewpager);
            juan = itemView.findViewById(R.id.btnjuan_item_viewpager);
        }
    }
}

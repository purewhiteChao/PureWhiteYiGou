package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.view.activity.details.DetailsActivity;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/16 0016
 * Time: 9:15
 * Describe: ${as}
 */
public class RecyclerAdapter_item_BaoKuan extends RecyclerView.Adapter<RecyclerAdapter_item_BaoKuan.MyViewHolder> {
    private List<BaoKuanBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list;
    private Context context;

    public RecyclerAdapter_item_BaoKuan(List<BaoKuanBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> list){
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recycler_baokuan,viewGroup,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        myViewHolder.price_after.setText("折后价￥"+(list.get(i).getMin_group_price()*1.0/100));
        myViewHolder.price_before.setText("￥"+(list.get(i).getMin_normal_price()*1.0/100));
        myViewHolder.title.setText(list.get(i).getGoods_name());
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
        public TextView price_after;
        public TextView price_before;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_item_baokuan);
            title = itemView.findViewById(R.id.title_item_baokuan);
            price_after = itemView.findViewById(R.id.priceafter_item_baokuan);
            price_before = itemView.findViewById(R.id.pricebefore_item_baokuan);
        }
    }
}

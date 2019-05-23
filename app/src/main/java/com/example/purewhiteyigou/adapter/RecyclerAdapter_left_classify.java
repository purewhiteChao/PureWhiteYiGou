package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.TablayoutBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/20 0020
 * Time: 21:51
 * Describe: ${as}
 */
public class RecyclerAdapter_left_classify extends RecyclerView.Adapter<RecyclerAdapter_left_classify.MyViewHolder> {
    private List<TablayoutBean.EntityBean.GoodsOptListBean> list = new ArrayList<>();
    private Context context;
    private OnClick click;

    public void setClick(OnClick click) {
        this.click = click;
    }

    public void refresh(List<TablayoutBean.EntityBean.GoodsOptListBean> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_recyclerleft_classify,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {

        myViewHolder.textView.setText(list.get(i).getOpt_name());
        myViewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click.onCallBack(list.get(i).getOpt_id());
                Log.i("guochao",list.get(i).getOpt_id()+"");
//                myViewHolder.itemView.setBackgroundColor(Color.parseColor("#F56C02"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_recyclerleft_classify);
        }
    }
    public interface OnClick{
        void onCallBack(int id);
    }
}

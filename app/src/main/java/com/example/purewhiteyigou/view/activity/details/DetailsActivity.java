package com.example.purewhiteyigou.view.activity.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.MVPActivity;
import com.example.purewhiteyigou.model.bean.DetailsBean;
import com.example.purewhiteyigou.model.service.DetailsService;
import com.example.purewhiteyigou.presenter.details.DetailsPresenter;
import com.example.purewhiteyigou.presenter.details.DetailsView;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/21 0021
 * Time: 19:43
 * Describe: ${as}
 */
public class DetailsActivity extends MVPActivity<DetailsPresenter, DetailsView, DetailsBean.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> implements DetailsView<DetailsBean.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean> {
    @BindView(R.id.banner_details)
    Banner bannerDetails;
    @BindView(R.id.image_back_details)
    ImageView imageBackDetails;
    @BindView(R.id.text_title_details)
    TextView textTitleDetails;
    @BindView(R.id.text_priceafter_details)
    TextView textPriceafterDetails;
    @BindView(R.id.text_pricebefore_details)
    TextView textPricebeforeDetails;
    @BindView(R.id.text_sales_details)
    TextView textSalesDetails;
    @BindView(R.id.text_guanggao_details)
    TextView textGuanggaoDetails;
    @BindView(R.id.text_kaitong_details)
    TextView textKaitongDetails;
    @BindView(R.id.view_one_details)
    View viewOneDetails;
    @BindView(R.id.text_youhuijuan_details)
    TextView textYouhuijuanDetails;
    @BindView(R.id.text_lingjuan_details)
    TextView textLingjuanDetails;
    @BindView(R.id.constraint_youhuijuan_details)
    ConstraintLayout constraintYouhuijuanDetails;
    @BindView(R.id.view_two_details)
    View viewTwoDetails;
    @BindView(R.id.image_shop_details)
    ImageView imageShopDetails;
    @BindView(R.id.text_shopname_details)
    TextView textShopnameDetails;
    @BindView(R.id.text_pluszhuan_details)
    TextView textPluszhuanDetails;
    @BindView(R.id.text_yuzhuan_details)
    TextView textYuzhuanDetails;
    @BindView(R.id.check_shoucang_details)
    CheckBox checkShoucangDetails;
    @BindView(R.id.btn_fenxiangzhuan_details)
    Button btnFenxiangzhuanDetails;
    @BindView(R.id.btn_zimaizhuan_details)
    Button btnZimaizhuanDetails;
    private long goods_id;

    @Override
    protected int getContentView() {
        return R.layout.activity_details;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        goods_id = intent.getLongExtra("goods_id", 0);
        initData();
        initListener();
    }

    private void initListener() {
        imageBackDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailsActivity.this.finish();
            }
        });
    }

    private void initData() {

        presenter.getDetails(goods_id);
    }

    @Override
    protected DetailsPresenter initPresenter() {
        return new DetailsPresenter();
    }


    @Override
    public void success(DetailsBean.EntityBean.GoodsDetailResponseBean.GoodsDetailsBean data) {

        bannerDetails.setImages(data.getGoods_gallery_urls())
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        Glide.with(context).load(path).into(imageView);
                    }
                }).isAutoPlay(true)
                .start();
        textTitleDetails.setText(data.getGoods_name());
        textPriceafterDetails.setText("券后价￥"+data.getMin_group_price()*1.0/100);
        textPricebeforeDetails.setText("原价￥"+data.getMin_normal_price()*1.0/100);
        textSalesDetails.setText(data.getSold_quantity()+"人购买");
        textPluszhuanDetails.setText(data.getServ_pct()+"");
        textYuzhuanDetails.setText(data.getDesc_pct()+"");
        btnFenxiangzhuanDetails.setText("分享赚￥"+data.getDesc_pct());
        btnZimaizhuanDetails.setText("自买赚￥"+data.getDesc_pct());
        textShopnameDetails.setText(data.getMall_name());
        textYouhuijuanDetails.setText(data.getGoods_eval_score()+"元优惠券");
    }

    @Override
    public void failess(String message) {

    }
}

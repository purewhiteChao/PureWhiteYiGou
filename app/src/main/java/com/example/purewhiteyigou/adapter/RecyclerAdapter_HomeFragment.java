package com.example.purewhiteyigou.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.model.bean.BannerBean;
import com.example.purewhiteyigou.model.bean.BaoKuanBean;
import com.example.purewhiteyigou.model.bean.GifBean;
import com.example.purewhiteyigou.model.bean.TablayoutBean;
import com.example.purewhiteyigou.model.uri.URLs;
import com.example.purewhiteyigou.view.customview.MyViewPager;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/14 0014
 * Time: 20:44
 * Describe: ${as}
 */
public class RecyclerAdapter_HomeFragment extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int FLAG_BANNER = 0;
    public static final int FLAG_TODAYCOMMEND = 1;
    public static final int FLAG_PICTURE = 2;
    public static final int FLAG_HORIZON = 3;
    public static final int FLAG_VIEWPAGER = 4;
    private Context context;
    private BannerBean bannerBean;
    private GifBean gifBean;
    private BaoKuanBean baoKuanBean;
    private TablayoutBean tablayoutBean;

    public void refreshBanner(BannerBean bannerBean){
        this.bannerBean = bannerBean;
        notifyDataSetChanged();
    }
    public void refreshGif(GifBean gitBean){
        this.gifBean = gitBean;
        notifyDataSetChanged();
    }
    public void refreshBaoKuan(BaoKuanBean baoKuanBean){
        this.baoKuanBean = baoKuanBean;
        notifyDataSetChanged();
    }
    public void refreshTabLayout(TablayoutBean bean){
        this.tablayoutBean = bean;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        switch (i){
            case FLAG_BANNER:
                View view = LayoutInflater.from(context).inflate(R.layout.item_banner,viewGroup,false);
                return new Banner_ViewHolder(view);
            case FLAG_TODAYCOMMEND:
                View view1 = LayoutInflater.from(context).inflate(R.layout.item_todayrecommemnd,viewGroup,false);
                return new TodayRecommendViewHolder(view1);
            case FLAG_PICTURE:
                View view2 = LayoutInflater.from(context).inflate(R.layout.item_picture,viewGroup,false);
                return new PictureViewHolder(view2);
            case FLAG_HORIZON:
                View view3 = LayoutInflater.from(context).inflate(R.layout.item_horzonview,viewGroup,false);
                return new HorizonViewHolder(view3);
            case FLAG_VIEWPAGER:
                View view4 = LayoutInflater.from(context).inflate(R.layout.item_viewpager,viewGroup,false);
                return new ViewPagerViewHolder(view4);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        if(viewHolder instanceof Banner_ViewHolder){

            Banner_ViewHolder banner_ViewHolder = (Banner_ViewHolder) viewHolder;
            List<String> list_banner = new ArrayList<>();
            if(bannerBean!=null){
                List<BannerBean.EntityBean.WebsiteImagesBean.IndexCenterBannerBean> indexCenterBanner = bannerBean.getEntity().getWebsiteImages().getIndexCenterBanner();
                for(int j=0;j<indexCenterBanner.size();j++){
                    list_banner.add(URLs.urls+indexCenterBanner.get(j).getImagesUrl());
                }
                banner_ViewHolder.banner
                        .setImages(list_banner)
                        .setImageLoader(new ImageLoader() {
                            @Override
                            public void displayImage(Context context, Object path, ImageView imageView) {
                                Glide.with(context).load(path).into(imageView);
                            }
                        })
                        .isAutoPlay(true)
                        .start();

            }
        }else if(viewHolder instanceof TodayRecommendViewHolder){

            TodayRecommendViewHolder taday = (TodayRecommendViewHolder) viewHolder;
            if(bannerBean!=null){
                List<BannerBean.EntityBean.WebsiteImagesBean.TaobaoGoodsOptBean> taobaoGoodsOpt = bannerBean.getEntity().getWebsiteImages().getTaobaoGoodsOpt();
                taday.adapter = new RecyclerAdapter_item_Today(taobaoGoodsOpt);
                taday.recyclerView.setAdapter(taday.adapter);
            }

        }else if(viewHolder instanceof PictureViewHolder){
            PictureViewHolder picture = (PictureViewHolder) viewHolder;
            if(gifBean !=null){
                List<GifBean.EntityBean> entity = gifBean.getEntity();
                String image = entity.get(0).getList().get(0).getImage();
                Glide.with(context).load(URLs.urls+image).asGif().into(picture.imageView);
            }
            if(bannerBean!=null){
                List<BannerBean.EntityBean.WebsiteImagesBean.FourThreeBean> fourThree = bannerBean.getEntity().getWebsiteImages().getFourThree();
                picture.adapter = new RecyclerAdapter_Item_Picture(fourThree);
                picture.recyclerView.setAdapter(picture.adapter);
            }

        }else if(viewHolder instanceof HorizonViewHolder){
            HorizonViewHolder horizon = (HorizonViewHolder) viewHolder;
            if(baoKuanBean!=null){

                List<BaoKuanBean.EntityBean.GoodsSearchResponseBean.GoodsListBean> goods_list = baoKuanBean.getEntity().getGoods_search_response().getGoods_list();
                horizon.adapter = new RecyclerAdapter_item_BaoKuan(goods_list);
                horizon.recyclerView.setAdapter(horizon.adapter);
            }

        } else if (viewHolder instanceof ViewPagerViewHolder) {
            ViewPagerViewHolder viewPagerViewHolder = (ViewPagerViewHolder) viewHolder;
            if(tablayoutBean!=null){
                List<TablayoutBean.EntityBean.GoodsOptListBean> goods_opt_list = tablayoutBean.getEntity().getGoods_opt_list();
                viewPagerViewHolder.adapter = new ViewPagerAdapter_item_ViewPager(goods_opt_list);
                viewPagerViewHolder.viewPager.setAdapter(viewPagerViewHolder.adapter);
            }

        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }


    @Override
    public int getItemViewType(int position) {

        switch (position){
            case 0:
                return FLAG_BANNER;
            case 1:
                return FLAG_TODAYCOMMEND;
            case 2:
                return FLAG_PICTURE;
            case 3:
                return FLAG_HORIZON;
            case 4:
                return FLAG_VIEWPAGER;
        }
        return 0;
    }

    public class Banner_ViewHolder extends RecyclerView.ViewHolder{

        public Banner banner;
        public Banner_ViewHolder(@NonNull View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.banner_item_homefragment);
        }
    }
    public class TodayRecommendViewHolder extends RecyclerView.ViewHolder{

        public RecyclerView recyclerView;
        RecyclerAdapter_item_Today adapter;
        public TodayRecommendViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.recycler_todayrecommed_home);
            GridLayoutManager manager = new GridLayoutManager(context,5);
            manager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(manager);
        }
    }
    public class PictureViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public RecyclerView recyclerView;
        public RecyclerAdapter_Item_Picture adapter;
        public PictureViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_picture_homefrag);
            recyclerView = itemView.findViewById(R.id.recycler_picture_homefrag);
            GridLayoutManager manager = new GridLayoutManager(context,2);
            manager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(manager);
        }
    }
    public class HorizonViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1;
        TextView textView2;
        RecyclerView recyclerView;
        RecyclerAdapter_item_BaoKuan adapter;
        public HorizonViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_horzonview);
            textView1 = itemView.findViewById(R.id.superfire_horzonview);
            textView2 = itemView.findViewById(R.id.more_horzonview);
            recyclerView = itemView.findViewById(R.id.recycler_item_horzon);
            LinearLayoutManager manager = new LinearLayoutManager(context);
            manager.setOrientation(LinearLayoutManager.HORIZONTAL);
            recyclerView.setLayoutManager(manager);
        }
    }
    public class ViewPagerViewHolder extends RecyclerView.ViewHolder{

        MyViewPager viewPager;
        TabLayout layout;
        ViewPagerAdapter_item_ViewPager adapter;
        public ViewPagerViewHolder(@NonNull View itemView) {
            super(itemView);
            viewPager = itemView.findViewById(R.id.viewpager_item_viewpager);
            layout = itemView.findViewById(R.id.tablayout_item_viewpager);
        }
    }

}

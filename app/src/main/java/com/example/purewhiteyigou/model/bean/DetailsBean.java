package com.example.purewhiteyigou.model.bean;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/22 0022
 * Time: 20:40
 * Describe: ${as}
 */
public class DetailsBean {

    /**
     * message : 成功
     * code : 0000
     * success : true
     * entity : {"goods_detail_response":{"goods_details":[{"avg_desc":455,"category_name":"百货","coupon_remain_quantity":37000,"avg_serv":468,"avg_lgst":468,"serv_pct":0.488,"promotion_rate":100,"promotion_amount":0,"sold_quantity":184689,"sales_tip":"10万+","coupon_min_order_amount":100,"lgst_pct":0.5302,"category_id":8590,"mall_id":685783182,"goods_eval_score":4,"mall_name":"舒适达家居生活官方旗舰店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0.3337,"merchant_type":3,"goods_name":"舒适达卷纸12卷/48卷纸卫生纸家庭装纸巾批发厕纸无芯卷筒纸手纸","goods_eval_count":37929,"goods_id":7643510884,"opt_name":"百货","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-05-20/b29eb779a8f5d475a36d8b73d3940c59.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2019-04-15/ea65d8b2-2491-41a9-a2d4-cce56f474729.jpg","min_normal_price":1290,"has_coupon":true,"create_at":0,"min_group_price":880,"mall_cps":1,"coupon_start_time":1558108800,"coupon_discount":100,"coupon_end_time":1559318399,"goods_gallery_urls":["https://t00img.yangkeduo.com/goods/images/2019-05-20/4eb74d34-7f35-4401-bf8c-e65f6dfb04cf.jpg","https://t00img.yangkeduo.com/goods/images/2019-05-07/f8ac91fc-1d01-40c1-939a-8338ab5627ec.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/929017a9-a5e8-4961-ab6c-387fe37a6b20.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/427b629d-1c66-499c-a5c7-012ffd3ec425.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/8ef9f36f-0917-4dfb-ac4c-8c8b7a4b7cbc.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/c2e2314b-b121-4171-bef3-198b2a62ed93.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/8d2826db-deb9-4be1-a391-4830b1838930.jpg"],"platform":null,"coupon_price":0,"awardAmount":39,"plusAmount":62}]}}
     */

    private String message;
    private String code;
    private boolean success;
    private EntityBean entity;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public EntityBean getEntity() {
        return entity;
    }

    public void setEntity(EntityBean entity) {
        this.entity = entity;
    }

    public static class EntityBean {
        /**
         * goods_detail_response : {"goods_details":[{"avg_desc":455,"category_name":"百货","coupon_remain_quantity":37000,"avg_serv":468,"avg_lgst":468,"serv_pct":0.488,"promotion_rate":100,"promotion_amount":0,"sold_quantity":184689,"sales_tip":"10万+","coupon_min_order_amount":100,"lgst_pct":0.5302,"category_id":8590,"mall_id":685783182,"goods_eval_score":4,"mall_name":"舒适达家居生活官方旗舰店","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0.3337,"merchant_type":3,"goods_name":"舒适达卷纸12卷/48卷纸卫生纸家庭装纸巾批发厕纸无芯卷筒纸手纸","goods_eval_count":37929,"goods_id":7643510884,"opt_name":"百货","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-05-20/b29eb779a8f5d475a36d8b73d3940c59.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2019-04-15/ea65d8b2-2491-41a9-a2d4-cce56f474729.jpg","min_normal_price":1290,"has_coupon":true,"create_at":0,"min_group_price":880,"mall_cps":1,"coupon_start_time":1558108800,"coupon_discount":100,"coupon_end_time":1559318399,"goods_gallery_urls":["https://t00img.yangkeduo.com/goods/images/2019-05-20/4eb74d34-7f35-4401-bf8c-e65f6dfb04cf.jpg","https://t00img.yangkeduo.com/goods/images/2019-05-07/f8ac91fc-1d01-40c1-939a-8338ab5627ec.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/929017a9-a5e8-4961-ab6c-387fe37a6b20.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/427b629d-1c66-499c-a5c7-012ffd3ec425.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/8ef9f36f-0917-4dfb-ac4c-8c8b7a4b7cbc.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/c2e2314b-b121-4171-bef3-198b2a62ed93.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/8d2826db-deb9-4be1-a391-4830b1838930.jpg"],"platform":null,"coupon_price":0,"awardAmount":39,"plusAmount":62}]}
         */

        private GoodsDetailResponseBean goods_detail_response;

        public GoodsDetailResponseBean getGoods_detail_response() {
            return goods_detail_response;
        }

        public void setGoods_detail_response(GoodsDetailResponseBean goods_detail_response) {
            this.goods_detail_response = goods_detail_response;
        }

        public static class GoodsDetailResponseBean {
            private List<GoodsDetailsBean> goods_details;

            public List<GoodsDetailsBean> getGoods_details() {
                return goods_details;
            }

            public void setGoods_details(List<GoodsDetailsBean> goods_details) {
                this.goods_details = goods_details;
            }

            public static class GoodsDetailsBean {
                /**
                 * avg_desc : 455
                 * category_name : 百货
                 * coupon_remain_quantity : 37000
                 * avg_serv : 468
                 * avg_lgst : 468
                 * serv_pct : 0.488
                 * promotion_rate : 100
                 * promotion_amount : 0
                 * sold_quantity : 184689
                 * sales_tip : 10万+
                 * coupon_min_order_amount : 100
                 * lgst_pct : 0.5302
                 * category_id : 8590
                 * mall_id : 685783182
                 * goods_eval_score : 4
                 * mall_name : 舒适达家居生活官方旗舰店
                 * mall_type : PDD
                 * coupon_total_quantity : 50000
                 * desc_pct : 0.3337
                 * merchant_type : 3
                 * goods_name : 舒适达卷纸12卷/48卷纸卫生纸家庭装纸巾批发厕纸无芯卷筒纸手纸
                 * goods_eval_count : 37929
                 * goods_id : 7643510884
                 * opt_name : 百货
                 * goods_thumbnail_url : https://t00img.yangkeduo.com/goods/images/2019-05-20/b29eb779a8f5d475a36d8b73d3940c59.jpeg
                 * goods_image_url : https://t00img.yangkeduo.com/goods/images/2019-04-15/ea65d8b2-2491-41a9-a2d4-cce56f474729.jpg
                 * min_normal_price : 1290
                 * has_coupon : true
                 * create_at : 0
                 * min_group_price : 880
                 * mall_cps : 1
                 * coupon_start_time : 1558108800
                 * coupon_discount : 100
                 * coupon_end_time : 1559318399
                 * goods_gallery_urls : ["https://t00img.yangkeduo.com/goods/images/2019-05-20/4eb74d34-7f35-4401-bf8c-e65f6dfb04cf.jpg","https://t00img.yangkeduo.com/goods/images/2019-05-07/f8ac91fc-1d01-40c1-939a-8338ab5627ec.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/929017a9-a5e8-4961-ab6c-387fe37a6b20.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/427b629d-1c66-499c-a5c7-012ffd3ec425.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/8ef9f36f-0917-4dfb-ac4c-8c8b7a4b7cbc.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/c2e2314b-b121-4171-bef3-198b2a62ed93.jpg","https://t00img.yangkeduo.com/goods/images/2019-04-15/8d2826db-deb9-4be1-a391-4830b1838930.jpg"]
                 * platform : null
                 * coupon_price : 0
                 * awardAmount : 39
                 * plusAmount : 62
                 */

                private int avg_desc;
                private String category_name;
                private int coupon_remain_quantity;
                private int avg_serv;
                private int avg_lgst;
                private double serv_pct;
                private int promotion_rate;
                private int promotion_amount;
                private int sold_quantity;
                private String sales_tip;
                private int coupon_min_order_amount;
                private double lgst_pct;
                private int category_id;
                private int mall_id;
                private int goods_eval_score;
                private String mall_name;
                private String mall_type;
                private int coupon_total_quantity;
                private double desc_pct;
                private int merchant_type;
                private String goods_name;
                private int goods_eval_count;
                private long goods_id;
                private String opt_name;
                private String goods_thumbnail_url;
                private String goods_image_url;
                private int min_normal_price;
                private boolean has_coupon;
                private int create_at;
                private int min_group_price;
                private int mall_cps;
                private int coupon_start_time;
                private int coupon_discount;
                private int coupon_end_time;
                private Object platform;
                private int coupon_price;
                private int awardAmount;
                private int plusAmount;
                private List<String> goods_gallery_urls;

                public int getAvg_desc() {
                    return avg_desc;
                }

                public void setAvg_desc(int avg_desc) {
                    this.avg_desc = avg_desc;
                }

                public String getCategory_name() {
                    return category_name;
                }

                public void setCategory_name(String category_name) {
                    this.category_name = category_name;
                }

                public int getCoupon_remain_quantity() {
                    return coupon_remain_quantity;
                }

                public void setCoupon_remain_quantity(int coupon_remain_quantity) {
                    this.coupon_remain_quantity = coupon_remain_quantity;
                }

                public int getAvg_serv() {
                    return avg_serv;
                }

                public void setAvg_serv(int avg_serv) {
                    this.avg_serv = avg_serv;
                }

                public int getAvg_lgst() {
                    return avg_lgst;
                }

                public void setAvg_lgst(int avg_lgst) {
                    this.avg_lgst = avg_lgst;
                }

                public double getServ_pct() {
                    return serv_pct;
                }

                public void setServ_pct(double serv_pct) {
                    this.serv_pct = serv_pct;
                }

                public int getPromotion_rate() {
                    return promotion_rate;
                }

                public void setPromotion_rate(int promotion_rate) {
                    this.promotion_rate = promotion_rate;
                }

                public int getPromotion_amount() {
                    return promotion_amount;
                }

                public void setPromotion_amount(int promotion_amount) {
                    this.promotion_amount = promotion_amount;
                }

                public int getSold_quantity() {
                    return sold_quantity;
                }

                public void setSold_quantity(int sold_quantity) {
                    this.sold_quantity = sold_quantity;
                }

                public String getSales_tip() {
                    return sales_tip;
                }

                public void setSales_tip(String sales_tip) {
                    this.sales_tip = sales_tip;
                }

                public int getCoupon_min_order_amount() {
                    return coupon_min_order_amount;
                }

                public void setCoupon_min_order_amount(int coupon_min_order_amount) {
                    this.coupon_min_order_amount = coupon_min_order_amount;
                }

                public double getLgst_pct() {
                    return lgst_pct;
                }

                public void setLgst_pct(double lgst_pct) {
                    this.lgst_pct = lgst_pct;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public int getMall_id() {
                    return mall_id;
                }

                public void setMall_id(int mall_id) {
                    this.mall_id = mall_id;
                }

                public int getGoods_eval_score() {
                    return goods_eval_score;
                }

                public void setGoods_eval_score(int goods_eval_score) {
                    this.goods_eval_score = goods_eval_score;
                }

                public String getMall_name() {
                    return mall_name;
                }

                public void setMall_name(String mall_name) {
                    this.mall_name = mall_name;
                }

                public String getMall_type() {
                    return mall_type;
                }

                public void setMall_type(String mall_type) {
                    this.mall_type = mall_type;
                }

                public int getCoupon_total_quantity() {
                    return coupon_total_quantity;
                }

                public void setCoupon_total_quantity(int coupon_total_quantity) {
                    this.coupon_total_quantity = coupon_total_quantity;
                }

                public double getDesc_pct() {
                    return desc_pct;
                }

                public void setDesc_pct(double desc_pct) {
                    this.desc_pct = desc_pct;
                }

                public int getMerchant_type() {
                    return merchant_type;
                }

                public void setMerchant_type(int merchant_type) {
                    this.merchant_type = merchant_type;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public int getGoods_eval_count() {
                    return goods_eval_count;
                }

                public void setGoods_eval_count(int goods_eval_count) {
                    this.goods_eval_count = goods_eval_count;
                }

                public long getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(long goods_id) {
                    this.goods_id = goods_id;
                }

                public String getOpt_name() {
                    return opt_name;
                }

                public void setOpt_name(String opt_name) {
                    this.opt_name = opt_name;
                }

                public String getGoods_thumbnail_url() {
                    return goods_thumbnail_url;
                }

                public void setGoods_thumbnail_url(String goods_thumbnail_url) {
                    this.goods_thumbnail_url = goods_thumbnail_url;
                }

                public String getGoods_image_url() {
                    return goods_image_url;
                }

                public void setGoods_image_url(String goods_image_url) {
                    this.goods_image_url = goods_image_url;
                }

                public int getMin_normal_price() {
                    return min_normal_price;
                }

                public void setMin_normal_price(int min_normal_price) {
                    this.min_normal_price = min_normal_price;
                }

                public boolean isHas_coupon() {
                    return has_coupon;
                }

                public void setHas_coupon(boolean has_coupon) {
                    this.has_coupon = has_coupon;
                }

                public int getCreate_at() {
                    return create_at;
                }

                public void setCreate_at(int create_at) {
                    this.create_at = create_at;
                }

                public int getMin_group_price() {
                    return min_group_price;
                }

                public void setMin_group_price(int min_group_price) {
                    this.min_group_price = min_group_price;
                }

                public int getMall_cps() {
                    return mall_cps;
                }

                public void setMall_cps(int mall_cps) {
                    this.mall_cps = mall_cps;
                }

                public int getCoupon_start_time() {
                    return coupon_start_time;
                }

                public void setCoupon_start_time(int coupon_start_time) {
                    this.coupon_start_time = coupon_start_time;
                }

                public int getCoupon_discount() {
                    return coupon_discount;
                }

                public void setCoupon_discount(int coupon_discount) {
                    this.coupon_discount = coupon_discount;
                }

                public int getCoupon_end_time() {
                    return coupon_end_time;
                }

                public void setCoupon_end_time(int coupon_end_time) {
                    this.coupon_end_time = coupon_end_time;
                }

                public Object getPlatform() {
                    return platform;
                }

                public void setPlatform(Object platform) {
                    this.platform = platform;
                }

                public int getCoupon_price() {
                    return coupon_price;
                }

                public void setCoupon_price(int coupon_price) {
                    this.coupon_price = coupon_price;
                }

                public int getAwardAmount() {
                    return awardAmount;
                }

                public void setAwardAmount(int awardAmount) {
                    this.awardAmount = awardAmount;
                }

                public int getPlusAmount() {
                    return plusAmount;
                }

                public void setPlusAmount(int plusAmount) {
                    this.plusAmount = plusAmount;
                }

                public List<String> getGoods_gallery_urls() {
                    return goods_gallery_urls;
                }

                public void setGoods_gallery_urls(List<String> goods_gallery_urls) {
                    this.goods_gallery_urls = goods_gallery_urls;
                }
            }
        }
    }
}

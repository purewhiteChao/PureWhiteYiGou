package com.example.purewhiteyigou.model.bean;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/16 0016
 * Time: 21:39
 * Describe: ${as}
 */
public class RecyclerBean {

    /**
     * message : pdd
     * code : 0000
     * success : true
     * entity : {"goods_search_response":{"goods_list":[{"avg_desc":487,"category_name":"食品","coupon_remain_quantity":0,"avg_serv":488,"avg_lgst":488,"serv_pct":0.9009,"promotion_rate":10,"promotion_amount":0,"sold_quantity":58653,"sales_tip":"5.8万","coupon_min_order_amount":0,"lgst_pct":0.9071,"category_id":1,"mall_id":595462419,"goods_eval_score":4,"mall_name":"云鹜食品专营店","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0.8869,"merchant_type":5,"goods_name":"云鹤厨秘书手抓饼】原味手抓饼早餐饼速食煎饼商用家庭装20片25片","goods_eval_count":1658,"goods_id":5765251970,"opt_name":"食品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-04-03/09f2824074f9e2991215cff613110247.jpeg","goods_image_url":"","min_normal_price":1639,"has_coupon":true,"create_at":1548148491,"min_group_price":1390,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":6,"plusAmount":11},{"avg_desc":483,"category_name":"海淘","coupon_remain_quantity":1000,"avg_serv":486,"avg_lgst":486,"serv_pct":0.7977,"promotion_rate":200,"promotion_amount":0,"sold_quantity":487901,"sales_tip":"10万+","coupon_min_order_amount":200,"lgst_pct":0.8042,"category_id":12,"mall_id":538825,"goods_eval_score":4,"mall_name":"巧妇优生活日化用品旗舰店","mall_type":"PDD","coupon_total_quantity":10000,"desc_pct":0.8129,"merchant_type":3,"goods_name":"[冷水去油腻]青柠檬洗洁精餐具清洁剂瓜果蔬菜一洗净无残留食品级","goods_eval_count":59510,"goods_id":279931893,"opt_name":"海淘","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2018-12-28/9f19864e73218984f50b7068ffdc9ca4.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2018-10-16/8ae6e2afb090b7a51920ab7becce4ef4.jpeg","min_normal_price":1190,"has_coupon":true,"create_at":1539678688,"min_group_price":890,"mall_cps":1,"coupon_start_time":1557504000,"coupon_discount":200,"coupon_end_time":1558108799,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":69,"plusAmount":110},{"avg_desc":482,"category_name":"海淘","coupon_remain_quantity":49000,"avg_serv":486,"avg_lgst":487,"serv_pct":0.8227,"promotion_rate":10,"promotion_amount":0,"sold_quantity":26,"sales_tip":"26","coupon_min_order_amount":20000,"lgst_pct":0.8577,"category_id":12,"mall_id":954822083,"goods_eval_score":0,"mall_name":"雅阳家居","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0.7043,"merchant_type":6,"goods_name":"帝喜居家不粘锅三件套装锅具炒锅煎锅汤锅","goods_eval_count":0,"goods_id":5795034585,"opt_name":"海淘","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-01-28/417b18bc02683517edeb23fa86093aff.jpeg","goods_image_url":"","min_normal_price":49900,"has_coupon":true,"create_at":1548643353,"min_group_price":39900,"mall_cps":1,"coupon_start_time":1556035200,"coupon_discount":20000,"coupon_end_time":1559318399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":99,"plusAmount":159},{"avg_desc":467,"category_name":"鞋包","coupon_remain_quantity":900,"avg_serv":475,"avg_lgst":475,"serv_pct":0.4745,"promotion_rate":250,"promotion_amount":0,"sold_quantity":4182,"sales_tip":"4182","coupon_min_order_amount":2000,"lgst_pct":0.5105,"category_id":1281,"mall_id":723894,"goods_eval_score":0,"mall_name":"重装狼牙ZZLY品质臻享","mall_type":"PDD","coupon_total_quantity":1000,"desc_pct":0.393,"merchant_type":1,"goods_name":"男女同款运动鞋皮面防水防滑2019休闲跑步鞋韩版中学生品牌旅游鞋","goods_eval_count":0,"goods_id":2647403939,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2018-08-19/031fb6b980f6a5a12f4968e03e860114.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2018-08-19/79e8d37c23db184ebf2509dd45085107.jpeg","min_normal_price":9800,"has_coupon":true,"create_at":1537406935,"min_group_price":5900,"mall_cps":1,"coupon_start_time":1557763200,"coupon_discount":2000,"coupon_end_time":1558195199,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":487,"plusAmount":780}],"total_count":4}}
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
         * goods_search_response : {"goods_list":[{"avg_desc":487,"category_name":"食品","coupon_remain_quantity":0,"avg_serv":488,"avg_lgst":488,"serv_pct":0.9009,"promotion_rate":10,"promotion_amount":0,"sold_quantity":58653,"sales_tip":"5.8万","coupon_min_order_amount":0,"lgst_pct":0.9071,"category_id":1,"mall_id":595462419,"goods_eval_score":4,"mall_name":"云鹜食品专营店","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0.8869,"merchant_type":5,"goods_name":"云鹤厨秘书手抓饼】原味手抓饼早餐饼速食煎饼商用家庭装20片25片","goods_eval_count":1658,"goods_id":5765251970,"opt_name":"食品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-04-03/09f2824074f9e2991215cff613110247.jpeg","goods_image_url":"","min_normal_price":1639,"has_coupon":true,"create_at":1548148491,"min_group_price":1390,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":6,"plusAmount":11},{"avg_desc":483,"category_name":"海淘","coupon_remain_quantity":1000,"avg_serv":486,"avg_lgst":486,"serv_pct":0.7977,"promotion_rate":200,"promotion_amount":0,"sold_quantity":487901,"sales_tip":"10万+","coupon_min_order_amount":200,"lgst_pct":0.8042,"category_id":12,"mall_id":538825,"goods_eval_score":4,"mall_name":"巧妇优生活日化用品旗舰店","mall_type":"PDD","coupon_total_quantity":10000,"desc_pct":0.8129,"merchant_type":3,"goods_name":"[冷水去油腻]青柠檬洗洁精餐具清洁剂瓜果蔬菜一洗净无残留食品级","goods_eval_count":59510,"goods_id":279931893,"opt_name":"海淘","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2018-12-28/9f19864e73218984f50b7068ffdc9ca4.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2018-10-16/8ae6e2afb090b7a51920ab7becce4ef4.jpeg","min_normal_price":1190,"has_coupon":true,"create_at":1539678688,"min_group_price":890,"mall_cps":1,"coupon_start_time":1557504000,"coupon_discount":200,"coupon_end_time":1558108799,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":69,"plusAmount":110},{"avg_desc":482,"category_name":"海淘","coupon_remain_quantity":49000,"avg_serv":486,"avg_lgst":487,"serv_pct":0.8227,"promotion_rate":10,"promotion_amount":0,"sold_quantity":26,"sales_tip":"26","coupon_min_order_amount":20000,"lgst_pct":0.8577,"category_id":12,"mall_id":954822083,"goods_eval_score":0,"mall_name":"雅阳家居","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0.7043,"merchant_type":6,"goods_name":"帝喜居家不粘锅三件套装锅具炒锅煎锅汤锅","goods_eval_count":0,"goods_id":5795034585,"opt_name":"海淘","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-01-28/417b18bc02683517edeb23fa86093aff.jpeg","goods_image_url":"","min_normal_price":49900,"has_coupon":true,"create_at":1548643353,"min_group_price":39900,"mall_cps":1,"coupon_start_time":1556035200,"coupon_discount":20000,"coupon_end_time":1559318399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":99,"plusAmount":159},{"avg_desc":467,"category_name":"鞋包","coupon_remain_quantity":900,"avg_serv":475,"avg_lgst":475,"serv_pct":0.4745,"promotion_rate":250,"promotion_amount":0,"sold_quantity":4182,"sales_tip":"4182","coupon_min_order_amount":2000,"lgst_pct":0.5105,"category_id":1281,"mall_id":723894,"goods_eval_score":0,"mall_name":"重装狼牙ZZLY品质臻享","mall_type":"PDD","coupon_total_quantity":1000,"desc_pct":0.393,"merchant_type":1,"goods_name":"男女同款运动鞋皮面防水防滑2019休闲跑步鞋韩版中学生品牌旅游鞋","goods_eval_count":0,"goods_id":2647403939,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2018-08-19/031fb6b980f6a5a12f4968e03e860114.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2018-08-19/79e8d37c23db184ebf2509dd45085107.jpeg","min_normal_price":9800,"has_coupon":true,"create_at":1537406935,"min_group_price":5900,"mall_cps":1,"coupon_start_time":1557763200,"coupon_discount":2000,"coupon_end_time":1558195199,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":487,"plusAmount":780}],"total_count":4}
         */

        private GoodsSearchResponseBean goods_search_response;

        public GoodsSearchResponseBean getGoods_search_response() {
            return goods_search_response;
        }

        public void setGoods_search_response(GoodsSearchResponseBean goods_search_response) {
            this.goods_search_response = goods_search_response;
        }

        public static class GoodsSearchResponseBean {
            /**
             * goods_list : [{"avg_desc":487,"category_name":"食品","coupon_remain_quantity":0,"avg_serv":488,"avg_lgst":488,"serv_pct":0.9009,"promotion_rate":10,"promotion_amount":0,"sold_quantity":58653,"sales_tip":"5.8万","coupon_min_order_amount":0,"lgst_pct":0.9071,"category_id":1,"mall_id":595462419,"goods_eval_score":4,"mall_name":"云鹜食品专营店","mall_type":"PDD","coupon_total_quantity":0,"desc_pct":0.8869,"merchant_type":5,"goods_name":"云鹤厨秘书手抓饼】原味手抓饼早餐饼速食煎饼商用家庭装20片25片","goods_eval_count":1658,"goods_id":5765251970,"opt_name":"食品","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-04-03/09f2824074f9e2991215cff613110247.jpeg","goods_image_url":"","min_normal_price":1639,"has_coupon":true,"create_at":1548148491,"min_group_price":1390,"mall_cps":1,"coupon_start_time":0,"coupon_discount":0,"coupon_end_time":0,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":6,"plusAmount":11},{"avg_desc":483,"category_name":"海淘","coupon_remain_quantity":1000,"avg_serv":486,"avg_lgst":486,"serv_pct":0.7977,"promotion_rate":200,"promotion_amount":0,"sold_quantity":487901,"sales_tip":"10万+","coupon_min_order_amount":200,"lgst_pct":0.8042,"category_id":12,"mall_id":538825,"goods_eval_score":4,"mall_name":"巧妇优生活日化用品旗舰店","mall_type":"PDD","coupon_total_quantity":10000,"desc_pct":0.8129,"merchant_type":3,"goods_name":"[冷水去油腻]青柠檬洗洁精餐具清洁剂瓜果蔬菜一洗净无残留食品级","goods_eval_count":59510,"goods_id":279931893,"opt_name":"海淘","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2018-12-28/9f19864e73218984f50b7068ffdc9ca4.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2018-10-16/8ae6e2afb090b7a51920ab7becce4ef4.jpeg","min_normal_price":1190,"has_coupon":true,"create_at":1539678688,"min_group_price":890,"mall_cps":1,"coupon_start_time":1557504000,"coupon_discount":200,"coupon_end_time":1558108799,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":69,"plusAmount":110},{"avg_desc":482,"category_name":"海淘","coupon_remain_quantity":49000,"avg_serv":486,"avg_lgst":487,"serv_pct":0.8227,"promotion_rate":10,"promotion_amount":0,"sold_quantity":26,"sales_tip":"26","coupon_min_order_amount":20000,"lgst_pct":0.8577,"category_id":12,"mall_id":954822083,"goods_eval_score":0,"mall_name":"雅阳家居","mall_type":"PDD","coupon_total_quantity":50000,"desc_pct":0.7043,"merchant_type":6,"goods_name":"帝喜居家不粘锅三件套装锅具炒锅煎锅汤锅","goods_eval_count":0,"goods_id":5795034585,"opt_name":"海淘","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2019-01-28/417b18bc02683517edeb23fa86093aff.jpeg","goods_image_url":"","min_normal_price":49900,"has_coupon":true,"create_at":1548643353,"min_group_price":39900,"mall_cps":1,"coupon_start_time":1556035200,"coupon_discount":20000,"coupon_end_time":1559318399,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":99,"plusAmount":159},{"avg_desc":467,"category_name":"鞋包","coupon_remain_quantity":900,"avg_serv":475,"avg_lgst":475,"serv_pct":0.4745,"promotion_rate":250,"promotion_amount":0,"sold_quantity":4182,"sales_tip":"4182","coupon_min_order_amount":2000,"lgst_pct":0.5105,"category_id":1281,"mall_id":723894,"goods_eval_score":0,"mall_name":"重装狼牙ZZLY品质臻享","mall_type":"PDD","coupon_total_quantity":1000,"desc_pct":0.393,"merchant_type":1,"goods_name":"男女同款运动鞋皮面防水防滑2019休闲跑步鞋韩版中学生品牌旅游鞋","goods_eval_count":0,"goods_id":2647403939,"opt_name":"鞋包","goods_thumbnail_url":"https://t00img.yangkeduo.com/goods/images/2018-08-19/031fb6b980f6a5a12f4968e03e860114.jpeg","goods_image_url":"https://t00img.yangkeduo.com/goods/images/2018-08-19/79e8d37c23db184ebf2509dd45085107.jpeg","min_normal_price":9800,"has_coupon":true,"create_at":1537406935,"min_group_price":5900,"mall_cps":1,"coupon_start_time":1557763200,"coupon_discount":2000,"coupon_end_time":1558195199,"goods_gallery_urls":null,"platform":null,"coupon_price":0,"awardAmount":487,"plusAmount":780}]
             * total_count : 4
             */

            private int total_count;
            private List<GoodsListBean> goods_list;

            public int getTotal_count() {
                return total_count;
            }

            public void setTotal_count(int total_count) {
                this.total_count = total_count;
            }

            public List<GoodsListBean> getGoods_list() {
                return goods_list;
            }

            public void setGoods_list(List<GoodsListBean> goods_list) {
                this.goods_list = goods_list;
            }

            public static class GoodsListBean {
                /**
                 * avg_desc : 487
                 * category_name : 食品
                 * coupon_remain_quantity : 0
                 * avg_serv : 488
                 * avg_lgst : 488
                 * serv_pct : 0.9009
                 * promotion_rate : 10
                 * promotion_amount : 0
                 * sold_quantity : 58653
                 * sales_tip : 5.8万
                 * coupon_min_order_amount : 0
                 * lgst_pct : 0.9071
                 * category_id : 1
                 * mall_id : 595462419
                 * goods_eval_score : 4
                 * mall_name : 云鹜食品专营店
                 * mall_type : PDD
                 * coupon_total_quantity : 0
                 * desc_pct : 0.8869
                 * merchant_type : 5
                 * goods_name : 云鹤厨秘书手抓饼】原味手抓饼早餐饼速食煎饼商用家庭装20片25片
                 * goods_eval_count : 1658
                 * goods_id : 5765251970
                 * opt_name : 食品
                 * goods_thumbnail_url : https://t00img.yangkeduo.com/goods/images/2019-04-03/09f2824074f9e2991215cff613110247.jpeg
                 * goods_image_url :
                 * min_normal_price : 1639
                 * has_coupon : true
                 * create_at : 1548148491
                 * min_group_price : 1390
                 * mall_cps : 1
                 * coupon_start_time : 0
                 * coupon_discount : 0
                 * coupon_end_time : 0
                 * goods_gallery_urls : null
                 * platform : null
                 * coupon_price : 0
                 * awardAmount : 6
                 * plusAmount : 11
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
                private Object goods_gallery_urls;
                private Object platform;
                private int coupon_price;
                private int awardAmount;
                private int plusAmount;

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

                public Object getGoods_gallery_urls() {
                    return goods_gallery_urls;
                }

                public void setGoods_gallery_urls(Object goods_gallery_urls) {
                    this.goods_gallery_urls = goods_gallery_urls;
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
            }
        }
    }
}

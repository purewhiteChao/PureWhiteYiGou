package com.example.purewhiteyigou.model.bean;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 18:10
 * Describe: ${as}
 */
public class TablayoutBean {

    /**
     * message : 成功
     * code : 0000
     * success : true
     * entity : {"goods_opt_list":[{"parent_opt_id":0,"level":1,"opt_name":"精选","opt_id":-99},{"parent_opt_id":0,"level":1,"opt_name":"食品","opt_id":1},{"parent_opt_id":0,"level":1,"opt_name":"母婴","opt_id":4},{"parent_opt_id":0,"level":1,"opt_name":"海淘","opt_id":12},{"parent_opt_id":0,"level":1,"opt_name":"水果","opt_id":13},{"parent_opt_id":0,"level":1,"opt_name":"女装","opt_id":14},{"parent_opt_id":0,"level":1,"opt_name":"百货","opt_id":15},{"parent_opt_id":0,"level":1,"opt_name":"美妆","opt_id":16},{"parent_opt_id":0,"level":1,"opt_name":"电器","opt_id":18},{"parent_opt_id":0,"level":1,"opt_name":"充值","opt_id":590},{"parent_opt_id":0,"level":1,"opt_name":"男装","opt_id":743},{"parent_opt_id":0,"level":1,"opt_name":"家纺","opt_id":818},{"parent_opt_id":0,"level":1,"opt_name":"鞋包","opt_id":1281},{"parent_opt_id":0,"level":1,"opt_name":"内衣","opt_id":1282},{"parent_opt_id":0,"level":1,"opt_name":"运动","opt_id":1451},{"parent_opt_id":0,"level":1,"opt_name":"手机","opt_id":1543},{"parent_opt_id":0,"level":1,"opt_name":"家装","opt_id":1917},{"parent_opt_id":0,"level":1,"opt_name":"汽车","opt_id":2048},{"parent_opt_id":0,"level":1,"opt_name":"电脑","opt_id":2478},{"parent_opt_id":0,"level":1,"opt_name":"生活个护","opt_id":2946},{"parent_opt_id":0,"level":1,"opt_name":"大家电","opt_id":2964},{"parent_opt_id":0,"level":1,"opt_name":"家具","opt_id":2974},{"parent_opt_id":0,"level":1,"opt_name":"手机","opt_id":3132},{"parent_opt_id":0,"level":1,"opt_name":"电脑","opt_id":3149},{"parent_opt_id":0,"level":1,"opt_name":"数码","opt_id":3162},{"parent_opt_id":0,"level":1,"opt_name":"文化","opt_id":3175},{"parent_opt_id":0,"level":1,"opt_name":"医药","opt_id":3279},{"parent_opt_id":0,"level":1,"opt_name":"办公","opt_id":3526},{"parent_opt_id":0,"level":1,"opt_name":"厨房电器","opt_id":5127},{"parent_opt_id":0,"level":1,"opt_name":"精选","opt_id":8569},{"parent_opt_id":0,"level":1,"opt_name":"女装","opt_id":8572},{"parent_opt_id":0,"level":1,"opt_name":"男装","opt_id":8581},{"parent_opt_id":0,"level":1,"opt_name":"食品","opt_id":8584},{"parent_opt_id":0,"level":1,"opt_name":"母婴","opt_id":8587},{"parent_opt_id":0,"level":1,"opt_name":"百货","opt_id":8590},{"parent_opt_id":0,"level":1,"opt_name":"美妆","opt_id":8593},{"parent_opt_id":0,"level":1,"opt_name":"运动","opt_id":8596},{"parent_opt_id":0,"level":1,"opt_name":"内衣","opt_id":8599},{"parent_opt_id":0,"level":1,"opt_name":"家纺","opt_id":8602},{"parent_opt_id":0,"level":1,"opt_name":"鞋包","opt_id":8605},{"parent_opt_id":0,"level":1,"opt_name":"家装","opt_id":8608},{"parent_opt_id":0,"level":1,"opt_name":"家具","opt_id":8611}]}
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
        private List<GoodsOptListBean> goods_opt_list;

        public List<GoodsOptListBean> getGoods_opt_list() {
            return goods_opt_list;
        }

        public void setGoods_opt_list(List<GoodsOptListBean> goods_opt_list) {
            this.goods_opt_list = goods_opt_list;
        }

        public static class GoodsOptListBean {
            /**
             * parent_opt_id : 0
             * level : 1
             * opt_name : 精选
             * opt_id : -99
             */

            private int parent_opt_id;
            private int level;
            private String opt_name;
            private int opt_id;

            public int getParent_opt_id() {
                return parent_opt_id;
            }

            public void setParent_opt_id(int parent_opt_id) {
                this.parent_opt_id = parent_opt_id;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getOpt_name() {
                return opt_name;
            }

            public void setOpt_name(String opt_name) {
                this.opt_name = opt_name;
            }

            public int getOpt_id() {
                return opt_id;
            }

            public void setOpt_id(int opt_id) {
                this.opt_id = opt_id;
            }
        }
    }
}

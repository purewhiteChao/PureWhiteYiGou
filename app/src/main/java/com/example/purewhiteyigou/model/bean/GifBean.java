package com.example.purewhiteyigou.model.bean;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/15 0015
 * Time: 18:23
 * Describe: ${as}
 */
public class GifBean {

    /**
     * message : 成功
     * code : 0000
     * success : true
     * entity : [{"list":[{"id":9,"name":"春季家装节","code":"","type":2,"image":"/upload/mavendemo/book/20190422/1555897172867605263.gif","head_image":"","url":"https://mobile.yangkeduo.com/promotion_subject.html?_pdd_fs=1&_pdd_tc=ffffff&_pdd_sbs=1&_pdd_nc=1439be&type=2&subject_id=13800&list_token=577243847_3035641914_4054097764&list_id=Vi6viDU4kX&refer_page_name=index&refer_page_id=10002_1554859858479_IUjhgRbXh8&refer_page_sn=10002","state":1,"row":1,"col":1,"them_type_str":null}],"row":1},{"list":[{"id":18,"name":"春尚新女装","code":"nz","type":1,"image":"/upload/mavendemo/book/20190422/1555897298372975078.gif","head_image":"/upload/mavendemo/book/20190422/1555897309127438206.jpg","url":"https://www.58cangshu.com/plus/subject_queen.html?themeCode=nz","state":1,"row":2,"col":2,"them_type_str":"[{\"name\":\"爆款推荐\",\"type\":\"baokuantuijian\"},{\"name\":\"疯狂抢购\",\"type\":\"fengkuangqianggou\"},{\"name\":\"针织衫\",\"type\":\"zhenzhishan\"},{\"name\":\"卫衣\",\"type\":\"weiyi\"},{\"name\":\"短外套\",\"type\":\"duanwaitao\"},{\"name\":\"短袖\",\"type\":\"duanxiu\"},{\"name\":\"衬衣打底\",\"type\":\"chenyidadi\"}]"}],"row":2}]
     */

    private String message;
    private String code;
    private boolean success;
    private List<EntityBean> entity;

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

    public List<EntityBean> getEntity() {
        return entity;
    }

    public void setEntity(List<EntityBean> entity) {
        this.entity = entity;
    }

    public static class EntityBean {
        /**
         * list : [{"id":9,"name":"春季家装节","code":"","type":2,"image":"/upload/mavendemo/book/20190422/1555897172867605263.gif","head_image":"","url":"https://mobile.yangkeduo.com/promotion_subject.html?_pdd_fs=1&_pdd_tc=ffffff&_pdd_sbs=1&_pdd_nc=1439be&type=2&subject_id=13800&list_token=577243847_3035641914_4054097764&list_id=Vi6viDU4kX&refer_page_name=index&refer_page_id=10002_1554859858479_IUjhgRbXh8&refer_page_sn=10002","state":1,"row":1,"col":1,"them_type_str":null}]
         * row : 1
         */

        private int row;
        private List<ListBean> list;

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 9
             * name : 春季家装节
             * code :
             * type : 2
             * image : /upload/mavendemo/book/20190422/1555897172867605263.gif
             * head_image :
             * url : https://mobile.yangkeduo.com/promotion_subject.html?_pdd_fs=1&_pdd_tc=ffffff&_pdd_sbs=1&_pdd_nc=1439be&type=2&subject_id=13800&list_token=577243847_3035641914_4054097764&list_id=Vi6viDU4kX&refer_page_name=index&refer_page_id=10002_1554859858479_IUjhgRbXh8&refer_page_sn=10002
             * state : 1
             * row : 1
             * col : 1
             * them_type_str : null
             */

            private int id;
            private String name;
            private String code;
            private int type;
            private String image;
            private String head_image;
            private String url;
            private int state;
            private int row;
            private int col;
            private Object them_type_str;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getHead_image() {
                return head_image;
            }

            public void setHead_image(String head_image) {
                this.head_image = head_image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public int getRow() {
                return row;
            }

            public void setRow(int row) {
                this.row = row;
            }

            public int getCol() {
                return col;
            }

            public void setCol(int col) {
                this.col = col;
            }

            public Object getThem_type_str() {
                return them_type_str;
            }

            public void setThem_type_str(Object them_type_str) {
                this.them_type_str = them_type_str;
            }
        }
    }
}

package com.zs.entity;

import lombok.Data;

@Data
public class AdsAdmin {
    //Banner的id
    private String id;
    //用于区分是banner、广告位、还是附近导航banner
    private String adPositionId;
    //门店id
    private String shopId;
    //Banner图
    private String imageUrl;
    //跳转的链接
    private String url;
    //是纯图片还是跳转的图片
    private String type;
    //Banner的名字
    private String name;
    //优先级
    private String grade;
    //是否删除
    private int isdel;
}

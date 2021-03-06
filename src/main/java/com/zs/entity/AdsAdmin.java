package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 广告管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Data
public class AdsAdmin {
    //Banner的id
    private Integer id;
    //用于区分是banner、广告位、还是附近导航banner
    private Integer adPositionId;
    //门店id
    private Integer shopId;
    //Banner图
    private String imageUrl;
    //跳转的链接
    private String url;
    //是纯图片还是跳转的图片
    private Integer type;
    //Banner的名字
    private String name;
    //优先级
    private Integer grade;
    //是否删除
    private int isdel;
}

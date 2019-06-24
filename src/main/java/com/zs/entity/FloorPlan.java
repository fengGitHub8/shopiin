package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 楼层平面实体类
 * @author: FengYang
 * @create: 2019-06-24 11:40
 **/
@Data
public class FloorPlan {
    //楼层id
    private Integer id;
    //门店id
    private Integer shopId;
    //所属的营业场所的id
    private Integer doBusinessSiteId;
    /**
     * 所属的营业场所的名字
     */
    private String doBusinessSiteName;
    /**
     *所属的门店的名字
     */
    private String shopName;
    //楼层的名字
    private String name;
    //楼层的平面图
    private String imageUrl;
    //楼层（纯数字）
    private Integer floor;
    //店铺位置
    private String storeLocations;
    //楼层的二维码
    private String qrcodeImage;
    //楼层的二维码的文字
    private String qrcodeText;
    //楼层的状态
    private String status;
    //优先级
    private Integer grade;
    //是否显示
    private Integer display;


}

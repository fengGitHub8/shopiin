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
    private Integer id;
    private Integer shopId;
    private Integer doBusinessSiteId;
    /**
     * 所属的营业场所的名字
     */
    private String doBusinessSiteName;
    /**
     *所属的门店的名字
     */
    private String shopName;
    private String name;
    private String imageUrl;
    private Integer floor;
    private String storeLocations;
    private String qrcodeImage;
    private String qrcodeText;
    private String status;
    private Integer grade;
    private Integer display;


}

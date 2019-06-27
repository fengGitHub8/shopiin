package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 营业场所实体类
 * @author: FengYang
 * @create: 2019-06-24 10:25
 **/
@Data
public class BusinessSite {
    //营业场所id
    private Integer id;
    //门店id
    private Integer shopId;
    //营业场所的名字
    private String name;
    //简介
    private String introduce;
    //该营业场所的状态
    private Integer status;
    //二维码图片
    private String qrcodeImage;
    //二维码文字
    private String qrcodeText;
    //楼层对象
    private FloorPlan floorPlan;
}

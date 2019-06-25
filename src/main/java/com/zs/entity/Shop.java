package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description:门店
 * @author: FengYang
 * @create: 2019-06-22 15:04
 **/
@Data
public class Shop {
    //门店id
    private Integer id;
    //门店名字
    private String name;
    //门店地址
    private String address;
    //门店的门头图
    private String images;
    //门店的电话
    private String tel;
    //营业时间
    private String businessHours;
    //门店的经度
    private Double longitude;
    //门店的纬度
    private Double latitude;
    //位置
    private String distance;
    //图标
    private String icon;
    //类型
    private String type;
    //门店的地图
    private String map;
    //门店的热搜
    private String hotSearch;
    //门店的二维码图
    private String qrcodeImage;
    //二维码的说明文字
    private String qrcondeText;
    //门店的状态
    private String status;
}

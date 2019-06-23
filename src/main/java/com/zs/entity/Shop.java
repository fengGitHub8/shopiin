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
    private Integer id;
    private String name;
    private String address;
    private String images;
    private String tel;
    private String businessHours;
    private Double longitude;
    private Double latitude;
    private String distance;
    private String icon;
    private String type;
    private String map;
    private String hotSearch;
    private String qrcodeImage;
    private String qrcondeText;
    private String status;
}

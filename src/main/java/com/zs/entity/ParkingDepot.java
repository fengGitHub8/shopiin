package com.zs.entity;

import lombok.Data;

/**
 * @Classname ParkingDepot
 * @Description 停车场管理实体类
 * @Date 2019/6/25 16:37
 * @Created by GuiPeng
 */

@Data
public class ParkingDepot {

//    停车场id
    private Integer id;

//    门店id
    private Integer shopId;

//    营业场所id
    private Integer doBusinessSiteId;

//    营业场所名字
    private String doBusinessSiteName;

//    楼层id
    private Integer floorId;

//    楼层名字
    private String floorName;

//    停车场名字
    private String name;

//    停车场的图片
    private String image;

//    停车场的介绍
    private String introduce;

//    状态(1为启用，0为禁用，2为删除)
    private Integer status;

//    二维码
    private String qrcodeImage;

//    二维码的文字
    private String qrcodeText;

}

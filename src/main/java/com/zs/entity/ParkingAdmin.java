package com.zs.entity;

import lombok.Data;

/**
 * @Classname ParkingAdmin
 * @Description 停车位的实体类
 * @Date 2019/6/25 22:07
 * @Created by GuiPeng
 */

@Data
public class ParkingAdmin {

//    停车位id
    private Integer id;

//    门店id
    private Integer shopId;

//    停车场id
    private Integer parkingDepotId;

//    停车场名字
    private String parkingName;

//    停车位名字
    private String name;

//    状态(1为启用，0为禁用，2为删除)
    private Integer status;

//    二维码
    private String qrcodeImage;

//    二维码的文字
    private String qrcodeText;
}

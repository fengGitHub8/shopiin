package com.zs.entity;

import lombok.Data;

import java.util.List;

/**
 * @Classname StoreAdmin
 * @Description 商铺或公共服务场所管理实体类
 * @Date 2019/6/25 9:48
 * @Created by GuiPeng
 */

@Data
public class StoreAdmin {

//    商铺或公共服务场所的id
    private Integer id;

//    门店id
    private Integer shopId;

//    商铺或公共服务场所的名字
    private String name;

//    品类id
    private Integer categoryId;

//    品类名字
    private String categoryName;

/*//    类型id
    private Integer storeTypeId;

//    类型名字
    private String storeTypeName;*/

//    类型实体类
    private StoreType storeType;

//    营业场所id
    private Integer doBusinessSiteId;

//    营业场所名字
    private String doBusinessSiteName;

//    楼层id
    private Integer floorId;

//    楼层名字
    private String floorName;

//    介绍
    private String introduce;

//    门头图
    private String logoImageUrl;

//    状态(1为启用，0为禁用，2为删除)
    private Integer status;

//    关键字
    private String keywords;

//    标签
    private String storeMas;

//    二维码
    private String qrcodeImage;

//    二维码的文字
    private String qrcodeText;

//    商铺品牌
    private List<Brand> brandList;

//    商铺id拼接
    private List brandIds;
}

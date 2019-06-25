package com.zs.entity;

import lombok.Data;

/**
 * @Classname StoreType
 * @Description 商铺类型和公共服务类型
 * @Date 2019/6/23 17:49
 * @Created by GuiPeng
 */
@Data
public class StoreType {

//    商铺类型或公共服务类型id
    private Integer id;

//    门店id
    private Integer shopId;

//    商铺类型或公共服务类型的名字
    private String name;

//    区分商铺类型(store)还是公共服务类型(service)
    private String type;

//    状态(1为启用，0为禁用，2为删除)
    private Integer status;

}

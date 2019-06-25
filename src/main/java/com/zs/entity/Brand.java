package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 品牌实体类
 * @author: FengYang
 * @create: 2019-06-24 15:24
 **/
@Data
public class Brand {
    //品牌的id
    private Integer id;
    //门店id
    private Integer shopId;
    //品牌
    private String brandType;
    //Logo
    private String logo;
    //品牌的状态
    private String Status;
}

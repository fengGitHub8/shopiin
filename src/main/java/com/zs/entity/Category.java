package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 品类管理实体类
 * @author: FengYang
 * @create: 2019-06-24 14:30
 **/
@Data
public class Category {
    //品类的id
    private Integer id;
    //门店id
    private Integer shopId;
    /**
     * 门店的名字
     */
    private String shopName;
    //品类的名字，如男装
    private String type;
    //该品类下面的状态
    private Integer status;
    //品类的优先级
    private Integer grade;
}

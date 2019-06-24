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
    private Integer id;
    private Integer shopId;
    /**
     * 门店名
     */
    private String shopName;
    private String type;
    private String status;
    private Integer grade;
}

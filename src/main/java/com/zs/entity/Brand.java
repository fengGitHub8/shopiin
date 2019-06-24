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
    private Integer id;
    private Integer shopId;
    private String brandType;
    private String logo;
    private String Status;
}

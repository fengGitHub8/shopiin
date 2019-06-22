package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description:管理人员
 * @author: FengYang
 * @create: 2019-06-22 10:31
 **/
@Data
public class Admin {
    private Integer id;
    private String type;
    private String shopIds;
    private String name;
    private String tel;
    private String user;
    private String password;
    private Integer status;
    private String token;
}

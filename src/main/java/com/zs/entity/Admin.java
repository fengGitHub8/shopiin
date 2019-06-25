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
    //管理员id
    private Integer id;
    //类型
    private String type;
    //管理的门店
    private String shopIds;
    //名字
    private String name;
    //电话
    private String tel;
    //登录账号
    private String user;
    //登录密码
    private String password;
    //状态
    private Integer status;
    //token
    private String token;
}

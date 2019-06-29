package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 会员俱乐部
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Data
public class MemberClub {
    //会员club的id
    private Integer id;
    //会员club的名字
    private String name;
    //会员club的图片
    private String image;
    //会员club的路径
    private String url;
}

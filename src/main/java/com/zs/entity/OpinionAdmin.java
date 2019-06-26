package com.zs.entity;

import lombok.Data;

@Data
public class OpinionAdmin {
    //意见反馈id
    private String id;
    //门店id
    private String shopId;
    //用户id
    private String userId;
    //意见反馈的类型
    private String type;
    //意见反馈的内容
    private String content;
    //意见反馈的图片
    private String images;
    //用户名
    private String nickName;
    //电话
    private String tel;
    //状态
    private String status;
    //是否删除
    private Integer isdel;
}

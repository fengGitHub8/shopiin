package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 意见管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Data
public class OpinionAdmin {
    //意见反馈id
    private Integer id;
    //门店id
    private Integer shopId;
    //用户id
    private Integer userId;
    //意见反馈的类型
    private Integer type;
    //意见反馈的内容
    private String content;
    //意见反馈的图片
    private String images;
    //用户名
    private String nickName;
    //电话
    private String tel;
    //状态
    private Integer status;
    //是否删除
    private Integer isdel;
}

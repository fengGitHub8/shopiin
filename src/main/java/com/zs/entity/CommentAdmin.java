package com.zs.entity;

import lombok.Data;

@Data
public class CommentAdmin {
    //评论id
    private Integer id;
    //门店id
    private String shopId;
    //门店id
    private Integer storeId;
    //用户id
    private Integer userId;
    //用户名
    private String nickName;
    //
    private Integer score;
    //评论图
    private String imageUrls;
    //评论时间
    private String time;
    //评论内容
    private String content;
    //评论状态
    private String status;

}

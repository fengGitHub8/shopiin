package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 无线电管理
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Data
public class RadioAdmin {
    //广告的id
    private Integer id;
    //门店id
    private Integer shopId;
    //标题
    private String title;
    //内容
    private String content;
    //优先级
    private String grade;
    //是否删除
    private Integer isdel;
}

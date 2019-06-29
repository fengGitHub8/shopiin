package com.zs.entity;

import lombok.Data;

/**
 * @program: shopin
 * @description: 楼层管理
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Data
public class FloorsAdmin {
    //该楼层的id
    private Integer id;
    //门店id
    private Integer shopId;
    //类型
    private Integer type;
    //标题
    private String title;
    //副标题
    private String viceTitle;
    //Banner图
    private String banner;
    //Banner图的路径
    private String bannerUrl;
    //优先级
    private Integer grade;
    //是否删除
    private Integer isdel;
}

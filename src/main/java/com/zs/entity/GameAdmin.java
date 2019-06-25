package com.zs.entity;

import lombok.Data;

import java.util.List;

/**
 * @Classname GameAdmin
 * @Description 小游戏管理
 * @Date 2019/6/24 10:20
 * @Created by GuiPeng
 */

@Data
public class GameAdmin {

//    小游戏id
    private Integer id;

//    小游戏名字
    private String name;

//    门店id
    private Integer shopId;

//    游戏介绍
    private String content;

//    宣传图
    private String advertising;

//    游戏规则
    private String rule;

//    游戏时长
    private Integer time;

//    游戏图片
    private String image;

//    背景图片
    private String bgImage;

//    游戏路径
    private String gameUrl;

//    状态(1为启用，0为禁用，2为删除)
    private Integer status;




}

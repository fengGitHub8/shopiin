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

//    状态（0启用 1禁用）
    private Integer status;

//    是否删除（0正常 1删除）
    private Integer isdel;


}

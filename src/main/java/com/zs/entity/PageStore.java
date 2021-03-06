package com.zs.entity;

import lombok.Data;

/**
 * @program: PageStore
 * @description:
 * @author: ZWX
 * @create: 2019/6/27 11:51
 **/
@Data
public class PageStore {
    //id
    private Integer id;
    //门店id
    private Integer storeId;
    //是FloorsAdmin里面的id
    private Integer pageFloorId;
    //标题
    private String title;
    //图标
    private String image;
    //跳转的链接
    private String url;
    //优先级
    private Integer grade;
    //类型
    private Integer type;
}

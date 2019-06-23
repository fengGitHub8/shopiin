package com.zs.entity;

import lombok.Data;


/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-23 22:39
 **/
@Data
public class OperState {
    private Integer id;
    private Integer shopId;
    private Integer pv;
    private Integer uv;
    private Integer gameCoupon;
    private Integer heanCoupon;
    private Integer floorCoupon;
    private Integer parking;
    private Integer comment;
    private Integer opinion;
    private Integer fightfChartPV;
    private Integer fightfChartUV;
    private Integer yesYesTouchPV;
    private Integer yesYesTouchUV;
    private String date;

}

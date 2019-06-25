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
    //id
    private Integer id;
    //门店id
    private Integer shopId;
    //浏览量
    private Integer pv;
    //用户量
    private Integer uv;
    //游戏优惠券领取数量
    private Integer gameCoupon;
    //首页广告位优惠券领取数量
    private Integer heanCoupon;
    //首页楼层优惠券领取数量
    private Integer floorCoupon;
    //停车次数
    private Integer parking;
    //评论次数
    private Integer comment;
    //意见反馈次数
    private Integer opinion;
    //拼图PV
    private Integer fightfChartPV;
    //拼图UV
    private Integer fightfChartUV;
    //对对碰PV
    private Integer yesYesTouchPV;
    //对对碰UV
    private Integer yesYesTouchUV;
    //日期（泛指今日）
    private String date;

}

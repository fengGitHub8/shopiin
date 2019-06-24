package com.zs.service;

import com.zs.entity.FloorPlan;

import java.util.List;

/**
 * @program: shopin
 * @description: 楼层平面Service接口
 * @author: FengYang
 * @create: 2019-06-24 12:20
 **/
public interface FloorPlanService {
    /**
     * 根据shopId查询楼层平面信息
     * @param shopId
     * @return
     */
    List<FloorPlan> findByShopId(String shopId);

    /**
     * 添加楼层平面信息
     * @param floorPlan
     * @return
     */
    Boolean addFloorPlan(FloorPlan floorPlan);

    /**
     * 修改楼层平面信息
     * @param floorPlan
     * @return
     */
    Boolean updateFloorPlan(FloorPlan floorPlan);

    /**
     * 删除楼层平面信息，修改status = 0
     * @param id
     * @return
     */
    Boolean deleteFloorPlan(String id);
}

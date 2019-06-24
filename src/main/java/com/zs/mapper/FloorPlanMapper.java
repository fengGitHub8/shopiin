package com.zs.mapper;

import com.zs.VO.ResultVO;
import com.zs.entity.FloorPlan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: shopin
 * @description: 楼层平面mapper接口
 * @author: FengYang
 * @create: 2019-06-24 11:47
 **/
@Repository
public interface FloorPlanMapper {
    /**
     * 根据shopId查询楼层平面信息
     * @param shopId
     * @return
     */
    List<FloorPlan> findByShopId(int shopId);

    /**
     * 添加楼层平面信息
     * @param floorPlan
     */
    void addFloorPlan(FloorPlan floorPlan);

    /**
     * 修改楼层平面信息
     * @param floorPlan
     */
    void updateFloorPlan(FloorPlan floorPlan);

    /**
     * 删除楼层平面信息
     * @param id
     */
    void deleteFloorPlan(int id);
}
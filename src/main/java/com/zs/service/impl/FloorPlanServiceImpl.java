package com.zs.service.impl;

import com.zs.entity.FloorPlan;
import com.zs.mapper.FloorPlanMapper;
import com.zs.service.FloorPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 楼层平面Service接口实现类
 * @author: FengYang
 * @create: 2019-06-24 12:21
 **/
@Service
public class FloorPlanServiceImpl implements FloorPlanService{
    @Autowired
    private FloorPlanMapper floorPlanMapper;

    @Override
    public List<FloorPlan> findByShopId(Integer shopId) {
        List<FloorPlan> floorPlans = floorPlanMapper.findByShopId(shopId);
        return floorPlans;
    }

    @Override
    public Boolean addFloorPlan(FloorPlan floorPlan) {
        floorPlanMapper.addFloorPlan(floorPlan);
        return true;
    }

    @Override
    public Boolean updateFloorPlan(FloorPlan floorPlan) {
        floorPlanMapper.updateFloorPlan(floorPlan);
        return true;
    }

    @Override
    public Boolean deleteFloorPlan(String id) {
        floorPlanMapper.deleteFloorPlan(Integer.parseInt(id));
        return true;
    }

    @Override
    public FloorPlan findById(Integer id) {
        return floorPlanMapper.findById(id);
    }
}

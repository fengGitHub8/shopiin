package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.FloorPlan;
import com.zs.service.FloorPlanService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 楼层平面controller
 * @author: FengYang
 * @create: 2019-06-24 11:38
 **/
@Controller
@ResponseBody
@RequestMapping("/floorAdmin")
public class FloorPlanController {
    @Autowired
    private FloorPlanService floorPlanService;

    @RequestMapping("/find/{shopId}/floors")
    public ResultVO find(@PathVariable("shopId") Integer shopId){
        List<FloorPlan> floorPlans = floorPlanService.findByShopId(shopId);
        return ResultVOUtil.success(null,floorPlans);
    }

    @RequestMapping("/findById")
    public ResultVO findById(@RequestParam("id") Integer id){
        FloorPlan floorPlan = floorPlanService.findById(id);
        return ResultVOUtil.success("查询成功",floorPlan);
    }

    @RequestMapping("/add")
    public ResultVO add(FloorPlan floorPlan){
        Boolean result = floorPlanService.addFloorPlan(floorPlan);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/modify")
    public ResultVO modify(FloorPlan floorPlan){
        Boolean result = floorPlanService.updateFloorPlan(floorPlan);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/delete")
    public ResultVO delete(@RequestParam("id") String id){
        Boolean result = floorPlanService.deleteFloorPlan(id);
        return ResultVOUtil.success(result,null);
    }

}

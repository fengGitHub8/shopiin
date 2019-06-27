package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.ParkingDepot;
import com.zs.service.ParkingDepotService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname ParkingDepotController
 * @Description
 * @Date 2019/6/25 16:54
 * @Created by GuiPeng
 */

@Controller
@RequestMapping("parkingDepot")
@ResponseBody
public class ParkingDepotController {

    @Autowired
    private ParkingDepotService parkingDepotService;

    @RequestMapping("/finds")
    public ResultVO findParkingDepotsByShopId(ParkingDepot parkingDepot){
        System.err.println(parkingDepot);
        List<ParkingDepot> byShopId = parkingDepotService.findParkingDepotsByShopId(parkingDepot);
        System.err.println(byShopId);
        if (byShopId != null) {
            return ResultVOUtil.success(null,byShopId);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    @RequestMapping("/add")
    public ResultVO addParkingDepot(@RequestBody ParkingDepot parkingDepot){
        System.err.println("前端接收的数据:"+parkingDepot);
        int i = parkingDepotService.addParkingDepot(parkingDepot);
        System.err.println("判断是否添加成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("添加成功！",null);
        }else {
            return ResultVOUtil.error("添加失败!该类型已存在!",null);
        }
    }

    @RequestMapping("/modify")
    public ResultVO updateParkingDepotById(@RequestBody ParkingDepot parkingDepot){
        System.err.println("前端接收的数据:"+parkingDepot);
        int i = parkingDepotService.updateParkingDepotById(parkingDepot);
        System.err.println("判断修改是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("修改成功！",null);
        }else {
            return ResultVOUtil.error("修改失败!该类型已存在!",null);
        }
    }

    @RequestMapping("delete")
    public ResultVO deleteParkingDepotById(@RequestParam("id") Integer id){
        System.out.println("前端接收的数据:"+id);
        int i = parkingDepotService.deleteParkingDepotById(id);
        System.err.println("判断删除是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("删除成功！",null);
        }else {
            return ResultVOUtil.error("删除失败！",null);
        }
    }

    @RequestMapping("/findbyid")
    public ResultVO findById(@RequestParam("id") Integer id){
        System.err.println(id);
        ParkingDepot byId = parkingDepotService.findById(id);
        System.err.println(byId);
        if (byId != null) {
            return ResultVOUtil.success(byId,null);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }


}

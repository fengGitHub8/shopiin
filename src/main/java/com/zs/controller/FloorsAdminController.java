package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.FloorsAdmin;
import com.zs.service.FloorsAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 楼层Controller
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Controller
@ResponseBody
@RequestMapping("/pageAdAdmin")
public class FloorsAdminController {
    @Autowired
    private FloorsAdminService floorsAdminService;

    @RequestMapping("/getPageFloors")
    public ResultVO getPageFloors(int shopId) {
        List<FloorsAdmin> floorsAdmins = floorsAdminService.getPageFloors(shopId);
        return ResultVOUtil.success(null, floorsAdmins);
    }

    @RequestMapping("/addPageFloor")
    public ResultVO addPageFloor(FloorsAdmin floorsAdmin) {
        Boolean result = floorsAdminService.addPageFloor(floorsAdmin);
        return ResultVOUtil.success(result, null);
    }

    @RequestMapping("/modifyPageFloor")
    public ResultVO modifyPageFloor(FloorsAdmin floorsAdmin) {
        Boolean result = floorsAdminService.modifyPageFloor(floorsAdmin);
        return ResultVOUtil.success(result, null);
    }




}

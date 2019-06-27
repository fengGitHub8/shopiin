package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.RadioAdmin;
import com.zs.service.RadioAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 无线电Controller
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Controller
@ResponseBody
@RequestMapping("/pageAdAdmin")
public class RadioAdminController {
    @Autowired
    private RadioAdminService radioAdminService;

    @RequestMapping("/findRadioBroadcasts")
    public ResultVO findRadioBroadcasts(RadioAdmin radioAdmin) {
        List<RadioAdmin> radioAdmins = radioAdminService.findRadioBroadcasts(radioAdmin);
        return ResultVOUtil.success(radioAdmins, null);
    }

    @RequestMapping("/addRadioBroadcast")
    public ResultVO addRadioBroadcast(RadioAdmin radioAdmin) {
        radioAdminService.addRadioBroadcast(radioAdmin);
        return ResultVOUtil.success("添加成功", null);
    }

    @RequestMapping("/modifyRadioBroadcast")
    public ResultVO modifyRadioBroadcast(RadioAdmin radioAdmin) {
        Boolean result = radioAdminService.modifyRadioBroadcast(radioAdmin);
        return ResultVOUtil.success(result, null);
    }

    @RequestMapping("/deleteRadioBroadcast")
    public ResultVO deleteRadioBroadcast(RadioAdmin radioAdmin) {
        Boolean result = radioAdminService.deleteRadioBroadcast(radioAdmin);
        return ResultVOUtil.success(result, null);
    }
}

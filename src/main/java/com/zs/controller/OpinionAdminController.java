package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.OpinionAdmin;
import com.zs.service.OpinionAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 意见Controller
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Controller
@ResponseBody
@RequestMapping("/opinionAdmin")
public class OpinionAdminController {
    @Autowired
    private OpinionAdminService opinionAdminService;

    @RequestMapping("/finds")
    public ResultVO finds(int shopId) {
        List<OpinionAdmin> opinionAdmins = opinionAdminService.findOpinion(shopId);
        return ResultVOUtil.success(null, opinionAdmins);
    }

    @RequestMapping("/modify")
    public ResultVO modify(OpinionAdmin opinionAdmin) {
        Boolean result = opinionAdminService.modifyOpinion(opinionAdmin);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/deleteOpinion")
    public ResultVO delete(OpinionAdmin opinionAdmin) {
        Boolean result = opinionAdminService.deleteOpinion(opinionAdmin);
        return ResultVOUtil.success(result, null);
    }
}
package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.AdsAdmin;
import com.zs.service.AdsAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 广告Controller
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Controller
@ResponseBody
@RequestMapping("/pageAdAdmin")
public class AdsAdminController {
    @Autowired
    private AdsAdminService adsAdminService;

    @RequestMapping("/findAds")
    public ResultVO findAds(AdsAdmin adsAdmin) {
        List<AdsAdmin> adsAdmins = adsAdminService.findAds(adsAdmin);
        return ResultVOUtil.success(adsAdmins, null);

    }

    @RequestMapping("/addAds")
    public ResultVO addAds(AdsAdmin adsAdmin) {
        Boolean result = adsAdminService.addAds(adsAdmin);
        return ResultVOUtil.success(result, null);

    }

    @RequestMapping("/modifyAds")
    public ResultVO modifyAds(AdsAdmin adsAdmin) {
        Boolean result = adsAdminService.modifyAds(adsAdmin);
        return ResultVOUtil.success(result, null);
    }

    @RequestMapping("/deleteAds")
    public ResultVO deleteAds(AdsAdmin adsAdmin) {
        Boolean result = adsAdminService.deleteAds(adsAdmin);
        return ResultVOUtil.success(result, null);
    }
}

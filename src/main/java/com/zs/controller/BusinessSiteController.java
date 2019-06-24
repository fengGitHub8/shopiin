package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.BusinessSite;
import com.zs.service.BusinessSiteService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 营业场所Controller
 * @author: FengYang
 * @create: 2019-06-24 10:44
 **/
@Controller
@ResponseBody
@RequestMapping("/doBusinessSite")
public class BusinessSiteController {
    @Autowired
    private BusinessSiteService businessSiteService;

    @RequestMapping("/find")
    public ResultVO find(@RequestParam("shopId") String shopId){
        List<BusinessSite> businessSites = businessSiteService.findByShopId(shopId);
        return ResultVOUtil.success(businessSites,null);
    }

    @RequestMapping("/add")
    public ResultVO add(BusinessSite businessSite){
        businessSiteService.addBusinessSite(businessSite);
        return ResultVOUtil.success(businessSite.getId(),null);
    }

    @RequestMapping("/change")
    public ResultVO change(BusinessSite businessSite){
        Boolean result = businessSiteService.updateBusinessSite(businessSite);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/delete")
    public ResultVO delete(@RequestParam("id") String id){
        Boolean result = businessSiteService.deleteBusinessSite(id);
        return ResultVOUtil.success(result,null);
    }

}

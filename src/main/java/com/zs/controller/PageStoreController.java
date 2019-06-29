package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.PageStore;
import com.zs.service.PageStoreService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: PageStoreController
 * @description:
 * @author: ZWX
 * @create: 2019/6/27 11:51
 **/
@Controller
@ResponseBody
@RequestMapping("/pageAdAdmin")
public class PageStoreController {
    @Autowired
    private PageStoreService pageStoreService;

    @RequestMapping("/getPageStore")
    public ResultVO getPageStore(int pageFloorId) {
        List<PageStore> pageStores = pageStoreService.getPageStore(pageFloorId);
        return ResultVOUtil.success(null, pageStores);
    }

    @RequestMapping("/addPageStore")
    public ResultVO addPageStore(PageStore pageStore) {
        Boolean result = pageStoreService.addPageStore(pageStore);
        return ResultVOUtil.success(result, null);
    }

    @RequestMapping("/modifyPageStore")
    public ResultVO modifyPageStore(PageStore pageStore) {
        Boolean result = pageStoreService.modifyPageStore(pageStore);
        return ResultVOUtil.success(result, null);
    }
}
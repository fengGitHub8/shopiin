package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.Category;
import com.zs.service.CategoryService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 品类controller层
 * @author: FengYang
 * @create: 2019-06-24 14:27
 **/
@Controller
@ResponseBody
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/finds")
    public ResultVO finds(@RequestParam("shopId") String shopId){
        List<Category> categories = categoryService.findByShopId(shopId);
        return ResultVOUtil.success(null,categories);
    }

    @RequestMapping("/add")
    public ResultVO add(Category category){
        Boolean result = categoryService.addCategory(category);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/modify")
    public ResultVO modify(Category category){
        Boolean result = categoryService.updateCategory(category);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/delete")
    public ResultVO delete(@RequestParam("id") String id){
        Boolean result = categoryService.deleteCategory(id);
        return ResultVOUtil.success(result,null);
    }

}

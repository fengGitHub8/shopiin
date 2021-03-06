package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.Brand;
import com.zs.service.BrandService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: shopin
 * @description: 品牌信息controller
 * @author: FengYang
 * @create: 2019-06-24 15:33
 **/
@Controller
@ResponseBody
@RequestMapping("/brandAdmin")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/finds")
    public ResultVO finds(@RequestParam("shopId") Integer shopId){
        List<Brand> brands = brandService.findByShopId(shopId);
        return ResultVOUtil.success(null,brands);
    }

    @RequestMapping("/findById")
    public ResultVO findById(@RequestParam("id")Integer id){
        Brand brand = brandService.findById(id);
        return ResultVOUtil.success("查询成功",brand);
    }

    @RequestMapping("/add")
    public ResultVO add(Brand brand){
        brandService.addBrand(brand);
        return ResultVOUtil.success("添加成功",null);
    }

    @RequestMapping("/modify")
    public ResultVO modify(Brand brand){
        brandService.updateBrand(brand);
        return ResultVOUtil.success("修改成功",null);
    }

    @RequestMapping("/delete")
    public ResultVO delete(@RequestParam("id") String id){
        Boolean result = brandService.deleteBrand(id);
        return ResultVOUtil.success(result,null);
    }

    @RequestMapping("/upload")
    public ResultVO upload(@RequestParam("shopId") String shopId, MultipartFile mFile){
        brandService.readExcelFile(mFile,shopId);
        return ResultVOUtil.success("上传成功",null);
    }


}

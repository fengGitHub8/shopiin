package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.StoreType;
import com.zs.service.StoreTypeService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname StoreTypeController
 * @Description
 * @Date 2019/6/23 18:05
 * @Created by GuiPeng
 */

@Controller
@RequestMapping("/storeType")
@ResponseBody
public class StoreTypeController {

    @Autowired
    private StoreTypeService storeTypeService;

    @RequestMapping("/finds")
    public ResultVO findStoreTypes(StoreType storeType){
        System.err.println(storeType);
        List<StoreType> byShopIdAndType = storeTypeService.findStoreTypeByShopIdAndType(storeType);
        System.err.println(byShopIdAndType);
        if (byShopIdAndType != null) {
            return ResultVOUtil.success(null,byShopIdAndType);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    @RequestMapping("/add")
    public ResultVO addStoreType(@RequestBody StoreType storeType){
        System.err.println("前端接收的数据:"+storeType);
        int i = storeTypeService.addStoreType(storeType);
        System.err.println("判断是否添加成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("添加成功！",null);
        }else {
            return ResultVOUtil.error("添加失败!该类型已存在!",null);
        }
    }

    @RequestMapping("/modify")
    public ResultVO updateStoreTypeById(@RequestBody StoreType storeType){
        System.err.println("前端接收的数据:"+storeType);
        int i = storeTypeService.updateStoreTypeById(storeType);
        System.err.println("判断修改是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("修改成功！",null);
        }else {
            return ResultVOUtil.error("修改失败!该类型已存在!",null);
        }
    }

    @RequestMapping("delete")
    public ResultVO deleteStoreTypeById(@RequestParam("id") Integer id){
        System.out.println("前端接收的数据:"+id);
        int i = storeTypeService.deleteStoreTypeById(id);
        System.err.println("判断修改是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("删除成功！",null);
        }else {
            return ResultVOUtil.error("删除失败！",null);
        }
    }

    @RequestMapping("/findbyid")
    public ResultVO findById(@RequestParam("id") Integer id){
        System.err.println(id);
        StoreType byId = storeTypeService.findById(id);
        System.err.println(byId);
        if (byId != null) {
            return ResultVOUtil.success(byId,null);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

}

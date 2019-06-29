package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.StoreAdmin;
import com.zs.entity.StoreType;
import com.zs.service.StoreAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.pattern.PathPattern;

import java.util.List;

/**
 * @Classname StoreAdminController
 * @Description
 * @Date 2019/6/25 10:31
 * @Created by GuiPeng
 */

@Controller
@RequestMapping("/storeAdmin")
@ResponseBody
public class StoreAdminController {

    @Autowired
    private StoreAdminService storeAdminService;
//shopId name storeType.type
    @RequestMapping("/finds")
    public ResultVO findStoreAdmin( StoreAdmin storeAdmin){
        System.err.println(storeAdmin);
        List<StoreAdmin> byShopIdAndType = storeAdminService.findStoreAdminByShopIdAndType(storeAdmin);
        System.err.println(byShopIdAndType);
        if (byShopIdAndType != null) {
            return ResultVOUtil.success(null,byShopIdAndType);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    @RequestMapping("/add")
    public ResultVO addStoreAdmin(@RequestBody StoreAdmin storeAdmin){
        System.err.println("前端接收的数据:"+storeAdmin);
        int i = storeAdminService.addStoreAdmin(storeAdmin);
        System.err.println("判断是否添加成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("添加成功！",null);
        }else {
            return ResultVOUtil.error("添加失败!该类型已存在!",null);
        }
    }

    @RequestMapping("/modify")
    public ResultVO updateStoreAdminById(@RequestBody StoreAdmin storeAdmin){
        System.err.println("前端接收的数据:"+storeAdmin);
        int i = storeAdminService.updateStoreAdminById(storeAdmin);
        System.err.println("判断修改是否成功:"+i);
        if (i != 0) {
            return ResultVOUtil.success("修改成功！",null);
        }else {
            return ResultVOUtil.error("修改失败!该类型已存在!",null);
        }
    }

    @RequestMapping("delete")
    public ResultVO deleteStoreAdminById(@RequestParam("id") Integer id){
        System.out.println("前端接收的数据:"+id);
        int i = storeAdminService.deleteStoreAdminById(id);
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
        StoreAdmin byId = storeAdminService.findById(id);
        System.err.println(byId);
        if (byId != null) {
            return ResultVOUtil.success(byId,null);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }
}

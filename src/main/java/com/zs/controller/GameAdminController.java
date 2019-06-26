package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.GameAdmin;

import com.zs.service.GameAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname GameAdminController
 * @Description
 * @Date 2019/6/24 10:51
 * @Created by GuiPeng
 */

@Controller
@RequestMapping("/gameAdmin")
@ResponseBody
public class GameAdminController {

    @Autowired
    private GameAdminService gameAdminService;

    @RequestMapping("/findGames")
    public ResultVO findGames(GameAdmin gameAdmin){
        System.err.println(gameAdmin);
        List<GameAdmin> byShopId= gameAdminService.findGamesByShopId(gameAdmin);
        System.err.println(byShopId);
        if (byShopId != null) {
            return ResultVOUtil.success(null,byShopId);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    @RequestMapping("/addGame")
    public ResultVO addGame(GameAdmin gameAdmin){
        System.err.println("前端接收的数据:"+gameAdmin);
        int i = gameAdminService.addGame(gameAdmin);
        System.err.println("判断是否添加成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("添加成功！",null);
        }else {
            return ResultVOUtil.error("添加失败!该游戏已存在!",null);
        }
    }

    @RequestMapping("/modifGame")
    public ResultVO updateGameById(GameAdmin gameAdmin){
        System.err.println("前端接收的数据:"+gameAdmin);
        int i = gameAdminService.updateGameById(gameAdmin);
        System.err.println("判断是否修改成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("修改成功！",null);
        }else {
            return ResultVOUtil.error("修改失败!该游戏已存在!",null);
        }
    }

    @RequestMapping("/deleteGame")
    public ResultVO deleteGameById(@RequestParam("id") Integer id){
        System.err.println("前端接收的数据:"+id);
        int i = gameAdminService.deleteGameById(id);
        System.err.println("判断是否修改成功:"+i);
        if (i!= 0) {
            return ResultVOUtil.success("删除成功！",null);
        }else {
            return ResultVOUtil.error("删除失败!",null);
        }
    }

    @RequestMapping("/findbyid")
    public ResultVO findById(@RequestParam("id") Integer id){
        System.err.println(id);
        GameAdmin byId = gameAdminService.findById(id);
        System.err.println(byId);
        if (byId != null) {
            return ResultVOUtil.success(byId,null);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }


}

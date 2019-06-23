package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.Admin;
import com.zs.entity.OperState;
import com.zs.service.AdminService;
import com.zs.service.OperStateService;
import com.zs.utils.ResultVOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 10:56
 **/
@Controller
@ResponseBody
@RequestMapping("/min")
public class AdminController {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AdminService adminService;

    @Autowired
    private OperStateService operStateService;
    /**
     * 登录接口
     * @param admin
     * @return
     */
    @RequestMapping("/login")
    public ResultVO login(Admin admin){
        log.info("admin = {}",admin);
        Admin byUserAndPwd = adminService.findByUserAndPwd(admin);
        if (byUserAndPwd != null) {
            return ResultVOUtil.success(byUserAndPwd.getToken(),null);
        }else {
            return ResultVOUtil.error(null,null);
        }

    }

    /**
     * 获取管理员信息接口
     * @param token
     * @return
     */
    @RequestMapping("/infoToken")
    public ResultVO infoToken(@RequestParam("token") String token){
        Admin adminBytoken = adminService.findAdminBytoken(token);
        if (adminBytoken != null) {
            return ResultVOUtil.success(adminBytoken,null);
        }else {
            return ResultVOUtil.error(null,null);
        }
    }

    /**
     * 查看门店运营状态
     * @param shopId
     * @param date
     * @return
     */
    @RequestMapping("/find")
    public ResultVO find(@RequestParam("shopId") String shopId,@RequestParam("date") String date){
        OperState operState = operStateService.findByShopIdAndDate(shopId, date);
        return ResultVOUtil.success(operState,null);
    }

    @RequestMapping("/findAdmin")
    public ResultVO findAdmin(@RequestParam("index") String index, @RequestParam("max") String max){
        List<Admin> adminList = adminService.findAdminByIndex(index, max);
        return ResultVOUtil.success(null,adminList);
    }

    @RequestMapping("/addUser")
    public ResultVO addAdmin(Admin admin){
        log.info("admin = {}",admin);
        adminService.addAdmin(admin);
        log.info("admin = {}",admin);
        return ResultVOUtil.success("注册成功",null);
    }
}

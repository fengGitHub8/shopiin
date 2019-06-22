package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.Admin;
import com.zs.service.AdminService;
import com.zs.utils.ResultVOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/infoToken")
    public ResultVO infoToken(@RequestParam("token") String token){
        Admin adminBytoken = adminService.findAdminBytoken(token);
        if (adminBytoken != null) {
            return ResultVOUtil.success(adminBytoken,null);
        }else {
            return ResultVOUtil.error(null,null);
        }

    }

}

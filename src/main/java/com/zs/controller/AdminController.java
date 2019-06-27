package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.Admin;
import com.zs.entity.AdminType;
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

    /**
     * 查询从index到max的管理员信息
     * @param index
     * @param max
     * @return
     */
    @RequestMapping("/findAdmin")
    public ResultVO findAdmin(@RequestParam("index") String index, @RequestParam("max") String max){
        List<Admin> adminList = adminService.findAdminByIndex(index, max);
        return ResultVOUtil.success(null,adminList);
    }

    @RequestMapping("/findAdminById")
    public ResultVO findAdminById(@RequestParam("id") String id){
        Admin admin = adminService.findAdminById(id);
        return ResultVOUtil.success(null,admin);
    }

    /**
     * 添加管理员
     * @param admin
     * @return
     */
    @RequestMapping("/addUser")
    public ResultVO addAdmin(Admin admin){
        log.info("admin = {}",admin);
        adminService.addAdmin(admin);
        log.info("admin = {}",admin);
        return ResultVOUtil.success("注册成功",null);
    }

    /**
     * 修改管理员
     * @param admin
     * @return
     */
    @RequestMapping("/changeAdmin")
    public ResultVO changeAdmin(Admin admin){
        adminService.updateAdmin(admin);
        return ResultVOUtil.success("修改成功",null);
    }

    /**
     * 删除管理员
     * @param id
     * @return
     */
    @RequestMapping("/deleteAdmin")
    public ResultVO deleteAdmin(@RequestParam("id") String id){
        adminService.deleteAdmin(id);
        return ResultVOUtil.success("删除成功",null);
    }

    /**
     * 运行营数据下载
     * @param shopId
     * @param date
     * @param date2
     * @return
     */
    @RequestMapping("/creatorExcel")
    public ResultVO creatorExcel(@RequestParam("shopId") String shopId,
                                 @RequestParam("date") String date,
                                 @RequestParam("date2") String date2){

        List<OperState> operStates = operStateService.findByBeginAndEndTime(shopId, date, date2);
        return ResultVOUtil.success(null,operStates);
    }

    /**
     * 查询所有管理员类别信息
     * @return
     */
    @RequestMapping("/findAdminTypes")
    public ResultVO findAdminType(){
        List<AdminType> allType = adminService.findAllType();
        return ResultVOUtil.success("查询成功",allType);
    }
}

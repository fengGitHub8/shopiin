package com.zs.service;

import com.zs.entity.Admin;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 10:50
 **/
public interface AdminService {
    /**
     * 根据用户名和密码查询admin,并设置token
     * @param admin
     * @return
     */
    Admin findByUserAndPwd(Admin admin);

    /**
     * 根据token查询管理员信息
     * @param token
     * @return
     */
    Admin findAdminBytoken(String token);

    /**
     * 从index开始查询，最多查询max条管理员信息
     * @param index
     * @param max
     * @return
     */
    List<Admin> findAdminByIndex(String index, String max);

    /**
     * 添加管理员
     * @param admin
     */
    void addAdmin(Admin admin);
}

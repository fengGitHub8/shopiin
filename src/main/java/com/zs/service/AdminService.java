package com.zs.service;

import com.zs.entity.Admin;
import com.zs.entity.AdminType;

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

    /**
     * 根据id修改管理员信息
     * @param admin
     */
    void updateAdmin(Admin admin);

    /**
     * 删除管理员
     * @param id
     */
    void deleteAdmin(String id);

    /**
     * 查询所有管理员类型
     * @return
     */
    List<AdminType> findAllType();

    /**
     * 根据id查询管理员信息
     * @param id
     * @return
     */
    Admin findAdminById(String id);
}

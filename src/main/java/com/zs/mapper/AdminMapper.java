package com.zs.mapper;

import com.zs.entity.Admin;
import com.zs.entity.AdminType;
import com.zs.entity.Shop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 管理员信息接口
 * @author: FengYang
 * @create: 2019-06-22 10:30
 **/
@Repository
public interface AdminMapper {

    /**
     * 根据用户名和密码查询管理员账户
     * @param admin
     * @return
     */
    Admin findByUserAndPwd(Admin admin);

    /**
     * 更新用户token
     * @param token
     */
    void updateAdminTokenById(@Param("id") int id , @Param("token") String token);

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
    List<Admin> findAdminByIndex(@Param("index") int index, @Param("max") int max);

    /**
     * 添加管理员
     * @param admin
     */
    void addAdmin(Admin admin);

    /**
     * 修改管理员信息
     * @param admin
     */
    void updateAdmin(Admin admin);

    /**
     * 删除管理员信息
     * @param id
     */
    void deleteAdmin(int id);

    /**
     * 查询所有管理员类型
     * @return
     */
    List<AdminType> findAllType();

    /**
     * 根据id查询管理员信息
     * @param i
     * @return
     */
    Admin findAdminById(int id);
}

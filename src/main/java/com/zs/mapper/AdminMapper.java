package com.zs.mapper;

import com.zs.entity.Admin;
import org.springframework.stereotype.Repository;

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
    void updateAdminToken(String token);

    /**
     * 根据token查询管理员信息
     * @param token
     * @return
     */
    Admin findAdminBytoken(String token);
}

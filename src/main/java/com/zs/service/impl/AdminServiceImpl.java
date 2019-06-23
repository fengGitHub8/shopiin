package com.zs.service.impl;

import com.zs.entity.Admin;
import com.zs.mapper.AdminMapper;
import com.zs.service.AdminService;
import com.zs.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 10:50
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findByUserAndPwd(Admin admin) {
        Admin byUserAndPwd = adminMapper.findByUserAndPwd(admin);
        if (byUserAndPwd != null) {
            String token = TokenUtil.getToken();
            adminMapper.updateAdminToken(token);
        }
        return adminMapper.findByUserAndPwd(admin);
    }

    @Override
    public Admin findAdminBytoken(String token) {
        return adminMapper.findAdminBytoken(token);
    }

    @Override
    public List<Admin> findAdminByIndex(String index, String max) {
        return adminMapper.findAdminByIndex(Integer.parseInt(index),Integer.parseInt(max));
    }

    @Override
    public void addAdmin(Admin admin) {
        adminMapper.addAdmin(admin);
    }
}

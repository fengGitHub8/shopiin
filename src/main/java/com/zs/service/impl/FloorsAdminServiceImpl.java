package com.zs.service.impl;

import com.zs.entity.FloorsAdmin;
import com.zs.mapper.FloorsAdminMapper;
import com.zs.service.FloorsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @program: shopin
 * @description: 评论管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Service
public class FloorsAdminServiceImpl implements FloorsAdminService {
    @Autowired
    private FloorsAdminMapper floorsAdminMapper;

    @Override
    public List<FloorsAdmin> getPageFloors(int shopId) {
        return floorsAdminMapper.getPageFloors(shopId);
    }

    @Override
    public Boolean addPageFloor(FloorsAdmin floorsAdmin) {
        floorsAdminMapper.addPageFloor(floorsAdmin);
        return true;
    }

    @Override
    public Boolean modifyPageFloor(FloorsAdmin floorsAdmin) {
        floorsAdminMapper.modifyPageFloor(floorsAdmin);
        return true;
    }
}

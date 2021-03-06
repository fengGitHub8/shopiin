package com.zs.service.impl;

import com.zs.entity.RadioAdmin;
import com.zs.mapper.RadioAdminMapper;
import com.zs.service.RadioAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 无线电管理
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Service
public class RadioAdminServiceImpl implements RadioAdminService {
    @Autowired
    private RadioAdminMapper radioAdminMapper;

    @Override
    public List<RadioAdmin> findRadioBroadcasts(int shopId) {
        return radioAdminMapper.findRadioBroadcasts(shopId);
    }

    @Override
    public Boolean addRadioBroadcast(RadioAdmin radioAdmin) {
        radioAdminMapper.addRadioBroadcast(radioAdmin);
        return true;
    }

    @Override
    public Boolean modifyRadioBroadcast(RadioAdmin radioAdmin) {
        radioAdminMapper.modifyRadioBroadcast(radioAdmin);
        return true;
    }

    @Override
    public Boolean deleteRadioBroadcast(RadioAdmin radioAdmin) {
        radioAdminMapper.deleteRadioBroadcast(radioAdmin);
        return true;
    }
}


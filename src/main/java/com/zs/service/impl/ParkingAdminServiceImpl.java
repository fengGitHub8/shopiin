package com.zs.service.impl;

import com.zs.entity.ParkingAdmin;
import com.zs.mapper.ParkingAdminMapper;
import com.zs.service.ParkingAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ParkingAdminServiceImpl
 * @Description
 * @Date 2019/6/25 22:15
 * @Created by GuiPeng
 */

@Service
public class ParkingAdminServiceImpl implements ParkingAdminService {

    @Autowired
    private ParkingAdminMapper parkingAdminMapper;


    @Override
    public List<ParkingAdmin> findParkingAdminsByShopId(ParkingAdmin parkingAdmin) {
        return parkingAdminMapper.findParkingAdminsByShopId(parkingAdmin);
    }

    @Override
    public int addParkingAdmin(ParkingAdmin parkingAdmin) {
        return parkingAdminMapper.addParkingAdmin(parkingAdmin);
    }

    @Override
    public int updateParkingAdminById(ParkingAdmin parkingAdmin) {
        return parkingAdminMapper.updateParkingAdminById(parkingAdmin);
    }

    @Override
    public int deleteParkingAdminById(Integer id) {
        return parkingAdminMapper.deleteParkingAdminById(id);
    }
}

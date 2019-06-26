package com.zs.service.impl;

import com.zs.entity.ParkingDepot;
import com.zs.mapper.ParkingAdminMapper;
import com.zs.mapper.ParkingDepotMapper;
import com.zs.service.ParkingDepotService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ParkingDepotServiceImpl
 * @Description
 * @Date 2019/6/25 17:00
 * @Created by GuiPeng
 */

@Service
public class ParkingDepotServiceImpl implements ParkingDepotService {

    @Autowired
    private ParkingDepotMapper parkingDepotMapper;

    @Autowired
    private ParkingAdminMapper parkingAdminMapper;

    @Override
    public List<ParkingDepot> findParkingDepotsByShopId(ParkingDepot parkingDepot) {
        return parkingDepotMapper.findParkingDepotsByShopId(parkingDepot);
    }

    @Override
    public int addParkingDepot(ParkingDepot parkingDepot) {
        return parkingDepotMapper.addParkingDepot(parkingDepot);
    }

    @Override
    public int updateParkingDepotById(ParkingDepot parkingDepot) {
        if (parkingDepot.getStatus()==0){
            parkingAdminMapper.deleteParkingAdminByParkingDepotId(parkingDepot.getId());
        }
        return parkingDepotMapper.updateParkingDepotById(parkingDepot);

    }

    @Override
    public int deleteParkingDepotById(Integer id) {
        int i = 1;
        i = parkingDepotMapper.deleteParkingDepotById(id);
        parkingAdminMapper.deleteParkingAdminByParkingDepotId(id);
        return i;
    }
}

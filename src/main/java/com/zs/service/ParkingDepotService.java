package com.zs.service;

import com.zs.entity.ParkingDepot;

import java.util.List;

/**
 * @Classname ParkingDepotService
 * @Description
 * @Date 2019/6/25 17:00
 * @Created by GuiPeng
 */
public interface ParkingDepotService {

    /**
     * 通过shopId查询停车场
     * @param parkingDepot
     * @return
     */
    List<ParkingDepot> findParkingDepotsByShopId(ParkingDepot parkingDepot);

    /**
     * 添加停车场
     * @param parkingDepot
     * @return
     */
    int addParkingDepot(ParkingDepot parkingDepot);

    /**
     * 修改停车场
     * @param parkingDepot
     * @return
     */
    int updateParkingDepotById(ParkingDepot parkingDepot);

    /**
     * 删除停车场
     * @param id
     * @return
     */
    int deleteParkingDepotById(Integer id);

    /**
     * 修改停车场时通过id再查一次
     * @param id
     * @return
     */
    ParkingDepot findById(Integer id);
}

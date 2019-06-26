package com.zs.service;

import com.zs.entity.ParkingAdmin;

import java.util.List;

/**
 * @Classname ParkingAdminService
 * @Description
 * @Date 2019/6/25 22:14
 * @Created by GuiPeng
 */

public interface ParkingAdminService {

    /**
     * 通过shopId查询停车位
     * @param parkingAdmin
     * @return
     */
    List<ParkingAdmin> findParkingAdminsByShopId(ParkingAdmin parkingAdmin);

    /**
     * 添加停车位
     * @param parkingAdmin
     * @return
     */
    int addParkingAdmin(ParkingAdmin parkingAdmin);

    /**
     * 通过id修改停车位
     * @param parkingAdmin
     * @return
     */
    int updateParkingAdminById(ParkingAdmin parkingAdmin);

    /**
     * 通过id删除停车位
    * @param id
     * @return
     */
    int deleteParkingAdminById(Integer id);

    /**
     * 修改时通过id查询一次
     * @param id
     * @return
     */
    ParkingAdmin findById(Integer id);
}

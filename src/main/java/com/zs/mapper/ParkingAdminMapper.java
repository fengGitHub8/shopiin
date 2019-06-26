package com.zs.mapper;

import com.zs.entity.ParkingAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname ParkingAdminMapper
 * @Description
 * @Date 2019/6/25 22:13
 * @Created by GuiPeng
 */

@Repository
public interface ParkingAdminMapper {

    /**
     * 通过shopId来查询停车位
     * @param parkingAdmin
     * @return
     */
    List<ParkingAdmin> findParkingAdminsByShopId(ParkingAdmin parkingAdmin);

    /**
     * 添加停车位，并返回1或者0判断是否添加成功
     * @param parkingAdmin
     * @return
     */
    int addParkingAdmin(ParkingAdmin parkingAdmin);

    /**
     * 修改停车位，并返回1或者0判断是否修改成功
     * @param parkingAdmin
     * @return
     */
    int updateParkingAdminById(ParkingAdmin parkingAdmin);

    /**
     * 删除停车位，并返回1或者0判断是否删除成功
     * @param id
     * @return
     */
    int deleteParkingAdminById(Integer id);

    /**
     *通过parkingDepotId删除相关的停车位
     * @param parkingDepotId
     */
    void deleteParkingAdminByParkingDepotId(Integer parkingDepotId);
}

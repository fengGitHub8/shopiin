package com.zs.mapper;

import com.zs.entity.ParkingDepot;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname ParkingDepotMapper
 * @Description 停车场管理接口
 * @Date 2019/6/25 16:55
 * @Created by GuiPeng
 */

@Repository
public interface ParkingDepotMapper {

    /**
     * 通过shopId查询停车场
     * @param parkingDepot
     * @return
     */
    List<ParkingDepot> findParkingDepotsByShopId(ParkingDepot parkingDepot);

    /**
     * 添加停车场，并返回1或者0判断是否添加成功
     * @param parkingDepot
     * @return
     */
    int addParkingDepot(ParkingDepot parkingDepot);

    /**
     * 修改停车场，并返回1或者0判断是否修改成功
     * @param parkingDepot
     * @return
     */
    int updateParkingDepotById(ParkingDepot parkingDepot);

    /**
     * 删除停车场，并返回1或者0判断是否删除成功
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

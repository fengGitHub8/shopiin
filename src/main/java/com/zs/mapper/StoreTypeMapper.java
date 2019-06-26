package com.zs.mapper;

import com.zs.entity.StoreType;
import org.junit.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname StoreTypeMapper
 * @Description 商铺类型和公共服务类型接口
 * @Date 2019/6/23 18:10
 * @Created by GuiPeng
 */
@Repository
public interface StoreTypeMapper {

    /**
     * 根据门店id和类型查询storetype
     * @param storeType
     * @return
     */
    List<StoreType> findStoreTypeByShopIdAndType(StoreType storeType);

    /**
     * 添加商铺类型或者公共服务类型，并返回1或者0判断是否添加成功
     * @param storeType
     */
    int addStoreType(StoreType storeType);

    /**
     * 修改和添加时通过名字来查询是否该类型已经存在
     * @param storeType
     * @return
     */
    int findStoreTypeByShopIdAndTypeAndName(StoreType storeType);

    /**
     * 通过id修改商铺类型或者公共服务类型，并返回1或者0判断是否修改成功
     * @param storeType
     */
    int updateStoreTypeById(StoreType storeType);

    /**
     * 通过id删除商铺类型或者公共服务类型，并返回1或者0判断是否删除成功
     * @param id
     * @return
     */
    int deleteStoreTypeById(Integer id);

    /**
     * 通过id查询类型。
     * @param id
     * @return
     */
    StoreType findById(Integer id);

}

package com.zs.service;

import com.zs.entity.StoreType;

import java.util.List;

/**
 * @Classname StoreTypeService
 * @Description 商铺类型和公共服务类型
 * @Date 2019/6/23 18:09
 * @Created by GuiPeng
 */
public interface StoreTypeService {

    /**
     *根据门店id和类型查询storetype。
     * @param storeType
     * @return storetype
     */
    List<StoreType> findStoreTypeByShopIdAndType(StoreType storeType);

    /**
     * 添加商铺类型或者公共服务类型，并返回1或者0判断是否添加成功
     * @param storeType
     */
    int addStoreType(StoreType storeType);

    /**
     * 通过id修改商铺类型或者公共服务类型，同时修改store_admin表里相关的商铺或者公共服务场所。
     * 并返回1或者0判断是否修改成功
     * @param storeType
     */
    int updateStoreTypeById(StoreType storeType);

    /**
     * 通过id删除商铺类型或者公共服务类型，同时删除掉store_admin表里相关的商铺或者公共服务场所。
     * 并返回1或者0判断是否删除成功
     * @param id
     * @return
     */
    int deleteStoreTypeById(Integer id);
}

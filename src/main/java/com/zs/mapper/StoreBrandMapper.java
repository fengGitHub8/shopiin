package com.zs.mapper;

import com.zs.entity.StoreBrand;

/**
 * @Classname storeBrandMapper
 * @Description 给商铺加品牌的接口
 * @Date 2019/6/25 15:07
 * @Created by GuiPeng
 */
public interface StoreBrandMapper {

    /**
     * 通过两个id给商铺添加品牌
     * @param storeBrand
     * @return
     */
    int addStoreBrand(StoreBrand storeBrand);

    /**
     * 通过storeAdminId也就是storeId删除品牌
     * @param storeId
     * @return
     */
    int deleteStoreBrand(Integer storeId);
}

package com.zs.service;

import com.zs.entity.Shop;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 15:14
 **/
public interface ShopService {
    /**
     * 查询所有门店信息
     * @return
     */
    List<Shop> findAllShop();

    /**
     * 新增门店，返回门店id
     * @return
     */
    Integer addShop(Shop shop);

    /**
     * 更新门店信息
     * @param shop
     * @return
     */
    Boolean updateShop(Shop shop);

    /**
     * 删除门店
     * @param id
     */
    void deleteShop(Integer id);
}

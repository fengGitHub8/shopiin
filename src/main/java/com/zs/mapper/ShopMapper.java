package com.zs.mapper;

import com.zs.entity.Shop;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 15:12
 **/
@Repository
public interface ShopMapper {
    /**
     * 查询所有门店信息
     * @return
     */
    List<Shop> findAll();

    /**
     * 传入shop新增shop
     * @param shop
     * @return
     */
    void addShop(Shop shop);

    /**
     * 更新shop表记录
     * @param shop
     */
    void updateShop(Shop shop);

    /**
     * 删除门店
     * @param id
     */
    void deleteShop(String id);
}

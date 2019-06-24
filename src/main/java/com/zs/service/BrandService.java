package com.zs.service;

import com.zs.entity.Brand;

import java.util.List;

/**
 * @program: shopin
 * @description: 品牌Service接口
 * @author: FengYang
 * @create: 2019-06-24 15:27
 **/
public interface BrandService {
    /**
     * 根据门店ID查询品牌信息
     * @param shopId
     * @return
     */
    List<Brand> findByShopId(String shopId);

    /**
     * 添加品牌信息
     * @param brand
     */
    void addBrand(Brand brand);

    /**
     * 修改品牌信息
     * @param brand
     */
    void updateBrand(Brand brand);

    /**
     * 删除品牌信息
     * @param id
     * @return
     */
    Boolean deleteBrand(String id);
}

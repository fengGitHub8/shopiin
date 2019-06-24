package com.zs.mapper;

import com.zs.entity.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 品牌mapper接口
 * @author: FengYang
 * @create: 2019-06-24 15:29
 **/
@Repository
public interface BrandMapper {
    /**
     * 根据门店ID查询品牌信息
     * @param shopId
     * @return
     */
    List<Brand> findByShopId(int shopId);

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
     * 删除品牌信息，修改status = 0
     * @param i
     * @return
     */
    Boolean deleteBrand(int i);
}

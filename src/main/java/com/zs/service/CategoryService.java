package com.zs.service;

import com.zs.entity.Category;

import java.util.List;

/**
 * @program: shopin
 * @description: 品类管理Service接口
 * @author: FengYang
 * @create: 2019-06-24 14:29
 **/
public interface CategoryService {
    /**
     * 根据门店id查询品类信息
     * @param shopId
     * @return
     */
    List<Category> findByShopId(String shopId);

    /**
     * 添加品类信息
     * @param category
     * @return
     */
    Boolean addCategory(Category category);

    /**
     * 修改品类信息
     * @param category
     */
    Boolean updateCategory(Category category);

    /**
     * 删除品类信息
     * @param id
     * @return
     */
    Boolean deleteCategory(String id);
}

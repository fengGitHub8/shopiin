package com.zs.mapper;

import com.zs.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 品类mapper接口
 * @author: FengYang
 * @create: 2019-06-24 14:43
 **/
@Repository
public interface CategoryMapper {
    /**
     * 根据门店id查询品类信息
     * @param shopId
     * @return
     */
    List<Category> findByShopId(int shopId);

    /**
     * 添加品类信息
     * @param category
     */
    void addCategory(Category category);

    /**
     * 修改品类信息
     * @param category
     */
    void updateCategory(Category category);

    /**
     * 删除品类信息，修改status = 0
     * @param i
     * @return
     */
    Boolean deleteCategory(int i);
}

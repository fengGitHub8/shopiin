package com.zs.service.impl;

import com.zs.entity.Category;
import com.zs.mapper.CategoryMapper;
import com.zs.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 品类管理Service实现类
 * @author: FengYang
 * @create: 2019-06-24 14:29
 **/
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findByShopId(Integer shopId) {
        return categoryMapper.findByShopId(shopId);
    }

    @Override
    public Boolean addCategory(Category category) {
        categoryMapper.addCategory(category);
        return true;
    }

    @Override
    public Boolean updateCategory(Category category) {
        categoryMapper.updateCategory(category);
        return true;
    }

    @Override
    public Boolean deleteCategory(String id) {
        return categoryMapper.deleteCategory(Integer.parseInt(id));
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.findById(id);
    }
}

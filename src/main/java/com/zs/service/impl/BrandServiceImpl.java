package com.zs.service.impl;

import com.zs.entity.Brand;
import com.zs.mapper.BrandMapper;
import com.zs.mapper.StoreBrandMapper;
import com.zs.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 品牌接口实现
 * @author: FengYang
 * @create: 2019-06-24 15:28
 **/
@Service
public class BrandServiceImpl implements BrandService{
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private StoreBrandMapper storeBrandMapper;

    @Override
    public List<Brand> findByShopId(String shopId) {
        return brandMapper.findByShopId(Integer.parseInt(shopId));
    }

    @Override
    public void addBrand(Brand brand) {
        brandMapper.addBrand(brand);
    }

    @Override
    public void updateBrand(Brand brand) {

        brandMapper.updateBrand(brand);
    }

    @Override
    public Boolean deleteBrand(String id) {
        return brandMapper.deleteBrand(Integer.parseInt(id));
    }
}

package com.zs.service.impl;

import com.zs.entity.Shop;
import com.zs.mapper.ShopMapper;
import com.zs.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description:
 * @author: FengYang
 * @create: 2019-06-22 15:14
 **/
@Service
public class ShopServiceImpl implements ShopService{
    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> findAllShop() {
        return shopMapper.findAll();
    }

    @Override
    public Integer addShop(Shop shop) {
        if (shop.getId()==null){
            shopMapper.addShop(shop);
            return shop.getId();
        }else {
            return 0;
        }

    }

    @Override
    public Boolean updateShop(Shop shop) {
        if (shop.getId() == null) {
            return false;
        }else {
            shopMapper.updateShop(shop);
            return true;
        }
    }

    @Override
    public void deleteShop(Integer id) {

        shopMapper.deleteShop(id);
    }


}

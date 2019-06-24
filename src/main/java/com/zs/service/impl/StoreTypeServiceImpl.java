package com.zs.service.impl;

import com.zs.entity.StoreType;
import com.zs.mapper.StoreTypeMapper;
import com.zs.service.StoreTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname StoreTypeServiceImpl
 * @Description
 * @Date 2019/6/23 18:09
 * @Created by GuiPeng
 */
@Service
public class StoreTypeServiceImpl implements StoreTypeService {

    @Autowired
    private StoreTypeMapper storeTypeMapper;


    @Override
    public List<StoreType> findStoreTypeByShopIdAndType(StoreType storeType) {
        return storeTypeMapper.findStoreTypeByShopIdAndType(storeType);
    }

    @Override
    public int addStoreType(StoreType storeType) {
        int count = storeTypeMapper.findStoreTypeByShopIdAndTypeAndName(storeType);
        if (count == 0) {
            return storeTypeMapper.addStoreType(storeType);
        } else {
            return 0;
        }
    }

    @Override
    public int updateStoreTypeById(StoreType storeType) {
        int count = storeTypeMapper.findStoreTypeByShopIdAndTypeAndName(storeType);
        if (count == 0) {
            return storeTypeMapper.updateStoreTypeById(storeType);
        } else {
            return 0;
        }
    }

    @Override
    public int deleteStoreTypeById(StoreType storeType) {
        return storeTypeMapper.deleteStoreTypeById(storeType);
    }
}

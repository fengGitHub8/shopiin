package com.zs.service.impl;

import com.zs.entity.StoreType;
import com.zs.mapper.StoreAdminMapper;
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

    @Autowired
    private StoreAdminMapper storeAdminMapper;

    @Override
    public List<StoreType> findStoreTypeByShopIdAndType(StoreType storeType) {
        return storeTypeMapper.findStoreTypeByShopIdAndType(storeType);
    }

    @Override
    public int addStoreType(StoreType storeType) {
        StoreType byId = storeTypeMapper.findById(storeType.getId());
        if (byId.getName() == storeType.getName()) {
            return storeTypeMapper.addStoreType(storeType);
        } else {
            int count = storeTypeMapper.findStoreTypeByShopIdAndTypeAndName(storeType);
            if (count == 0) {
                return storeTypeMapper.addStoreType(storeType);
            } else {
                return 0;
            }
        }
    }

    @Override
    public int updateStoreTypeById(StoreType storeType) {
        int count = storeTypeMapper.findStoreTypeByShopIdAndTypeAndName(storeType);
        if (count == 0) {
            if (storeType.getStatus() == 0) {
                storeAdminMapper.deleteStoreAdminByStoreTypeId(storeType.getId());
            }
            return storeTypeMapper.updateStoreTypeById(storeType);
        } else {
            return 0;
        }
    }

    @Override
    public int deleteStoreTypeById(Integer id) {
        int i = 1;
        i = storeTypeMapper.deleteStoreTypeById(id);
        storeAdminMapper.deleteStoreAdminByStoreTypeId(id);
        return i;
    }

    @Override
    public StoreType findById(Integer id) {
        return storeTypeMapper.findById(id);
    }
}

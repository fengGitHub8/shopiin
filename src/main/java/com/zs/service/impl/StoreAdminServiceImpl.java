package com.zs.service.impl;

import com.zs.entity.Brand;
import com.zs.entity.StoreAdmin;
import com.zs.entity.StoreBrand;
import com.zs.mapper.StoreAdminMapper;
import com.zs.mapper.StoreBrandMapper;
import com.zs.service.StoreAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname StoreAdminServiceImpl
 * @Description
 * @Date 2019/6/25 10:32
 * @Created by GuiPeng
 */

@Service
public class StoreAdminServiceImpl implements StoreAdminService {

    @Autowired
    private StoreAdminMapper storeAdminMapper;

    @Autowired
    private StoreBrandMapper storeBrandMapper;

    @Override
    public List findStoreAdminByShopIdAndType(StoreAdmin storeAdmin) {
        List<StoreAdmin> storeAdmins = storeAdminMapper.findStoreAdminByShopIdAndType(storeAdmin);
        for (StoreAdmin admin : storeAdmins) {
            setIdsInStoreAdmin(admin);
        }
        return storeAdmins;
    }

    @Override
    public int addStoreAdmin(StoreAdmin storeAdmin) {
        List brandIds = storeAdmin.getBrandIds();
        storeAdminMapper.addStoreAdmin(storeAdmin);
        StoreBrand storeBrand = new StoreBrand();
        storeBrand.setStoreId(storeAdmin.getId());
        for (Object brandId : brandIds) {
            storeBrand.setBrandId((Integer) brandId);
            storeBrandMapper.addStoreBrand(storeBrand);
        }
        return 1;
    }

    @Override
    public int updateStoreAdminById(StoreAdmin storeAdmin) {
        int i = 1;
        List brandIds = storeAdmin.getBrandIds();
        StoreBrand storeBrand = new StoreBrand();
        storeBrand.setStoreId(storeAdmin.getId());
        storeBrandMapper.deleteStoreBrand(storeAdmin.getId());
        i = storeAdminMapper.updateStoreAdminById(storeAdmin);
        for (Object brandId : brandIds) {
            storeBrand.setBrandId((Integer) brandId);
            i = storeBrandMapper.addStoreBrand(storeBrand);
            if (i ==0){
                break;
            }
        }
        return i;
    }

    @Override
    public int deleteStoreAdminById(Integer id) {
        int i = 1;
        storeBrandMapper.deleteStoreBrand(id);
        if (i!=0){
            i = storeAdminMapper.deleteStoreAdminById(id);
        }
        return i;
    }

    @Override
    public StoreAdmin findById(Integer id) {
        StoreAdmin storeAdmin = storeAdminMapper.findById(id);
        return setIdsInStoreAdmin(storeAdmin);
    }

    public StoreAdmin setIdsInStoreAdmin(StoreAdmin storeAdmin){
        List<Brand> brands = storeAdmin.getBrandList();
        List list = new ArrayList();
        for (Brand brand : brands) {
            list.add(brand.getId());
        }
        storeAdmin.setBrandIds(list);
        return storeAdmin;
    }
}

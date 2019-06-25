package com.zs.mapper;

import com.zs.entity.StoreAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname StoreAdminMapper
 * @Description 商铺或公共服务场所接口
 * @Date 2019/6/25 10:32
 * @Created by GuiPeng
 */

@Repository
public interface StoreAdminMapper {

    /**
     * 通过shopId和type查询相应的商铺或者公共服务场所
     * @param storeAdmin
     * @return
     */
    List<StoreAdmin> findStoreAdminByShopIdAndType(StoreAdmin storeAdmin);

    /**
     * 添加商铺或公共服务场所，并返回1或0判断是否添加成功
     * @param storeAdmin
     * @return
     */
    int addStoreAdmin(StoreAdmin storeAdmin);

    /**
     * 修改商铺或公共服务场所，并返回1或0判断是否修改成功
     * @param storeAdmin
     * @return
     */
    int updateStoreAdminById(StoreAdmin storeAdmin);

    int deleteStoreAdminById(Integer id);
}

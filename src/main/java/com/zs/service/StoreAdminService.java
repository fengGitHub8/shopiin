package com.zs.service;

import com.zs.entity.StoreAdmin;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Classname StoreAdminService
 * @Description
 * @Date 2019/6/25 10:32
 * @Created by GuiPeng
 */
public interface StoreAdminService {

    /**
     * 通过shopId和storetype里面的type查询store
     * @param storeAdmin
     * @return
     */
    List<StoreAdmin> findStoreAdminByShopIdAndType(StoreAdmin storeAdmin);

    /**
     * 添加store
     * @param storeAdmin
     * @return
     */
    int addStoreAdmin(StoreAdmin storeAdmin);

    /**
     * 通过id修改store
     * @param storeAdmin
     * @return
     */
    int updateStoreAdminById(StoreAdmin storeAdmin);

    /**
     * 通过id删除store，同时删除掉storebrand表里它相关的属性
     * @param id
     * @return
     */
    int deleteStoreAdminById(Integer id);

    /**
     * 修改时通过id查询store的信息
     * @param id
     * @return
     */
    StoreAdmin findById(Integer id);

    /**
     * 读取excel文件
     * @param mFile
     * @param shopId
     */
    void readExcelFile(MultipartFile mFile, Integer shopId);
}

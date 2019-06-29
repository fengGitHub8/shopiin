package com.zs.service;

import com.zs.entity.Brand;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: shopin
 * @description: 品牌Service接口
 * @author: FengYang
 * @create: 2019-06-24 15:27
 **/
public interface BrandService {
    /**
     * 根据门店ID查询品牌信息
     * @param shopId
     * @return
     */
    List<Brand> findByShopId(Integer shopId);

    /**
     * 添加品牌信息
     * @param brand
     */
    void addBrand(Brand brand);

    /**
     * 修改品牌信息
     * @param brand
     */
    void updateBrand(Brand brand);

    /**
     * 删除品牌信息
     * @param id
     * @return
     */
    Boolean deleteBrand(String id);

    /**
     * 根据ID查询品牌信息
     * @param id
     * @return
     */
    Brand findById(Integer id);

    /**
     * 读取excel文件
     * @param file
     * @return
     */
    String readExcelFile(MultipartFile file,String shopId);
}

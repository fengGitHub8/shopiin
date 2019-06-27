package com.zs.service;

import com.zs.entity.BusinessSite;

import java.util.List;

/**
 * @program: shopin
 * @description: 营业场所service接口
 * @author: FengYang
 * @create: 2019-06-24 10:40
 **/
public interface BusinessSiteService {
    /**
     * 根据门店id查询营业场所
     * @param shopId
     * @return
     */
    List<BusinessSite> findByShopId(Integer shopId);

    /**
     * 添加营业场所
     * @param businessSite
     */
    void addBusinessSite(BusinessSite businessSite);

    /**
     * 修改营业场所信息
     * @param businessSite
     */
    Boolean updateBusinessSite(BusinessSite businessSite);

    /**
     * 删除营业场所信息
     * @param id
     * @return
     */
    Boolean deleteBusinessSite(String id);
}

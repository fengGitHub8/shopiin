package com.zs.mapper;

import com.zs.entity.BusinessSite;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 营业场所mapper接口
 * @author: FengYang
 * @create: 2019-06-24 10:34
 **/
@Repository
public interface BusinessSiteMapper {
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
    void updateBusinessSite(BusinessSite businessSite);

    /**
     * 删除营业场所信息，修改status = 2
     * @param id
     * @return
     */
    void deleteById(int id);

    /**
     * 查询所有营业场所以及所拥有的楼层
     * @param shopId
     * @return
     */
    List<BusinessSite> findBusinessSiteAndFloor(Integer shopId);

    /**
     * 根据id查询营业场所
     * @param id
     * @return
     */
    BusinessSite findById(Integer id);
}

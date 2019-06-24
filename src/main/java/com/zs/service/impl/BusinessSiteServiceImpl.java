package com.zs.service.impl;

import com.zs.entity.BusinessSite;
import com.zs.mapper.BusinessSiteMapper;
import com.zs.service.BusinessSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 营业场所实现类
 * @author: FengYang
 * @create: 2019-06-24 10:41
 **/
@Service
public class BusinessSiteServiceImpl implements BusinessSiteService{
    @Autowired
    private BusinessSiteMapper businessSiteMapper;

    @Override
    public List<BusinessSite> findByShopId(String shopId) {
        return businessSiteMapper.findByShopId(Integer.parseInt(shopId));
    }

    @Override
    public void addBusinessSite(BusinessSite businessSite) {
        businessSiteMapper.addBusinessSite(businessSite);
    }

    @Override
    public Boolean updateBusinessSite(BusinessSite businessSite) {
        businessSiteMapper.updateBusinessSite(businessSite);
        return true;
    }

    @Override
    public Boolean deleteBusinessSite(String id) {
        businessSiteMapper.deleteById(Integer.parseInt(id));
        return true;
    }

}

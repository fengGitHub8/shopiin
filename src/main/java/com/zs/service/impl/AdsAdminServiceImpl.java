package com.zs.service.impl;

import com.zs.entity.AdsAdmin;
import com.zs.mapper.AdsAdminMapper;
import com.zs.service.AdsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdsAdminServiceImpl implements AdsAdminService {

    @Autowired
    private AdsAdminMapper adsAdminMapper;

    @Override
    public List<AdsAdmin> findAds(AdsAdmin adsAdmin) {
        return adsAdminMapper.findAds(adsAdmin);
    }

    @Override
    public Boolean addAds(AdsAdmin adsAdmin) {
        adsAdminMapper.addAds(adsAdmin);
        return true;
    }

    @Override
    public Boolean modifyAds(AdsAdmin adsAdmin) {
        adsAdminMapper.modifyAds(adsAdmin);
        return true;
    }

    @Override
    public Boolean deleteAds(AdsAdmin adsAdmin) {
        adsAdminMapper.deleteAds(adsAdmin);
        return true;
    }
}

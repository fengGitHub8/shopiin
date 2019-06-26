package com.zs.service;

import com.zs.entity.AdsAdmin;

import java.util.List;

public interface AdsAdminService {
    List<AdsAdmin> findAds(AdsAdmin adsAdmin);

    Boolean addAds(AdsAdmin adsAdmin);

    Boolean modifyAds(AdsAdmin adsAdmin);

    Boolean deleteAds(AdsAdmin adsAdmin);
}

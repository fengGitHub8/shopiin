package com.zs.service;

import com.zs.entity.AdsAdmin;

import java.util.List;

/**
 * @program: shopin
 * @description: 广告管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
public interface AdsAdminService {
    List<AdsAdmin> findAds(AdsAdmin adsAdmin);

    Boolean addAds(AdsAdmin adsAdmin);

    Boolean modifyAds(AdsAdmin adsAdmin);

    Boolean deleteAds(AdsAdmin adsAdmin);
}

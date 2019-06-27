package com.zs.mapper;

import com.zs.entity.AdsAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 广告管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Repository
public interface AdsAdminMapper {
    List<AdsAdmin> findAds(AdsAdmin adsAdmin);

    Boolean addAds(AdsAdmin adsAdmin);

    Boolean modifyAds(AdsAdmin adsAdmin);

    Boolean deleteAds(AdsAdmin adsAdmin);
}

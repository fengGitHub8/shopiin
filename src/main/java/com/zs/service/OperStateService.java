package com.zs.service;

import com.zs.entity.OperState;

/**
 * @program: shopin
 * @description: 运营状态
 * @author: FengYang
 * @create: 2019-06-23 23:00
 **/
public interface OperStateService {
    /**
     * 查看门店当天运营状态
     * @param shopId
     * @param date
     * @return
     */
    OperState findByShopIdAndDate(String shopId, String date);
}

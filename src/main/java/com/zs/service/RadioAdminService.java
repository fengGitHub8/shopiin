package com.zs.service;

import com.zs.entity.RadioAdmin;

import java.util.List;

/**
 * @program: shopin
 * @description: 无线电管理
 * @author: ZWX
 * @create: 2019-06-26
 **/
public interface RadioAdminService {
    List<RadioAdmin> findRadioBroadcasts(int shopId);

    Boolean addRadioBroadcast(RadioAdmin radioAdmin);

    Boolean modifyRadioBroadcast(RadioAdmin radioAdmin);

    Boolean deleteRadioBroadcast(RadioAdmin radioAdmin);
}

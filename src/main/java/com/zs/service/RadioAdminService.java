package com.zs.service;

import com.zs.entity.RadioAdmin;

import java.util.List;

public interface RadioAdminService {
    List<RadioAdmin> findRadioBroadcasts(RadioAdmin radioAdmin);

    Boolean addRadioBroadcast(RadioAdmin radioAdmin);

    Boolean modifyRadioBroadcast(RadioAdmin radioAdmin);

    Boolean deleteRadioBroadcast(RadioAdmin radioAdmin);
}

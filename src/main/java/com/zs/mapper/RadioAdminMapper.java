package com.zs.mapper;

import com.zs.entity.RadioAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 无线电管理
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Repository
public interface RadioAdminMapper {
    List<RadioAdmin> findRadioBroadcasts(int shopId);

    Boolean addRadioBroadcast(RadioAdmin radioAdmin);

    Boolean modifyRadioBroadcast(RadioAdmin radioAdmin);

    Boolean deleteRadioBroadcast(RadioAdmin radioAdmin);
}

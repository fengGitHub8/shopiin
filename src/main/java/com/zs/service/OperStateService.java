package com.zs.service;

import com.zs.entity.OperState;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 根据开始时间和结束时间查询运营记录
     * @param begin
     * @param end
     * @return
     */
    List<OperState> findByBeginAndEndTime(String shopId,String begin, String end);

}

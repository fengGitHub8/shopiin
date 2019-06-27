package com.zs.mapper;

import com.zs.entity.OperState;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 运营状态mapper接口
 * @author: FengYang
 * @create: 2019-06-23 22:44
 **/
@Repository
public interface OperStateMapper {
    /**
     * 查看门店当天运营状态
     * @param shopId
     * @param date
     * @return
     */
    OperState findByShopIdAndDate(@Param("shopId") int shopId, @Param("date") String date);

    /**
     * 根据开始时间和结束时间查询门店运营记录
     * @param begin
     * @param end
     * @return
     */
    List<OperState> findByBeginAndEndTime(@Param("shopId") String shopId,@Param("begin") String begin, @Param("end") String end);
}

package com.zs.mapper;

import com.zs.entity.OperState;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
}

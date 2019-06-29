package com.zs.mapper;

import com.zs.entity.FloorsAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 楼层管理
 * @author: ZWX
 * @create: 2019-06-26
 **/
@Repository
public interface FloorsAdminMapper {
    List<FloorsAdmin> getPageFloors(int shopId);

    Boolean addPageFloor(FloorsAdmin floorsAdmin);

    Boolean modifyPageFloor(FloorsAdmin floorsAdmin);
}

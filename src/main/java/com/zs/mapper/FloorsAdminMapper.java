package com.zs.mapper;

import com.zs.entity.FloorsAdmin;

import java.util.List;

public interface FloorsAdminMapper {
    List<FloorsAdmin> getPageFloors(int shopId);

    Boolean addPageFloor(FloorsAdmin floorsAdmin);

    Boolean modifyPageFloor(FloorsAdmin floorsAdmin);
}

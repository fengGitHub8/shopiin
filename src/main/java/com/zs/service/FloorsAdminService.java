package com.zs.service;

import com.zs.entity.FloorsAdmin;

import java.util.List;

public interface FloorsAdminService {
    List<FloorsAdmin> getPageFloors(int shopId);

    Boolean addPageFloor(FloorsAdmin floorsAdmin);

    Boolean modifyPageFloor(FloorsAdmin floorsAdmin);
}

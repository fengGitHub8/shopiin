package com.zs.mapper;

import com.zs.entity.FloorsAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FloorsAdminMapper {
    List<FloorsAdmin> getPageFloors(int shopId);

    Boolean addPageFloor(FloorsAdmin floorsAdmin);

    Boolean modifyPageFloor(FloorsAdmin floorsAdmin);
}

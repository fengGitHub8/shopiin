package com.zs.service;

import com.zs.entity.FloorsAdmin;

import java.util.List;

/**
 * @program: shopin
 * @description: 评论管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
public interface FloorsAdminService {
    List<FloorsAdmin> getPageFloors(int shopId);

    Boolean addPageFloor(FloorsAdmin floorsAdmin);

    Boolean modifyPageFloor(FloorsAdmin floorsAdmin);
}

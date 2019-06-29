package com.zs.service;

import com.zs.entity.OpinionAdmin;

import java.util.List;

/**
 * @program: shopin
 * @description: 意见管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
public interface OpinionAdminService {
    List<OpinionAdmin> findOpinion(int shopId);

    Boolean modifyOpinion(OpinionAdmin opinionAdmin);

    Boolean deleteOpinion(OpinionAdmin opinionAdmin);
}

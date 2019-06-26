package com.zs.service;

import com.zs.entity.OpinionAdmin;

import java.util.List;

public interface OpinionAdminService {
    List<OpinionAdmin> findOpinion(OpinionAdmin opinionAdmin);

    Boolean modifyOpinion(OpinionAdmin opinionAdmin);

    Boolean deleteOpinion(OpinionAdmin opinionAdmin);
}

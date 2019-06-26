package com.zs.mapper;

import com.zs.entity.OpinionAdmin;

import java.util.List;

public interface OpinionAdminMapper {
    List<OpinionAdmin> findOpinion(OpinionAdmin opinionAdmin);

    Boolean modifyOpinion(OpinionAdmin opinionAdmin);

    Boolean deleteOpinion(OpinionAdmin opinionAdmin);
}

package com.zs.mapper;

import com.zs.entity.OpinionAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpinionAdminMapper {
    List<OpinionAdmin> findOpinion(OpinionAdmin opinionAdmin);

    Boolean modifyOpinion(OpinionAdmin opinionAdmin);

    Boolean deleteOpinion(OpinionAdmin opinionAdmin);
}

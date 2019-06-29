package com.zs.mapper;

import com.zs.entity.OpinionAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 意见管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Repository
public interface OpinionAdminMapper {
    List<OpinionAdmin> findOpinion(int shopId);

    Boolean modifyOpinion(OpinionAdmin opinionAdmin);

    Boolean deleteOpinion(OpinionAdmin opinionAdmin);
}

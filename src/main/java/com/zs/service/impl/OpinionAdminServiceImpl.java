package com.zs.service.impl;

import com.zs.entity.OpinionAdmin;
import com.zs.mapper.OpinionAdminMapper;
import com.zs.service.OpinionAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 意见管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Service
public class OpinionAdminServiceImpl implements OpinionAdminService {
    @Autowired
    private OpinionAdminMapper opinionAdminMapper;

    @Override
    public List<OpinionAdmin> findOpinion(OpinionAdmin opinionAdmin) {
        return opinionAdminMapper.findOpinion(opinionAdmin);
    }

    @Override
    public Boolean modifyOpinion(OpinionAdmin opinionAdmin) {
        opinionAdminMapper.modifyOpinion(opinionAdmin);
        return true;
    }

    @Override
    public Boolean deleteOpinion(OpinionAdmin opinionAdmin) {
        opinionAdminMapper.deleteOpinion(opinionAdmin);
        return true;
    }
}

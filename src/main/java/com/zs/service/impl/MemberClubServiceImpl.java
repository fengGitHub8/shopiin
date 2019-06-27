package com.zs.service.impl;

import com.zs.entity.MemberClub;
import com.zs.mapper.MemberClubMapper;
import com.zs.service.MemberClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 会员俱乐部
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Service
public class MemberClubServiceImpl implements MemberClubService {
    @Autowired
    private MemberClubMapper memberClubMapper;

    @Override
    public List<MemberClub> findMember(MemberClub memberClub) {
        return memberClubMapper.findMember(memberClub);
    }

    @Override
    public Boolean updateMember(MemberClub memberClub) {
        memberClubMapper.updateMember(memberClub);
        return true;
    }
}

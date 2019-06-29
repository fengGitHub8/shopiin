package com.zs.service;

import com.zs.entity.MemberClub;

import java.util.List;

/**
 * @program: shopin
 * @description: 会员俱乐部
 * @author: ZWX
 * @create: 2019-06-25
 **/
public interface MemberClubService {
    List<MemberClub> findMember(int id);

    Boolean modifyMember(MemberClub memberClub);

}

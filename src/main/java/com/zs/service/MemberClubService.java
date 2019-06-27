package com.zs.service;

import com.zs.entity.MemberClub;

import java.util.List;

public interface MemberClubService {
    List<MemberClub> findMember(MemberClub memberClub);

    Boolean updateMember(MemberClub memberClub);

}

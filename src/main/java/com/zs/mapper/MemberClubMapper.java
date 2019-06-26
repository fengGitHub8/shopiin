package com.zs.mapper;

import com.zs.entity.MemberClub;

import java.util.List;

public interface MemberClubMapper {
    List<MemberClub> findMember(MemberClub memberClub);

    Boolean updateMember(MemberClub memberClub);

}

package com.zs.mapper;

import com.zs.entity.MemberClub;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemberClubMapper {
    List<MemberClub> findMember(MemberClub memberClub);

    Boolean updateMember(MemberClub memberClub);

}

package com.zs.mapper;

import com.zs.entity.MemberClub;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 会员俱乐部
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Repository
public interface MemberClubMapper {
    List<MemberClub> findMember(MemberClub memberClub);

    Boolean updateMember(MemberClub memberClub);

}

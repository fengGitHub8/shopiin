package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.MemberClub;
import com.zs.service.MemberClubService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 会员Controller
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Controller
@ResponseBody
@RequestMapping("/memberClub")
public class MemberClubController {
    @Autowired
    private MemberClubService memberClubService;

    @RequestMapping("/finds")
    public ResultVO finds(int id) {
        List<MemberClub> memberClubs = memberClubService.findMember(id);
        return ResultVOUtil.success(memberClubs, null);
    }

    @RequestMapping("/modify")
    public ResultVO modify(MemberClub memberClub) {
        Boolean result = memberClubService.modifyMember(memberClub);
        return ResultVOUtil.success(result, null);
    }


}

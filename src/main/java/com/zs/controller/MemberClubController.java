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

@Controller
@ResponseBody
@RequestMapping("/memberClub")
public class MemberClubController {
    @Autowired
    private MemberClubService memberClubService;

    @RequestMapping("/finds")
    public ResultVO finds(MemberClub memberClub) {
        List<MemberClub> memberClubs = memberClubService.findMember(memberClub);
        return ResultVOUtil.success( memberClubs,null);
    }

    @RequestMapping("/modify")
    public ResultVO modify(MemberClub memberClub) {
        Boolean result = memberClubService.updateMember(memberClub);
        return ResultVOUtil.success(result,null);
    }


}

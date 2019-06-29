package com.zs.controller;

import com.zs.VO.ResultVO;
import com.zs.entity.CommentAdmin;
import com.zs.service.CommentAdminService;
import com.zs.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: shopin
 * @description: 评论Controller
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Controller
@ResponseBody
@RequestMapping("/commentAdmin")
public class CommentAdminController {
    @Autowired
    private CommentAdminService commentAdminService;

    @RequestMapping("/find")
    public ResultVO find(CommentAdmin commentAdmin) {
        List<CommentAdmin> commentAdmins = commentAdminService.findComment(commentAdmin);
        return ResultVOUtil.success(commentAdmins, null);
    }

    @RequestMapping("/findById")
    public ResultVO findById(int id) {
        List<CommentAdmin> commentAdmins = commentAdminService.findCommentById(id);
        return ResultVOUtil.success(commentAdmins, null);
    }

    @RequestMapping("/findByContent")
    public ResultVO findByContent(CommentAdmin commentAdmin) {
        List<CommentAdmin> commentAdmins = commentAdminService.findCommentByContent(commentAdmin);
        return ResultVOUtil.success(commentAdmins, null);
    }

    @RequestMapping("/modify")
    public ResultVO modify(CommentAdmin commentAdmin) {
        Boolean result = commentAdminService.modifyComment(commentAdmin);
        return ResultVOUtil.success(result, null);
    }
}
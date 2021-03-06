package com.zs.service.impl;

import com.zs.entity.CommentAdmin;
import com.zs.mapper.CommentAdminMapper;
import com.zs.service.CommentAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopin
 * @description: 评论管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Service
public class CommentAdminServiceImpl implements CommentAdminService {
    @Autowired
    private CommentAdminMapper commentAdminMapper;

    @Override
    public List<CommentAdmin> findComment(int shopId) {
        return commentAdminMapper.findComment(shopId);
    }

    @Override
    public List<CommentAdmin> findCommentById(int id) {
        return commentAdminMapper.findCommentById(id);
    }

    @Override
    public List<CommentAdmin> findCommentByContent(CommentAdmin commentAdmin) {
        return commentAdminMapper.findCommentByContent(commentAdmin);
    }

    @Override
    public Boolean modifyComment(CommentAdmin commentAdmin) {
        commentAdminMapper.modifyComment(commentAdmin);
        return true;
    }


}

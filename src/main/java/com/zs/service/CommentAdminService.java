package com.zs.service;

import com.zs.entity.CommentAdmin;

import java.util.List;

/**
 * @program: shopin
 * @description: 评论管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
public interface CommentAdminService {
    //根据门店id查询评论信息
    List<CommentAdmin> findComment(int shopId);

    //根据评论id查询评论信息
    List<CommentAdmin> findCommentById(int id);

    //根据评论内容content查询评论信息
    List<CommentAdmin> findCommentByContent(CommentAdmin commentAdmin);

    //修改评论状态，显示或者隐藏或置顶
    Boolean modifyComment(CommentAdmin commentAdmin);


}

package com.zs.service;

import com.zs.entity.CommentAdmin;

import java.util.List;

public interface CommentAdminService {
    //根据门店id查询评论信息
    List<CommentAdmin> findComment(CommentAdmin commentAdmin);

    //修改评论状态，显示或者隐藏或置顶
    Boolean modifyComment(CommentAdmin commentAdmin);


}

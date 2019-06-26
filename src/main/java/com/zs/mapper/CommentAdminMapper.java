package com.zs.mapper;

import com.zs.entity.CommentAdmin;

import java.util.List;

public interface CommentAdminMapper {

    List<CommentAdmin> findComment(CommentAdmin commentAdmin);
    Boolean modifyComment(CommentAdmin commentAdmin);

}

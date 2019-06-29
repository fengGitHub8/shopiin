package com.zs.mapper;

import com.zs.entity.CommentAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: shopin
 * @description: 评论管理
 * @author: ZWX
 * @create: 2019-06-25
 **/
@Repository
public interface CommentAdminMapper {

    List<CommentAdmin> findComment(int shopId);

    List<CommentAdmin> findCommentById(int id);

    List<CommentAdmin> findCommentByContent(CommentAdmin commentAdmin);

    Boolean modifyComment(CommentAdmin commentAdmin);

}

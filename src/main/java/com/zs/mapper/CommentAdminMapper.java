package com.zs.mapper;

import com.zs.entity.CommentAdmin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentAdminMapper {

    List<CommentAdmin> findComment(CommentAdmin commentAdmin);
    Boolean modifyComment(CommentAdmin commentAdmin);

}

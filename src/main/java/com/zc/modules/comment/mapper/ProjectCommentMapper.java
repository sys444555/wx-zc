package com.zc.modules.comment.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zc.modules.comment.entity.ProjectCommentReplyEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-21 16:07:17
 */
public interface ProjectCommentMapper extends BaseMapper<ProjectCommentReplyEntity> {

    public List<ProjectCommentReplyEntity> selectCommentList(@Param(value = "projectId") Integer projectId);

}

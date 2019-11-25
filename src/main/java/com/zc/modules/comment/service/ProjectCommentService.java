package com.zc.modules.comment.service;



import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.zc.modules.comment.entity.ProjectCommentEntity;

import java.util.List;


/**
 * 
 *
 * @author fenghuang
 * @email 
 * @date 2019-11-21 16:07:17
 */
public interface ProjectCommentService extends IService<ProjectCommentEntity> {

    public List<ProjectCommentEntity> projectCommentList(EntityWrapper<ProjectCommentEntity> entityEntityWrapper);
}


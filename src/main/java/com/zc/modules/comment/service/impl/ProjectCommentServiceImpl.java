package com.zc.modules.comment.service.impl;

import com.zc.modules.comment.entity.ProjectCommentReplyEntity;
import com.zc.modules.comment.mapper.ProjectCommentMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.zc.modules.comment.entity.ProjectCommentEntity;
import com.zc.modules.comment.service.ProjectCommentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectCommentServiceImpl extends ServiceImpl<ProjectCommentMapper, ProjectCommentReplyEntity> implements ProjectCommentService {

    @Resource
    private ProjectCommentMapper projectCommentMapper;


    @Override
    public List<ProjectCommentReplyEntity> selectCommentList(Integer projectId) {
        List<ProjectCommentReplyEntity> projectCommentReplyEntities = projectCommentMapper.selectCommentList(projectId);
        return projectCommentReplyEntities;
    }
}

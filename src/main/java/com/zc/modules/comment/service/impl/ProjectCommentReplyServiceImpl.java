package com.zc.modules.comment.service.impl;

import com.zc.modules.comment.mapper.ProjectCommentReplyMapper;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.zc.modules.comment.entity.ProjectCommentReplyEntity;
import com.zc.modules.comment.service.ProjectCommentReplyService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectCommentReplyServiceImpl extends ServiceImpl<ProjectCommentReplyMapper, ProjectCommentReplyEntity> implements ProjectCommentReplyService {

    @Resource
    private ProjectCommentReplyMapper projectCommentReplyMapper;

    



    public List<ProjectCommentReplyEntity> projectCommentReplyList(EntityWrapper<ProjectCommentReplyEntity> entityEntityWrapper){

           return  projectCommentReplyMapper.selectList(entityEntityWrapper);


    }



}

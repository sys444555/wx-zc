package com.zc.modules.comment.controller;


import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.common.utils.ResponseUtil;
import com.zc.modules.comment.entity.ProjectCommentReplyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zc.modules.comment.entity.ProjectCommentEntity;
import com.zc.modules.comment.service.ProjectCommentService;




/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-21 16:07:17
 */
@RestController
@RequestMapping("/wx/comment")
public class ProjectCommentController {
    @Autowired
    private ProjectCommentService projectCommentService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list/{projectId}", method = RequestMethod.GET)
    public ResponseUtil list(@PathVariable(value = "projectId") Integer projectId){
        List<ProjectCommentReplyEntity> projectCommentReplyEntities = projectCommentService.selectCommentList(projectId);
        return ResponseUtil.success(projectCommentReplyEntities);
    }




}

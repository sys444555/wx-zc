package com.zc.modules.comment.controller;

import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.modules.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zc.modules.comment.entity.ProjectCommentReplyEntity;
import com.zc.modules.comment.service.ProjectCommentReplyService;




/**
 * 
 *
 * @author fenghuang
 * @email 
 * @date 2019-11-21 16:07:17
 */
@RestController
@RequestMapping("/wx")
public class ProjectCommentReplyController {
    @Autowired
    private ProjectCommentReplyService projectCommentReplyService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseUtil list(){
        EntityWrapper<ProjectCommentReplyEntity> entityEntityWrapper = new EntityWrapper<>();

        List<ProjectCommentReplyEntity> projectCommentReplyEntities = projectCommentReplyService.projectCommentReplyList(entityEntityWrapper);
        return ResponseUtil.success(projectCommentReplyEntities);
    }




}

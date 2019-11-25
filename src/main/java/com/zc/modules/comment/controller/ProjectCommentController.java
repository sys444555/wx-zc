package com.zc.modules.comment.controller;

import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.modules.utils.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping("/wx")
public class ProjectCommentController {
    @Autowired
    private ProjectCommentService projectCommentService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseUtil list(){
        EntityWrapper<ProjectCommentEntity> entityEntityWrapper = new EntityWrapper<>();

        List<ProjectCommentEntity> projectCommentEntities = projectCommentService.projectCommentList(entityEntityWrapper);
        return ResponseUtil.success(projectCommentEntities);
    }




}

package com.zc.modules.project.controller;

import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.common.utils.ResponseUtil;
import com.zc.modules.project.service.ProjectBusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zc.modules.project.entity.ProjectBusinessEntity;





/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
@RestController
@RequestMapping("/wx/business")
public class ProjectBusinessController {
    @Autowired
    private ProjectBusinessService projectBusinessService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseUtil list(){
        EntityWrapper<ProjectBusinessEntity> entityEntityWrapper = new EntityWrapper<>();

        List<ProjectBusinessEntity> projectBusinessEntities = projectBusinessService.projectBusinessList(entityEntityWrapper);
        return ResponseUtil.success(projectBusinessEntities);
    }




}

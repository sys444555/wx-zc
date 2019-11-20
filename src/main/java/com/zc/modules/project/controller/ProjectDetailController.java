package com.zc.modules.project.controller;

import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.common.utils.ResponseUtil;
import com.zc.modules.project.service.ProjectDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zc.modules.project.entity.ProjectDetailEntity;




/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
@RestController
@RequestMapping("/wx/project")
public class ProjectDetailController {
    @Autowired
    private ProjectDetailService projectDetailService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseUtil list(Integer dataAmount){
        List<ProjectDetailEntity> projectDetailEntities = projectDetailService.projectDetailList(dataAmount);
        return ResponseUtil.success(projectDetailEntities);
    }




}

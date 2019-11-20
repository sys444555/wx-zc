package com.zc.modules.project.service;



import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.zc.modules.project.entity.ProjectDetailEntity;

import java.util.List;


/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
public interface ProjectDetailService extends IService<ProjectDetailEntity> {

    public List<ProjectDetailEntity> projectDetailList(Integer dataAmount);
}


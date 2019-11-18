package com.zc.modules.project.service;



import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.zc.modules.project.entity.ProjectBusinessEntity;

import java.util.List;


/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
public interface ProjectBusinessService extends IService<ProjectBusinessEntity> {

    public List<ProjectBusinessEntity> projectBusinessList(EntityWrapper<ProjectBusinessEntity> entityEntityWrapper);
}


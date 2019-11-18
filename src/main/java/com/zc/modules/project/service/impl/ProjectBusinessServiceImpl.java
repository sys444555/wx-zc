package com.zc.modules.project.service.impl;


import com.zc.modules.project.mapper.ProjectBusinessMapper;
import com.zc.modules.project.service.ProjectBusinessService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.zc.modules.project.entity.ProjectBusinessEntity;


import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectBusinessServiceImpl extends ServiceImpl<ProjectBusinessMapper, ProjectBusinessEntity> implements ProjectBusinessService {

    @Resource
    private ProjectBusinessMapper projectBusinessMapper;





    public List<ProjectBusinessEntity> projectBusinessList(EntityWrapper<ProjectBusinessEntity> entityEntityWrapper){

           return  projectBusinessMapper.selectList(entityEntityWrapper);


    }



}

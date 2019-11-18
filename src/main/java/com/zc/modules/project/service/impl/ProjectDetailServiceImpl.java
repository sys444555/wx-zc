package com.zc.modules.project.service.impl;


import com.zc.modules.project.mapper.ProjectDetailMapper;
import com.zc.modules.project.service.ProjectDetailService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.zc.modules.project.entity.ProjectDetailEntity;


import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectDetailServiceImpl extends ServiceImpl<ProjectDetailMapper, ProjectDetailEntity> implements ProjectDetailService {

    @Resource
    private ProjectDetailMapper projectDetailMapper;





    public List<ProjectDetailEntity> projectDetailList(){

           return  projectDetailMapper.selectList();


    }



}

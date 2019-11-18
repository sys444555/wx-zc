package com.zc.modules.project.mapper;

import com.zc.modules.project.entity.ProjectDetailEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
public interface ProjectDetailMapper extends BaseMapper<ProjectDetailEntity> {

    public List<ProjectDetailEntity> selectList();

}

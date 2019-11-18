package com.zc.modules.project.service.impl;


import com.zc.modules.project.mapper.BannerMapper;
import com.zc.modules.project.service.BannerService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.zc.modules.project.entity.BannerEntity;


import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, BannerEntity> implements BannerService {

    @Resource
    private BannerMapper bannerMapper;





    public List<BannerEntity> bannerList(EntityWrapper<BannerEntity> entityEntityWrapper){

           return  bannerMapper.selectList(entityEntityWrapper);


    }



}

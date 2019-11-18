package com.zc.modules.project.service;



import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.IService;
import com.zc.modules.project.entity.BannerEntity;

import java.util.List;


/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
public interface BannerService extends IService<BannerEntity> {

    public List<BannerEntity> bannerList(EntityWrapper<BannerEntity> entityEntityWrapper);
}


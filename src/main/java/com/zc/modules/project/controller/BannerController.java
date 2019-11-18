package com.zc.modules.project.controller;

import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.common.utils.ResponseUtil;
import com.zc.modules.project.service.BannerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zc.modules.project.entity.BannerEntity;



/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
@RestController
@RequestMapping("/wx/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    /**
     * 列表
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseUtil list(){
        EntityWrapper<BannerEntity> entityEntityWrapper = new EntityWrapper<>();

        List<BannerEntity> bannerEntities = bannerService.bannerList(entityEntityWrapper);
        return ResponseUtil.success(bannerEntities);
    }




}

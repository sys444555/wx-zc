package com.zc.modules.auth.service;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zc.modules.auth.entity.UserEntity;

import java.util.List;


/**
 * @author ：fenghuang
 * @date ：Created in 2019/7/2 17:29
 * @description：
 * @modified By：
 * @version:
 */
public interface UserService {

    public Integer checkOpenId(EntityWrapper wrapper, UserEntity userEntity);

    public void insertUser(UserEntity userEntity);

}

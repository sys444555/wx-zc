package com.zc.modules.user.service;

import com.baomidou.mybatisplus.service.IService;
import com.zc.modules.user.entity.UserEntity;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/10/26 15:17
 * @description：
 * @modified By：
 * @version:
 */
public interface UserService extends IService<UserEntity> {

    public UserEntity getPassword(String userName);

    public void updatePassword(Integer id, String password);

    public Integer checkInfoNameAndReg(String userName, String password,String phone ,String name,String identityNumber,String openId);
}

package com.zc.modules.user.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zc.common.exception.JcException;
import com.zc.modules.user.entity.UserEntity;
import com.zc.modules.user.mapper.UserMapper;
import com.zc.modules.user.service.UserService;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/10/26 15:22
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserEntity getPassword(String userName) {
        UserEntity userEntity = userMapper.getPassword(userName);
        return userEntity;
    }

    @Override
    public void updatePassword(Integer id, String password) {

        Integer integer = userMapper.updatePassword(id, password);
        if(integer == 0){
            throw new JcException("密码修改失败");
        }

    }

    @Override
    public Integer checkInfoNameAndReg(String userName, String password,String phone ,String name,String identityNumber,String openId) {

        Integer status = this.checkUser(userName,phone,name,identityNumber);
        if(status != 0) { return status; };

        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userName);
        userEntity.setPassword(password);
        userEntity.setName(name);
        userEntity.setPhone(phone);
        userEntity.setIdentityNumber(identityNumber);
        userEntity.setOpenId(openId);
        Integer insert = userMapper.insert(userEntity);

        return insert == 1 ? 0 : -1;
    }

    //根据用户名查询是否存在对应的用户名
    private Integer checkUser(String userName,String phone ,String name,String identityNumber){
        if(userMapper.selectList(new EntityWrapper<UserEntity>().eq("user_name",userName)).size() != 0){
            return 1;
        }else if(userMapper.selectList(new EntityWrapper<UserEntity>().eq("phone",phone)).size() != 0){
            return 2;
        } else if(userMapper.selectList(new EntityWrapper<UserEntity>().eq("identity_number",identityNumber)).size() != 0){
            return 3;
        }
        return 0;
    }
}

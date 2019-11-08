package com.zc.modules.user.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zc.modules.user.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/10/26 15:23
 * @description：
 * @modified By：
 * @version:
 */
public interface UserMapper extends BaseMapper<UserEntity> {

    public UserEntity getPassword(@Param("userName") String userName);

    public Integer updatePassword(@Param("id")Integer id,
                                  @Param("password")String password);
}

package com.zc.modules.user.controller;

import com.zc.common.utils.ResponseUtil;
import com.zc.modules.user.entity.UserEntity;
import com.zc.modules.user.mapper.UserMapper;
import com.zc.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author ：fenghuang
 * @date ：Created in 2019/10/26 15:18
 * @description：
 * @modified By：
 * @version:
 */

@RestController
@RequestMapping("/wx")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseUtil userLogin(String userName, String password){

        UserEntity userEntity = userService.getPassword(userName);
        if (userEntity == null || userEntity.getPassword() == null) {
            return ResponseUtil.success(401, "用户名错误或者不存在");
        } else if (!userEntity.getPassword().equals(password)) {
            return ResponseUtil.success(401, "密码错误");
        } else {
            return ResponseUtil.success(userEntity);
        }
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    public ResponseUtil updatePassword(Integer id, String password){
        userService.updatePassword(id, password);
        return ResponseUtil.success();
    }


    @RequestMapping(value = "/checkUserNameAndReg" , method = RequestMethod.POST)
    public ResponseUtil checkInfoNameAndReg (String userName, String password,String phone ,String name, String identityNumber, String openId){
        Integer regStatus = userService.checkInfoNameAndReg(userName,password,phone,name,identityNumber,openId);
        return ResponseUtil.success(regStatus);
    }

}

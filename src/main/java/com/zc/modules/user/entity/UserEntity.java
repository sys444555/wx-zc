package com.zc.modules.user.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/10/26 15:18
 * @description：
 * @modified By：
 * @version:
 */
@TableName("user")
@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增ID",name = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名",name="userName")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "密码",name="password")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "名字",name="name")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "电话号码",name="phone")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "状态(1.在职 0.离职)",name="status")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "头像",name="headSculpture")
    @TableField("head_sculpture")
    private String headSculpture;

    @ApiModelProperty(value = "订单Id",name="orderId")
    @TableField("order_id")
    private Integer orderId;


    @ApiModelProperty(value = "身份证",name="identityNumber")
    @TableField("identity_number")
    private String identityNumber;

    @ApiModelProperty(value = "openId",name="openId")
    @TableField("open_id")
    private String openId;

}

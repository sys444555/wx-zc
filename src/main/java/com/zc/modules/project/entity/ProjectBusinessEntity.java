package com.zc.modules.project.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import lombok.Data;
import java.util.Date;
/**
 *
 *
 * @author fenghuang
 * @email
 * @date 2019-11-18 19:30:10
 */
@Data
public class ProjectBusinessEntity {

		/**
	 * 商户名称
	 */
	    private String businessName;
		/**
	 * 商户地址
	 */
	    private String businessAddress;
		/**
	 * 商户电话
	 */
	    private String businessPhone;
		/**
	 * 商家评级
	 */
	    private Integer businessGrade;
		/**
	 * 商家是否认证
	 */
	    private Integer businessIsAuthenticated;
		/**
	 *
	 */
	    private Date businessCreateTime;

}

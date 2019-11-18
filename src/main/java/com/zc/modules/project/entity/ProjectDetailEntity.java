package com.zc.modules.project.entity;

import com.baomidou.mybatisplus.annotations.TableId;
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
public class ProjectDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
		@TableId(type = IdType.AUTO)
	    private Integer id;
		/**
	 * 目标金额
	 */
	    private Double fundingTarget;
		/**
	 * 目前金额
	 */
	    private Double fundingNow;
		/**
	 * 进度率
	 */
	    private Double fundingRate;
		/**
	 * 认筹人数
	 */
	    private Integer fundingNumer;
		/**
	 * 0未审核，1审核中，2.审核通过，3.审核失败
	 */
	    private Integer status;
		/**
	 * 项目众筹开始时间
	 */
	    private Date fundingStartTime;
		/**
	 * 项目众筹结束时间
	 */
	    private Date fundingEntTime;
		/**
	 * 项目图片
	 */
	    private String imgUrl;
		/**
	 * 项目名
	 */
	    private String fundingName;
		/**
	 * 项目标题
	 */
	    private String fundingTitle;
		/**
	 * 项目详情
	 */
	    private String fundingIntroduction;
		/**
	 * 众筹类型
	 */
	    private Integer fundingType;
		/**
	 *
	 */
	    private Date createTime;

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

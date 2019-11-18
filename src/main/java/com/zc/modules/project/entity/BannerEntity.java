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
@TableName("banner")
@Data
public class BannerEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
		@TableId(type = IdType.AUTO)
	    private Integer id;
		/**
	 * 图片路径
	 */
	    private String imgUrl;
		/**
	 * 状态
	 */
	    private Integer status;
		/**
	 * 关键字
	 */
	    private String key;
		/**
	 * 创建时间
	 */
	    private Date createTime;

}

package com.zc.modules.comment.entity;

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
 * @date 2019-11-21 16:07:17
 */
@TableName("project_comment")
@Data
public class ProjectCommentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 项目id
	 */
	private Integer projectId;
	/**
	 * 项目类型
	 */
	private String projectType;
	/**
	 * 评论内容
	 */
	private String coment;
	/**
	 * 评论用户id
	 */
	private String fromOpenId;
	/**
	 *
	 */
	private Date createTime;

}

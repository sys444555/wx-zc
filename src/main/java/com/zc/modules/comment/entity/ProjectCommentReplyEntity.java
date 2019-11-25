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
@TableName("project_comment_reply")
@Data
public class ProjectCommentReplyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;
		/**
	 * 评论id
	 */
	private Integer commentId;
		/**
	 * 回复目标的id
	 */
	private Integer replyId;
		/**
	 * 0.对评论的回复 1.对回复的回复
	 */
	private Integer replyType;
		/**
	 * 回复内容
	 */
	private String content;
		/**
	 * 回复用户id
	 */
	private String fromOpenId;
		/**
	 * 目标用户id
	 */
	private String toOpenId;
		/**
	 * 创建时间
	 */
	private Date createTime;

}

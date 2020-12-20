package cn.kaciner.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-19 08:09:05
 */
@Data
@TableName("mq_message")
public class MqMessageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String messageId;
	/**
	 * JSON
	 */
	private String content;
	/**
	 * 
	 */
	private String toExchange;
	/**
	 * 
	 */
	private String classType;
	/**
	 * 0-新建 1-已发送 2-错误抵达 3-已抵达
	 */
	private Integer messageStatus;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}

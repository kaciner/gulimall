package cn.kaciner.gulimall.order.dao;

import cn.kaciner.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-19 08:09:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

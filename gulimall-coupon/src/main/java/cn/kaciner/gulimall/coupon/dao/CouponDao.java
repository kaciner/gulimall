package cn.kaciner.gulimall.coupon.dao;

import cn.kaciner.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-19 07:42:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

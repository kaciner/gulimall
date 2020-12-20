package cn.kaciner.gulimall.member.dao;

import cn.kaciner.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-20 11:56:09
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}

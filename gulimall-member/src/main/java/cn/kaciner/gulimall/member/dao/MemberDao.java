package cn.kaciner.gulimall.member.dao;

import cn.kaciner.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-20 11:56:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

package cn.kaciner.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.kaciner.common.utils.PageUtils;
import cn.kaciner.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-19 07:56:21
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


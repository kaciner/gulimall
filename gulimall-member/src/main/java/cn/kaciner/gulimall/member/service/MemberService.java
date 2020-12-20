package cn.kaciner.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.kaciner.common.utils.PageUtils;
import cn.kaciner.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-20 11:56:09
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


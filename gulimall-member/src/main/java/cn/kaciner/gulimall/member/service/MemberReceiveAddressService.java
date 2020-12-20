package cn.kaciner.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.kaciner.common.utils.PageUtils;
import cn.kaciner.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-20 11:56:09
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


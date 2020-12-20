package cn.kaciner.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.kaciner.common.utils.PageUtils;
import cn.kaciner.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-20 11:56:09
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


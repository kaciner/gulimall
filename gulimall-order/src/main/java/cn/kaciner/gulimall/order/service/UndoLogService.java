package cn.kaciner.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.kaciner.common.utils.PageUtils;
import cn.kaciner.gulimall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-19 08:09:05
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


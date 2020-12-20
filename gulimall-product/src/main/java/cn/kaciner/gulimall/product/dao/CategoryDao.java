package cn.kaciner.gulimall.product.dao;

import cn.kaciner.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kaciner
 * @email yinzhe365@vip.qq.com
 * @date 2020-12-19 00:03:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

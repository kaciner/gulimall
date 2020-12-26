package cn.kaciner.gulimall.product.service.impl;

import cn.kaciner.common.exception.RRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.kaciner.common.utils.PageUtils;
import cn.kaciner.common.utils.Query;

import cn.kaciner.gulimall.product.dao.CategoryDao;
import cn.kaciner.gulimall.product.entity.CategoryEntity;
import cn.kaciner.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1. 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2. 组装成父子的树形结构
        //2.1 找到所有的一级分类
        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) ->
            categoryEntity.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildrens(menu, entities));
            return menu;
        }).sorted((menu1, menu2) ->  (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort())
        ).collect(Collectors.toList());
        return level1Menus;
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) throws RRException{
        List<CategoryEntity> children = all.stream().filter((categoryEntity) -> {
            if(categoryEntity.getParentCid() != null){
                return categoryEntity.getParentCid().equals(root.getCatId());
            }else {
                throw new RRException("没有找到Parent id");
            }
        }).map(categoryEntity -> {
            //1. 找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted(Comparator.comparingInt(menu -> (Optional.ofNullable(menu.getSort()).orElse(0)))
        ).collect(Collectors.toList());
        return children;
    }

}
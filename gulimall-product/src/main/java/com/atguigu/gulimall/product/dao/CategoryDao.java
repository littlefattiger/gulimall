package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author littlefattiger
 * @email 6698381@qq.com
 * @date 2021-08-01 14:29:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

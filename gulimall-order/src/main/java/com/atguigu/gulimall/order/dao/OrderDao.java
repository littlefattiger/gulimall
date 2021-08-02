package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author littlefattiger
 * @email 6698381@qq.com
 * @date 2021-08-01 16:52:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

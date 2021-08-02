package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author littlefattiger
 * @email 6698381@qq.com
 * @date 2021-08-01 16:23:54
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

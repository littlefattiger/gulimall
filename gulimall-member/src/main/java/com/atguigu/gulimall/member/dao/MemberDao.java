package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author littlefattiger
 * @email 6698381@qq.com
 * @date 2021-08-01 16:41:13
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

package com.fast.framework.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fast.framework.sys.entity.SysModuleEntity;

/**
 * 模块 Mapper 接口
 * @author zhouzhou
 * @date 2020-03-08 21:20
 */
public interface SysModuleMapper extends BaseMapper<SysModuleEntity>{
	
	/**
	 * 通过权限ID获取模块
	 */
	List<SysModuleEntity> selectSysModuleByRoleId(@Param("ids") List<Long> ids);
	
	/**
	 * 修改状态
	 */
	int setStatus(@Param("id") Long id, 
			      @Param("status") String status);
	
}

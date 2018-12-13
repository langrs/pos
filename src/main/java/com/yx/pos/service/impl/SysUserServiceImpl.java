package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.SysUserDao;
import com.yx.pos.model.SysUser;
import com.yx.pos.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:SysUser Service Impl 对象
 * 开发人员:LZM
 */
@Service("SysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<String, SysUser> implements SysUserService
{
	@Resource
	SysUserDao dao;

	@Override
	protected BaseDao<String, SysUser> getDao() {
		return dao;
	}
}

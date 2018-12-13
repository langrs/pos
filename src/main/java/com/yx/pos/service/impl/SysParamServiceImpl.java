package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.SysParamDao;
import com.yx.pos.model.SysParam;
import com.yx.pos.service.SysParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:SysParam Service Impl 对象
 * 开发人员:LZM
 */
@Service("SysParamService")
public class SysParamServiceImpl extends BaseServiceImpl<String, SysParam> implements SysParamService
{
	@Resource
	SysParamDao dao;

	@Override
	protected BaseDao<String, SysParam> getDao() {
		return dao;
	}
}

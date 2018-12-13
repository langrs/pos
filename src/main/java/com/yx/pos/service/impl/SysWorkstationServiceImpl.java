package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.SysWorkstationDao;
import com.yx.pos.model.SysWorkstation;
import com.yx.pos.service.SysWorkstationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:SysWorkstation Service Impl 对象
 * 开发人员:LZM
 */
@Service("SysWorkstationService")
public class SysWorkstationServiceImpl extends BaseServiceImpl<String, SysWorkstation> implements SysWorkstationService
{
	@Resource
	SysWorkstationDao dao;

	@Override
	protected BaseDao<String, SysWorkstation> getDao() {
		return dao;
	}
}

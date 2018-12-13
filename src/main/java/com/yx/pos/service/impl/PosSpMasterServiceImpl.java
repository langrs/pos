package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosSpMasterDao;
import com.yx.pos.model.PosSpMaster;
import com.yx.pos.service.PosSpMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosSpMaster Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosSpMasterService")
public class PosSpMasterServiceImpl extends BaseServiceImpl<String, PosSpMaster> implements PosSpMasterService
{
	@Resource
	PosSpMasterDao dao;

	@Override
	protected BaseDao<String, PosSpMaster> getDao() {
		return dao;
	}
}

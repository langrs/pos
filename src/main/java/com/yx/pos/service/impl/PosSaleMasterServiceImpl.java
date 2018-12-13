package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosSaleMasterDao;
import com.yx.pos.model.PosSaleMaster;
import com.yx.pos.service.PosSaleMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosSaleMaster Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosSaleMasterService")
public class PosSaleMasterServiceImpl extends BaseServiceImpl<String, PosSaleMaster> implements PosSaleMasterService
{
	@Resource
	PosSaleMasterDao dao;

	@Override
	protected BaseDao<String, PosSaleMaster> getDao() {
		return dao;
	}
}

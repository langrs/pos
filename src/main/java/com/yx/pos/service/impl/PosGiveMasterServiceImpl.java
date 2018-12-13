package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosGiveMasterDao;
import com.yx.pos.model.PosGiveMaster;
import com.yx.pos.service.PosGiveMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosGiveMaster Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosGiveMasterService")
public class PosGiveMasterServiceImpl extends BaseServiceImpl<String, PosGiveMaster> implements PosGiveMasterService
{
	@Resource
	PosGiveMasterDao dao;

	@Override
	protected BaseDao<String, PosGiveMaster> getDao() {
		return dao;
	}
}

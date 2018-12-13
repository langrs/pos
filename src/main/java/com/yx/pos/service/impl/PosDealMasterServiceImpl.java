package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosDealMasterDao;
import com.yx.pos.model.PosDealMaster;
import com.yx.pos.service.PosDealMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosDealMaster Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosDealMasterService")
public class PosDealMasterServiceImpl extends BaseServiceImpl<String, PosDealMaster> implements PosDealMasterService
{
	@Resource
	PosDealMasterDao dao;

	@Override
	protected BaseDao<String, PosDealMaster> getDao() {
		return dao;
	}
}

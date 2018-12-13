package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.CgSpecPriceMasterDao;
import com.yx.pos.model.CgSpecPriceMaster;
import com.yx.pos.service.CgSpecPriceMasterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:CgSpecPriceMaster Service Impl 对象
 * 开发人员:LZM
 */
@Service("CgSpecPriceMasterService")
public class CgSpecPriceMasterServiceImpl extends BaseServiceImpl<String, CgSpecPriceMaster> implements CgSpecPriceMasterService
{
	@Resource
	CgSpecPriceMasterDao dao;

	@Override
	protected BaseDao<String, CgSpecPriceMaster> getDao() {
		return dao;
	}
}

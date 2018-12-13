package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosStamptypeDao;
import com.yx.pos.model.PosStamptype;
import com.yx.pos.service.PosStamptypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosStamptype Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosStamptypeService")
public class PosStamptypeServiceImpl extends BaseServiceImpl<String, PosStamptype> implements PosStamptypeService
{
	@Resource
	PosStamptypeDao dao;

	@Override
	protected BaseDao<String, PosStamptype> getDao() {
		return dao;
	}
}

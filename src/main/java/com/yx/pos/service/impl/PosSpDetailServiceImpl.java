package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosSpDetailDao;
import com.yx.pos.model.PosSpDetail;
import com.yx.pos.service.PosSpDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosSpDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosSpDetailService")
public class PosSpDetailServiceImpl extends BaseServiceImpl<String, PosSpDetail> implements PosSpDetailService
{
	@Resource
	PosSpDetailDao dao;

	@Override
	protected BaseDao<String, PosSpDetail> getDao() {
		return dao;
	}
}

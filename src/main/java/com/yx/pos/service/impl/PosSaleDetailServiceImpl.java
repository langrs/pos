package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosSaleDetailDao;
import com.yx.pos.model.PosSaleDetail;
import com.yx.pos.service.PosSaleDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosSaleDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosSaleDetailService")
public class PosSaleDetailServiceImpl extends BaseServiceImpl<String, PosSaleDetail> implements PosSaleDetailService
{
	@Resource
	PosSaleDetailDao dao;

	@Override
	protected BaseDao<String, PosSaleDetail> getDao() {
		return dao;
	}
}

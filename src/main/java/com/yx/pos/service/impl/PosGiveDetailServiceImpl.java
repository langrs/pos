package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosGiveDetailDao;
import com.yx.pos.model.PosGiveDetail;
import com.yx.pos.service.PosGiveDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosGiveDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosGiveDetailService")
public class PosGiveDetailServiceImpl extends BaseServiceImpl<String, PosGiveDetail> implements PosGiveDetailService
{
	@Resource
	PosGiveDetailDao dao;

	@Override
	protected BaseDao<String, PosGiveDetail> getDao() {
		return dao;
	}
}

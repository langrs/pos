package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosDealDetailDao;
import com.yx.pos.model.PosDealDetail;
import com.yx.pos.service.PosDealDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosDealDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosDealDetailService")
public class PosDealDetailServiceImpl extends BaseServiceImpl<String, PosDealDetail> implements PosDealDetailService
{
	@Resource
	PosDealDetailDao dao;

	@Override
	protected BaseDao<String, PosDealDetail> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipFlowDao;
import com.yx.pos.model.VipFlow;
import com.yx.pos.service.VipFlowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipFlow Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipFlowService")
public class VipFlowServiceImpl extends BaseServiceImpl<String, VipFlow> implements VipFlowService
{
	@Resource
	VipFlowDao dao;

	@Override
	protected BaseDao<String, VipFlow> getDao() {
		return dao;
	}
}

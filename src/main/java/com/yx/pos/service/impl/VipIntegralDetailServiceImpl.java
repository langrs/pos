package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipIntegralDetailDao;
import com.yx.pos.model.VipIntegralDetail;
import com.yx.pos.service.VipIntegralDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipIntegralDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipIntegralDetailService")
public class VipIntegralDetailServiceImpl extends BaseServiceImpl<String, VipIntegralDetail> implements VipIntegralDetailService
{
	@Resource
	VipIntegralDetailDao dao;

	@Override
	protected BaseDao<String, VipIntegralDetail> getDao() {
		return dao;
	}
}

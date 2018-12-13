package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipIntegralStampDao;
import com.yx.pos.model.VipIntegralStamp;
import com.yx.pos.service.VipIntegralStampService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipIntegralStamp Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipIntegralStampService")
public class VipIntegralStampServiceImpl extends BaseServiceImpl<String, VipIntegralStamp> implements VipIntegralStampService
{
	@Resource
	VipIntegralStampDao dao;

	@Override
	protected BaseDao<String, VipIntegralStamp> getDao() {
		return dao;
	}
}

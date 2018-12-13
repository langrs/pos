package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipIntegralInfoDao;
import com.yx.pos.model.VipIntegralInfo;
import com.yx.pos.service.VipIntegralInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipIntegralInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipIntegralInfoService")
public class VipIntegralInfoServiceImpl extends BaseServiceImpl<String, VipIntegralInfo> implements VipIntegralInfoService
{
	@Resource
	VipIntegralInfoDao dao;

	@Override
	protected BaseDao<String, VipIntegralInfo> getDao() {
		return dao;
	}
}

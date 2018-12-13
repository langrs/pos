package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipTypeInfoDao;
import com.yx.pos.model.VipTypeInfo;
import com.yx.pos.service.VipTypeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipTypeInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipTypeInfoService")
public class VipTypeInfoServiceImpl extends BaseServiceImpl<String, VipTypeInfo> implements VipTypeInfoService
{
	@Resource
	VipTypeInfoDao dao;

	@Override
	protected BaseDao<String, VipTypeInfo> getDao() {
		return dao;
	}
}

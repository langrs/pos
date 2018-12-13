package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipInfoDao;
import com.yx.pos.model.VipInfo;
import com.yx.pos.service.VipInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipInfoService")
public class VipInfoServiceImpl extends BaseServiceImpl<String, VipInfo> implements VipInfoService
{
	@Resource
	VipInfoDao dao;

	@Override
	protected BaseDao<String, VipInfo> getDao() {
		return dao;
	}
}

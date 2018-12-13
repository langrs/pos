package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipTypeDetailDao;
import com.yx.pos.model.VipTypeDetail;
import com.yx.pos.service.VipTypeDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipTypeDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipTypeDetailService")
public class VipTypeDetailServiceImpl extends BaseServiceImpl<String, VipTypeDetail> implements VipTypeDetailService
{
	@Resource
	VipTypeDetailDao dao;

	@Override
	protected BaseDao<String, VipTypeDetail> getDao() {
		return dao;
	}
}

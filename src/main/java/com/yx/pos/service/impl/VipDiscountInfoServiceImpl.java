package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipDiscountInfoDao;
import com.yx.pos.model.VipDiscountInfo;
import com.yx.pos.service.VipDiscountInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipDiscountInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipDiscountInfoService")
public class VipDiscountInfoServiceImpl extends BaseServiceImpl<String, VipDiscountInfo> implements VipDiscountInfoService
{
	@Resource
	VipDiscountInfoDao dao;

	@Override
	protected BaseDao<String, VipDiscountInfo> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipDiscountDetailDao;
import com.yx.pos.model.VipDiscountDetail;
import com.yx.pos.service.VipDiscountDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipDiscountDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipDiscountDetailService")
public class VipDiscountDetailServiceImpl extends BaseServiceImpl<String, VipDiscountDetail> implements VipDiscountDetailService
{
	@Resource
	VipDiscountDetailDao dao;

	@Override
	protected BaseDao<String, VipDiscountDetail> getDao() {
		return dao;
	}
}

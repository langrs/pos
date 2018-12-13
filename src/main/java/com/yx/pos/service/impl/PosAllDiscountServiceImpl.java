package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosAllDiscountDao;
import com.yx.pos.model.PosAllDiscount;
import com.yx.pos.service.PosAllDiscountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosAllDiscount Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosAllDiscountService")
public class PosAllDiscountServiceImpl extends BaseServiceImpl<String, PosAllDiscount> implements PosAllDiscountService
{
	@Resource
	PosAllDiscountDao dao;

	@Override
	protected BaseDao<String, PosAllDiscount> getDao() {
		return dao;
	}
}

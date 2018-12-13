package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosSalePaymentDao;
import com.yx.pos.model.PosSalePayment;
import com.yx.pos.service.PosSalePaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosSalePayment Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosSalePaymentService")
public class PosSalePaymentServiceImpl extends BaseServiceImpl<String, PosSalePayment> implements PosSalePaymentService
{
	@Resource
	PosSalePaymentDao dao;

	@Override
	protected BaseDao<String, PosSalePayment> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.DataPaymentDao;
import com.yx.pos.model.DataPayment;
import com.yx.pos.service.DataPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:DataPayment Service Impl 对象
 * 开发人员:LZM
 */
@Service("DataPaymentService")
public class DataPaymentServiceImpl extends BaseServiceImpl<String, DataPayment> implements DataPaymentService
{
	@Resource
	DataPaymentDao dao;

	@Override
	protected BaseDao<String, DataPayment> getDao() {
		return dao;
	}
}

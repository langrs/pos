package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.VipMoneyDao;
import com.yx.pos.model.VipMoney;
import com.yx.pos.service.VipMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:VipMoney Service Impl 对象
 * 开发人员:LZM
 */
@Service("VipMoneyService")
public class VipMoneyServiceImpl extends BaseServiceImpl<String, VipMoney> implements VipMoneyService
{
	@Resource
	VipMoneyDao dao;

	@Override
	protected BaseDao<String, VipMoney> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.CounterInfoDao;
import com.yx.pos.model.CounterInfo;
import com.yx.pos.service.CounterInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:CounterInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("CounterInfoService")
public class CounterInfoServiceImpl extends BaseServiceImpl<String, CounterInfo> implements CounterInfoService
{
	@Resource
	CounterInfoDao dao;

	@Override
	protected BaseDao<String, CounterInfo> getDao() {
		return dao;
	}
}

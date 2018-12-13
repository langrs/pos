package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.DataCoinDao;
import com.yx.pos.model.DataCoin;
import com.yx.pos.service.DataCoinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:DataCoin Service Impl 对象
 * 开发人员:LZM
 */
@Service("DataCoinService")
public class DataCoinServiceImpl extends BaseServiceImpl<String, DataCoin> implements DataCoinService
{
	@Resource
	DataCoinDao dao;

	@Override
	protected BaseDao<String, DataCoin> getDao() {
		return dao;
	}
}

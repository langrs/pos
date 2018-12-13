package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.SupInfoDao;
import com.yx.pos.model.SupInfo;
import com.yx.pos.service.SupInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:SupInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("SupInfoService")
public class SupInfoServiceImpl extends BaseServiceImpl<String, SupInfo> implements SupInfoService
{
	@Resource
	SupInfoDao dao;

	@Override
	protected BaseDao<String, SupInfo> getDao() {
		return dao;
	}
}

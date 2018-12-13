package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosStampInfoDao;
import com.yx.pos.model.PosStampInfo;
import com.yx.pos.service.PosStampInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosStampInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosStampInfoService")
public class PosStampInfoServiceImpl extends BaseServiceImpl<String, PosStampInfo> implements PosStampInfoService
{
	@Resource
	PosStampInfoDao dao;

	@Override
	protected BaseDao<String, PosStampInfo> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.SysCodeDao;
import com.yx.pos.model.SysCode;
import com.yx.pos.service.SysCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:SysCode Service Impl 对象
 * 开发人员:LZM
 */
@Service("SysCodeService")
public class SysCodeServiceImpl extends BaseServiceImpl<String, SysCode> implements SysCodeService
{
	@Resource
	SysCodeDao dao;

	@Override
	protected BaseDao<String, SysCode> getDao() {
		return dao;
	}
}

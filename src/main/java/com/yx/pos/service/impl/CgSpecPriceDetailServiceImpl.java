package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.CgSpecPriceDetailDao;
import com.yx.pos.model.CgSpecPriceDetail;
import com.yx.pos.service.CgSpecPriceDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:CgSpecPriceDetail Service Impl 对象
 * 开发人员:LZM
 */
@Service("CgSpecPriceDetailService")
public class CgSpecPriceDetailServiceImpl extends BaseServiceImpl<String, CgSpecPriceDetail> implements CgSpecPriceDetailService
{
	@Resource
	CgSpecPriceDetailDao dao;

	@Override
	protected BaseDao<String, CgSpecPriceDetail> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.ItemInfoDao;
import com.yx.pos.model.ItemInfo;
import com.yx.pos.service.ItemInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:ItemInfo Service Impl 对象
 * 开发人员:LZM
 */
@Service("ItemInfoService")
public class ItemInfoServiceImpl extends BaseServiceImpl<String, ItemInfo> implements ItemInfoService
{
	@Resource
	ItemInfoDao dao;

	@Override
	protected BaseDao<String, ItemInfo> getDao() {
		return dao;
	}
}

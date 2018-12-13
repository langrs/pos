package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.ItemPackDao;
import com.yx.pos.model.ItemPack;
import com.yx.pos.service.ItemPackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:ItemPack Service Impl 对象
 * 开发人员:LZM
 */
@Service("ItemPackService")
public class ItemPackServiceImpl extends BaseServiceImpl<String, ItemPack> implements ItemPackService
{
	@Resource
	ItemPackDao dao;

	@Override
	protected BaseDao<String, ItemPack> getDao() {
		return dao;
	}
}

package com.yx.pos.service.impl;

import com.yx.pos.base.BaseDao;
import com.yx.pos.base.BaseServiceImpl;
import com.yx.pos.dao.PosGiveItemDao;
import com.yx.pos.model.PosGiveItem;
import com.yx.pos.service.PosGiveItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 对象功能:PosGiveItem Service Impl 对象
 * 开发人员:LZM
 */
@Service("PosGiveItemService")
public class PosGiveItemServiceImpl extends BaseServiceImpl<String, PosGiveItem> implements PosGiveItemService
{
	@Resource
	PosGiveItemDao dao;

	@Override
	protected BaseDao<String, PosGiveItem> getDao() {
		return dao;
	}
}

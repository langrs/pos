package com.yx.pos.dao;

import com.yx.pos.base.BaseDao;
import com.yx.pos.model.CounterInfo;
import org.apache.ibatis.annotations.Mapper;

/**
* 描述：
* @author lzm
* @date 2018/09/07
*/
@Mapper
public interface CounterInfoDao extends BaseDao<String,CounterInfo>{

}
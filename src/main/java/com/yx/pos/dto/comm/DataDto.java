package com.yx.pos.dto.comm;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author LZM
 * @description
 * @date 16:18 2018/9/15
 * @mondified
 **/
public class DataDto<T> {
	@ApiModelProperty(value = "返回数据")
	private T dataList;

	public T getDataList() {
		return dataList;
	}

	public void setDataList(T dataList) {
		this.dataList = dataList;
	}
}

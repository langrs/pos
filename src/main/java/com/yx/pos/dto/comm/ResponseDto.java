package com.yx.pos.dto.comm;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author LZM
 * @description
 * @date 11:56 2018/9/11
 * @mondified
 *
 **/
public class ResponseDto<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	//	错误代码
	@ApiModelProperty(value = "错误代码")
	private String errCode;
	//	错误信息
	@ApiModelProperty(value = "错误描述")
	private String errMsg;
	//	返回数据
	@ApiModelProperty(value = "返回数据")
	private T data;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

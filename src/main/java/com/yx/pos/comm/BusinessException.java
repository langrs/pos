package com.yx.pos.comm;

/**
 * @author LZM
 * @description
 * @date 17:07 2018/9/19
 * @mondified
 **/
public class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;

	private static final String ERRCODE = "201";
//	错误编号
	private String errCode;
//	错误信息
	private String errMsg;

	public BusinessException(){}

	public static BusinessException fail(String errMsg){
		BusinessException businessException = new BusinessException();
		businessException.setErrMsg(errMsg);
		businessException.setErrCode(ERRCODE);
		return businessException;
	}

	public static BusinessException fail(String errCode,String errMsg){
		BusinessException businessException = new BusinessException();
		businessException.setErrMsg(errMsg);
		businessException.setErrCode(errCode);
		return businessException;
	}


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


}

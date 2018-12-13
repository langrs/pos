package com.yx.pos.comm;

import com.yx.pos.dto.comm.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LZM
 * @description 全局异常处理类
 * @date 17:01 2018/9/19
 * @mondified
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	private static final String ERRCODE = "202";

	@ExceptionHandler(BusinessException.class)
	@ResponseBody
	ResponseDto handleException(BusinessException e){
		ResponseDto responseDto  = new ResponseDto();
//		失败统一返回201
		responseDto.setErrCode(e.getErrCode());
		responseDto.setErrMsg(e.getErrMsg());
		logger.error(e.getErrMsg());
		return responseDto;
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	ResponseDto handleException(Exception e){
		ResponseDto responseDto = new ResponseDto();
//		处理BusinessException外,系统抛出的异常都是返回202
		responseDto.setErrCode(ERRCODE);
		responseDto.setErrMsg(e.getMessage());
		logger.error(e.getMessage());
		return responseDto;
	}
}

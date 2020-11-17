package com.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月17日 下午2:19:49 
 * @version 1.0 
 * @parameter 
 * @since 统一异常处理
 * @return 
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	protected static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		logger.error("系统异常【全局异常】：" + e.getMessage(), e);
		return "error";
	}
}

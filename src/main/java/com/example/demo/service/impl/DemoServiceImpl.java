package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.DemoService;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月12日 上午11:48:55 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Service
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello from service layer";
	}
	
}

package com.wh.demo.impl;


import java.util.Date;

import javax.jws.WebService;

import com.wh.demo.interfaces.IHelloWorld;

/**
 * @author WH
 * 
 * 2018年3月18日
 */	
//指定webservice所实现的接口以及服务名称 
@WebService(endpointInterface="com.wh.demo.interfaces.IHelloWorld",serviceName="HelloWorldWs") 
public class HelloWords implements IHelloWorld {

	/* (non-Javadoc)
	 * @see com.wh.demo.interfaces.IHelloWorld#sayHi(java.lang.String)
	 */
	@Override
	public String sayHi(String name) {
		// TODO Auto-generated method stub
		return name+"你好,现在时间是:"+new Date();
	}
}

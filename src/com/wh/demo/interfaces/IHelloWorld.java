package com.wh.demo.interfaces;

import javax.jws.WebService;

/**
 * @author WH
 * 
 * 2018年3月18日
 */
@WebService
public interface IHelloWorld {
	String sayHi(String name);
}
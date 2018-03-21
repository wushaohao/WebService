package web;

import javax.xml.ws.Endpoint;

import com.wh.demo.impl.HelloWords;

/**
 * @author WH
 * 
 * 2018年3月18日
 */
public class ServiceMain {
	private static String ADDRESS = "http://127.0.0.1:8080/ws";
	public static void main(String[] args){
		HelloWords hello = new HelloWords();
		// 调用Endpoint的publish方法发布Web Service
		Endpoint.publish(ADDRESS, hello);
		System.out.println("地址暴漏成功!");
	}
}

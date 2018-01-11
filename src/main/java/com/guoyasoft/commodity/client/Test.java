package com.guoyasoft.commodity.client;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.guoyasoft.commodity.beans.C0001.request.Request;
import com.guoyasoft.commodity.beans.head.HEAD;

public class Test {
	public static void main(String[] args) throws Exception {
		HEAD head = new HEAD();
		head.setBusiCode("C0001");
		head.setRequestor("guoya");
		head.setSvcContent("测试数据");

		String xml=Test.java2xml(head);
		System.out.println(xml);
		
		Request request=new Request();
		request.setChannelId("A01");
		request.setChannelType("001");
		request.setCity("上海");
		
		xml=Test.java2xml(request);
		System.out.println(xml);
		
	

	}
	
	public static String java2xml(Object obj) throws Exception{
		String className = obj.getClass().getSimpleName();
		String java2xml = "<" + className + ">";
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field f : fields) {
			String fieldName = f.getName();
//			System.out.println("字段名：" + fieldName);
			String methodName = "get" + fieldName.substring(1, 2).toUpperCase()
					+ fieldName.substring(2);
			Method method = obj.getClass().getMethod(methodName);
			String fieldValue = (String) method.invoke(obj, null);
			java2xml += "<" + fieldName.substring(1) + ">" + fieldValue + "</" + fieldName.substring(1)
					+ ">";
		}
		java2xml += "</" + className + ">";
		return java2xml;
	}
}

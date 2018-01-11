package com.guoyasoft.commodity.client;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.guoyasoft.commodity.beans.C0001.request.CommoditItem;
import com.guoyasoft.commodity.beans.C0001.request.CommodityList;
import com.guoyasoft.commodity.beans.C0001.request.Request;
import com.guoyasoft.commodity.beans.C0001.response.Response;
import com.guoyasoft.commodity.beans.head.HEAD;

public class APIClient {
	public static void main(String[] args) {
		try {
			//String xml = "<HEAD><busiCode>C00001</busiCode><requestor>AIP</requestor><svcContent>包体内容</svcContent></HEAD>";
			
			HEAD head=new HEAD();
			head.setBusiCode("C0001");
			head.setRequestor("guoya");

			Request request=new Request();
			request.setOperatorId("guoyasoft");
			request.setChannelId("A01");
			request.setChannelType("1001");
			CommodityList commodityList=new CommodityList();
			CommoditItem item=new CommoditItem();
			item.setCommodityCode("100001");
			item.setCommodityType("001");
			commodityList.addCommoditItem(item);
			request.setCommodityList(commodityList);
			String reqStr=request.toXMLString();

			head.setSvcContent(reqStr);
			
			String xml=head.toXMLString();
			
			System.out.println("请求报文："+xml);
			String result = HttpClientTools.callHttpByStream(30000,
					"http://127.0.0.1:8081/APIServer/commodityServer", xml,
					"UTF-8");
			System.out.println("响应报文：" + result);
			StringReader reader=new StringReader(result);
			Response response=Response.unmarshal(reader);
			System.out.println("响应码："+response.getRespCode());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

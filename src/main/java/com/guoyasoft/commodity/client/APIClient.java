package com.guoyasoft.commodity.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.guoyasoft.commodity.beans.head.HEAD;

public class APIClient {
	public static String callHttpByStream(int timeOut, String urlLink,
			String xml, String encode) throws Exception {
		HttpURLConnection httpurlconnection = null;
		try {
			URL url = null;
			url = new URL(urlLink);
			httpurlconnection = (HttpURLConnection) url.openConnection();
			httpurlconnection.setRequestProperty("Content-type", "text/xml");
			httpurlconnection.setDoOutput(true);
			httpurlconnection.setDoInput(true);
			httpurlconnection.setRequestMethod("POST");
			httpurlconnection.setConnectTimeout(timeOut);
			httpurlconnection.setReadTimeout(timeOut);
			httpurlconnection.connect();
		} catch (Exception e) {
			throw e;
		}
		try {
			String SendData = xml;
			httpurlconnection.getOutputStream()
					.write(SendData.getBytes(encode));
			httpurlconnection.getOutputStream().flush();
			httpurlconnection.getOutputStream().close();
		} catch (Exception e) {
			e.getStackTrace();
			throw e;
		}
		try {
			String result = "";
			BufferedReader in = new BufferedReader(new InputStreamReader(
					httpurlconnection.getInputStream(), encode));
			String line;
			while ((line = in.readLine()) != null) {
				result += line;
			}
			in.close();
			return result;
		} catch (Exception e) {
			e.getStackTrace();
			throw e;
		} finally {
			if (httpurlconnection != null)
				httpurlconnection.disconnect();
		}
	}

	public static void main(String[] args) {
		try {

			//String xml = "<HEAD><busiCode>C00001</busiCode><requestor>AIP</requestor><svcContent>包体内容</svcContent></HEAD>";
			HEAD head=new HEAD();
			head.setBusiCode("C00011111111111111111111111111111111111113");
//			head.setRequestor("guoya");
			head.setSvcContent("测试数据");
			String xml=head.toXMLString();
			System.out.println("请求报文："+xml);
			String result = APIClient.callHttpByStream(30000,
					"http://127.0.0.1:8081/APIServer/commodityServer", xml,
					"UTF-8");
			System.out.println("响应报文：" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

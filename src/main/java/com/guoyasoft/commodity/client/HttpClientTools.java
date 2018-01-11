package com.guoyasoft.commodity.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientTools {
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
}

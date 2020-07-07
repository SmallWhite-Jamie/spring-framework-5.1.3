package com.spring5.mvc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * MyInterceptor
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/7/6 10:14
 */
public class MyInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(MyInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info("MyInterceptor,handler = {}", handler);
//		BufferedReader streamReader = new BufferedReader( new InputStreamReader(request.getInputStream(), "UTF-8"));
//		StringBuilder responseStrBuilder = new StringBuilder();
//		String inputStr;
//		while ((inputStr = streamReader.readLine()) != null)
//		responseStrBuilder.append(inputStr);
//		System.out.println(responseStrBuilder.toString());
		return true;
	}
}

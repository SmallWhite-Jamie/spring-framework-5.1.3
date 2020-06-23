package com.spring5.mvc.controller;

import com.spring5.mvc.converters.MyHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		// 在此处配置, 不加载默认的消息转换器
		// converters.add(new MyHttpMessageConverter());
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// 此处配置在默认消息转换器基础上添加新的转换器
		converters.add(new MyHttpMessageConverter());
	}
}
package com.springmvc.conf;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author lizheng
 * @date: 22:07 2019/08/30
 * @Description: AppConfig
 */
@Configuration
@ComponentScan("com.springmvc")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		converters.add(converter);
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {

	}

	/**
	 * 添加自定义spring mvc 参数解析器
	 */
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		UserArgumentResolver resolver = new UserArgumentResolver();
		resolvers.add(resolver);
	}

	/**
	 * 添加自定义的Converters和Formatters
	 * @param registry
	 */
	@Override
	public void addFormatters(FormatterRegistry registry) {
//		registry.addConverter();
	}
}

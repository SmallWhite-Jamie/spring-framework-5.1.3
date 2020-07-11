package com.spring5.mvc.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class TestFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(TestFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("TestFilter 初始化");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		logger.info("TestFilter doFilter, {}", request.getRemoteAddr());
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		logger.info("TestFilter destroy");
	}
}

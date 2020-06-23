package com.spring5.mvc.config;

import com.spring5.mvc.config.RootConfig;
import com.spring5.mvc.config.ServletConfig;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * WebApplicationInitializer
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/4 18:18
 */
public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected ApplicationContextInitializer<?>[] getRootApplicationContextInitializers() {
		return super.getRootApplicationContextInitializers();
	}

	@Override
	protected ApplicationContextInitializer<?>[] getServletApplicationContextInitializers() {
		return super.getServletApplicationContextInitializers();
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}

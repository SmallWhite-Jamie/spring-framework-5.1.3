package com.spring5.core.config;

import com.spring5.core.TestService;
import com.spring5.core.TestServiceB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AutowiredTestConf
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/11/10 17:12
 */
@Configuration
public class AutowiredTestConf {
	@Bean
	TestService testService() {
		return new TestService();
	}
	@Bean
	TestServiceB testServiceB() {
		return new TestServiceB();
	}
}

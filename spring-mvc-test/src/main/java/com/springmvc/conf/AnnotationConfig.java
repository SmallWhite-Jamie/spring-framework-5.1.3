package com.springmvc.conf;

import com.springmvc.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lizheng
 * @date: 21:57 2019/09/09
 * @Description: AnnotationConfig
 */
@Configuration
@ComponentScan("com.springmvc.component")
public class AnnotationConfig {

	@Bean
	UserInfo userInfo() {
		return new UserInfo();
	}
}

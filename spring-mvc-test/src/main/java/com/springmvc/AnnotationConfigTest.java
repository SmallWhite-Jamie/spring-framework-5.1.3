package com.springmvc;

import com.springmvc.component.TestService;
import com.springmvc.conf.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizheng
 * @date: 21:48 2019/09/09
 * @Description: AnnotationConfigTest
 */
public class AnnotationConfigTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		context.getBean(TestService.class).test();
	}
}

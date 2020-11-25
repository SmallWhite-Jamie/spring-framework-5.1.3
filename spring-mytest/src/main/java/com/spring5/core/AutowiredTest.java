package com.spring5.core;

import com.spring5.core.config.AutowiredTestConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AutowiredTest
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/11/10 17:11
 */
public class AutowiredTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AutowiredTestConf.class);
		context.refresh();
		TestService bean = context.getBean(TestService.class);
		bean.test();
	}

}

package com.spring5.core;

import com.spring5.core.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizheng
 * @date: 1:12 2018/12/16
 * @Description: Test
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(TestConfig.class);
		context.refresh();
//		Stu bean = context.getBean(Stu.class);
//		Stu bean2 = context.getBean(Stu.class);
//		System.out.println(bean == bean2);
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
		// com.spring5.core.bean.Teacher
//		Object myFactoryBean = context.getBean("myFactoryBean");
		// com.spring5.core.config.MyFactoryBean
		Object myFactoryBean = context.getBean("&myFactoryBean");

		System.out.println(myFactoryBean.getClass().getName());

	}
}

package com.cpspringmybatis;

import com.cpspringmybatis.conf.AppConfig;
import com.cpspringmybatis.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizheng
 * @date: 16:38 2019/04/05
 * @Description: CPTest
 */
public class CPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		UserService userService = context.getBean(UserService.class);
		userService.query();
		userService.query("1");
	}
}

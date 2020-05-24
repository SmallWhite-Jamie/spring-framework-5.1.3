package com.spring5.core.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author lizheng
 * @date: 0:33 2018/12/17
 * @Description: Person
 */
public class Person implements ApplicationContextAware {

	public Person() {
		System.out.println("person constroctor------------------");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("applicationContext------------------");
		System.out.println(applicationContext.getApplicationName());
	}
}

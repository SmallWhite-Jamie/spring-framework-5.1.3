package com.spring5.core.bean;

import org.springframework.stereotype.Component;

/**
 * @author lizheng
 * @date: 13:07 2018/12/17
 * @Description: Teacher
 */
@Component
public class Teacher {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

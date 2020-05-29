package com.spring5.core.bean;

import org.springframework.stereotype.Component;

/**
 * @author lizheng
 * @date: 1:25 2018/12/16
 * @Description: Stu
 */
@Component
public class Stu {
	private String name;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("-----------set name " + name);
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Stu{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				'}';
	}
}

package com.spring5.core.config;

import com.spring5.core.bean.Teacher;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lizheng
 * @date: 13:06 2018/12/17
 * @Description: MyFactoryBean
 */
public class MyFactoryBean implements FactoryBean<Teacher> {
	@Override
	public Teacher getObject() throws Exception {

		return new Teacher();
	}

	@Override
	public Class<?> getObjectType() {
		return Teacher.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}

package com.cpspringmybatis.conf;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lizheng
 * @date: 17:12 2019/04/05
 * @Description: MyInvocationHandler
 */
public class MyInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getDeclaredAnnotation(Select.class).value()[0]);
		return null;
	}
}

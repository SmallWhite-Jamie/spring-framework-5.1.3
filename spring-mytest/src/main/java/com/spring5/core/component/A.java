package com.spring5.core.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/24 8:15
 */
@Component
public class A {

	@Autowired
	private B b;

	public A() {
		System.out.println("创建A对象");
	}

	public B getB() {
		return b;
	}
}

package com.spring5.core.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * B
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/24 8:15
 */
@Component
public class B {
	@Autowired
	private A a;

	public B() {
		System.out.println("创建B对象");
	}
	public A getA() {
		return a;
	}
}

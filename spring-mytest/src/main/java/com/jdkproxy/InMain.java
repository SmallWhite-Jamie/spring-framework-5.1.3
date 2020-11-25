package com.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * InMain
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/11/25 16:52
 */
public class InMain {
	public static void main(String[] args) {
		XMapper o = (XMapper) Proxy.newProxyInstance(InMain.class.getClassLoader(), new Class[]{XMapper.class}, new MyInvocationHandler());
		System.out.println(Proxy.isProxyClass(o.getClass()));
		o.test();
	}
}

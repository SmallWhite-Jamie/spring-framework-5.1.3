package com.spring5.core.bean;

/**
 * @author lizheng
 * @date: 10:39 2018/12/23
 * @Description: Calculation
 */
public class Calculation {

	public Calculation() {
		System.out.println("创建计算器");
	}

	public Integer dev(int a, int b) {
		System.out.println("dev: result = " + a / b);
		return a / b;
	}
}

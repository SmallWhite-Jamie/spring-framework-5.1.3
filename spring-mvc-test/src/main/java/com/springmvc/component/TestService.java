package com.springmvc.component;

import org.springframework.context.TestServiceI;
import org.springframework.stereotype.Component;

/**
 * @author lizheng
 * @date: 21:58 2019/09/09
 * @Description: TestService
 */
@Component
public class TestService implements TestServiceI {

	private TestC testC;

	public TestService(TestC testC) {
		this.testC = testC;
	}

	@Override
	public void test() {
		System.out.println(testC);
	}
}

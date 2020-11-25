package com.spring5.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizheng
 * @date: 13:33 2018/12/16
 * @Description: TestController
 */
@Service
public class TestService {

	@Autowired
	private TestServiceB testServiceB;

	@Autowired
	private TestService testService;

	public void test() {
		System.out.println("test testServiceB: " + testServiceB);
		testService.test2();
	}

	private void test2() {
		System.out.println("test2 testServiceB: " + testServiceB);
	}

}

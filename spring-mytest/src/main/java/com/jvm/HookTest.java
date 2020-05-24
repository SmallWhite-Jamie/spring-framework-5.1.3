package com.jvm;

/**
 * @author lizheng
 * @date: 9:51 2019/07/13
 * @Description: HookTest
 */
public class HookTest {
	public void start() {
		Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("add shutdown hook...")));
	}
	public static void main(String[] args) {
		HookTest test = new HookTest();
		test.start();
		System.out.println("application start success");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

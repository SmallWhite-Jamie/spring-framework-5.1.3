package com.springmvc;

/**
 * @author lizheng
 * @date: 14:57 2019/09/04
 * @Description: Test
 */
public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		int a = 10;
		t.test(a);
		System.out.println("a" + a);
	}

	private void test(int a) {
		a = a + 10;
	}


}

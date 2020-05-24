package com.idgenerator;

/**
 * @author lizheng
 * @date: 17:03 2019/07/21
 * @Description: Demo
 */
public class Demo {
	public static void main(String[] args) {
		long workerIdBits = 5L;
		System.out.println(-1L ^ (-1L << workerIdBits));
		System.out.println( -1L ^ -1L << workerIdBits);
	}
}

package com.demo;


import org.springframework.util.Base64Utils;

/**
 * @author lizheng
 * @date: 10:40 2019/05/27
 * @Description: Baes64
 */
public class Baes64 {
	public static void main(String[] args) {
		System.out.println(new String(Base64Utils.decodeFromString("dXVfMzEwMTA4MTk4MzA0MjUwNTE1")));
	}
}

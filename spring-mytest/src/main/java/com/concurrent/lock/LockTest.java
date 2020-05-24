package com.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lizheng
 * @date: 21:31 2019/10/23
 * @Description: LockTest
 */
public class LockTest {
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
	}
}

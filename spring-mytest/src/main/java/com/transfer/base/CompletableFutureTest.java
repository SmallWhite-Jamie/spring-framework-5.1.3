package com.transfer.base;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * CompletableFutureTest
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/7/2 16:07
 */
public class CompletableFutureTest {
	public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//		Callable<String> callable = () -> {
//			System.out.println("开始执行");
//			Thread.sleep(2000);
//			return "Return some result";
//		};
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		Future<String> future = executorService.submit(callable);
//		while(!future.isDone()) {
//			System.out.println("Task is still not done...");
//			Thread.sleep(200);
//		}

//		System.out.println(future.get(1, TimeUnit.SECONDS));
//		executorService.shutdown();
		CompletableFuture<String> one = CompletableFuture.supplyAsync(() -> queryCode("第一阶段"));
//		System.out.println(one.get());
		// 串行执行第二个任务
		CompletableFuture<Double> two = one.thenApplyAsync(CompletableFutureTest::fetchPrice);
		two.thenAccept(System.out::println);
		// 并行执行第二个任务

		Thread.sleep(10000);
	}
	static String queryCode(String name) {
		try {
			System.out.println("开始执行第一个任务");
			Thread.sleep(1000);
			System.out.println("第一个任务结束");
		} catch (InterruptedException e) {
		}
		return "601857";
	}

	static Double fetchPrice(String code) {
		try {
			System.out.println("开始执行第二个任务");
			Thread.sleep(2000);
			System.out.println("第二个任务结束");
		} catch (InterruptedException e) {
		}
		return 5 + Math.random() * 20;
	}
}

package com.spring5.core.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * TestListener
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/3 8:37
 */
@Component
public class TestAsyncListener implements ApplicationListener<TestEvent> {
	@Override
	@Async
	public void onApplicationEvent(TestEvent event) {
		System.out.println(Thread.currentThread().getName()+" TestAsyncListener 接受到 "+event.getSource());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("异步任务结束");
	}
}

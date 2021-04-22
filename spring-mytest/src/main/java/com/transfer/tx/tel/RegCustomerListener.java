package com.transfer.tx.tel;

import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.concurrent.TimeUnit;

/**
 * RegCustomerListener
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2021/4/21 下午7:34
 */
public class RegCustomerListener {

	@TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
	public void hanldeRegCustomerEvent(RegCustomerEvent event) {
		System.out.println("---Listener------start");
		System.out.println(event.getSource().toString());
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----Listener-----end");
	}
}

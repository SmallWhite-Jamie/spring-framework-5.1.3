package com.transfer.tx;

import com.transfer.tx.config.ConfigTx;
import com.transfer.tx.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizheng
 * @date: 23:57 2019/01/05
 * @Description: SpringTxTest
 */
public class SpringTxTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigTx.class);
        context.refresh();
//		DemoService bean = context.getBean(DemoService.class);
//		bean.test();
//		bean.test3();
		IUserService userService = context.getBean(IUserService.class);
        int insert = userService.insert("zs", "456");
        System.out.println(insert);

//		new Thread(() -> {
//			userService.isolationSelectAndUpdate();
//		}).start();

//		userService.isolationInsert();
//		userService.repeatableRead();
//		try {
//			TimeUnit.SECONDS.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

//		new Thread(() -> {
//			userService.repeatableReadInsertR();
//		}).start();
//
//		userService.repeatableReadInsertW();

//		new Thread(() -> {
//			userService.gapLockR();
//		}).start();
//
//		userService.gapLockW();
//
//		try {
//			TimeUnit.SECONDS.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		context.close();

    }
}

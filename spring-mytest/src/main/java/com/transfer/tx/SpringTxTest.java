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

		IUserService userService = context.getBean(IUserService.class);
        int insert = userService.insert("zs", "456");
        System.out.println(insert);
        context.close();
    }
}

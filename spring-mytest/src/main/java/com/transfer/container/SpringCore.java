package com.transfer.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lizheng
 * @date: 21:41 2019/02/25
 * @Description: SpringCore
 */
public class SpringCore {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        System.out.println(context.getBean(Spring.class));
    }
}

package com.spring5.core;

import com.spring5.core.bean.Calculation;
import com.spring5.core.config.AopConfig;
import com.spring5.core.config.AopConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizheng
 * @date: 10:52 2018/12/23
 * @Description: AopTest
 */
public class AopTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class, AopConfig2.class);
		Calculation cacul = context.getBean(Calculation.class);
		cacul.dev(10, 2);
		context.close();
	}
}

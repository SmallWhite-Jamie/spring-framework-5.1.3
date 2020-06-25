package com.spring5.core;

import com.spring5.core.component.A;
import com.spring5.core.component.B;
import com.spring5.core.config.CircularReferencesConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * CircularReferencesMain
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/24 8:20
 */
public class CircularReferencesTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CircularReferencesConfig.class);
		System.out.println(context.getBean(A.class));
		System.out.println(context.getBean(B.class));
	}
}

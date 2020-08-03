package com.spring5.core.config;

import com.spring5.core.bean.Stu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * AConfig
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/8/3 18:09
 */
public class AConfig {

	static class E {
		public E() {
			System.out.println("E----------------------------------------------------");
		}
	}

	@Bean()
	public E e() {
		return new E();
	}
}

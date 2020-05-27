package com.spring5.core.config;

import com.spring5.core.aop.CalculationLogs;
import com.spring5.core.bean.Calculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.AliasFor;

/**
 * @author lizheng
 * @date: 10:38 2018/12/23
 * @Description: AopConfig
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

	@Bean({"calculationA", "calculationB", "calculationC"})
	public Calculation calculation() {
		return new Calculation();
	}

	@Bean
	public CalculationLogs calculationLogs() {
		return new CalculationLogs();
	}

}

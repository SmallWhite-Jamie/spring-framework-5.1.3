package com.spring5.core.config;

import com.spring5.core.aop.CalculationLogs;
import com.spring5.core.bean.Calculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author lizheng
 * @date: 10:38 2018/12/23
 * @Description: AopConfig
 */
@Configuration
@EnableAspectJAutoProxy
@EnableAsync // 注入 AsyncAnnotationBeanPostProcessor 解析 @Async 注解
@ComponentScan({"com.spring5.core.bean", "com.spring5.core.beanpostprocessors", "com.spring5.core.event"})
public class AopConfig {

	@Bean
	public ThreadPoolTaskExecutor taskExecutorBuilder() {
		ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
		threadPoolTaskExecutor.setThreadGroupName("Async-Task");
		threadPoolTaskExecutor.setThreadNamePrefix("Async-Task-");
		threadPoolTaskExecutor.setCorePoolSize(5);
		threadPoolTaskExecutor.setMaxPoolSize(10);
		threadPoolTaskExecutor.setKeepAliveSeconds(60);
		threadPoolTaskExecutor.setQueueCapacity(500);
		return threadPoolTaskExecutor;
	}


	@Bean({"calculationA", "calculationB", "calculationC"})
	public Calculation calculation() {
		return new Calculation();
	}

	@Bean
	public CalculationLogs calculationLogs() {
		return new CalculationLogs();
	}

}

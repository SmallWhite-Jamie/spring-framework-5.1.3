package com.transfer.tx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author lizheng
 * @date: 10:41 2018/12/23
 * @Description: CalculationLogs
 */
@Aspect
@Component
public class AopDemo {

	private static final Logger logger = LoggerFactory.getLogger(AopDemo.class);

	public AopDemo() {
		logger.info("创建 AopDemo 切面");
	}

	@Pointcut(value="execution(* com.transfer.tx.DemoService.*(..))")
	public void pointcut() {}

	@Before("pointcut()")
	public void before(JoinPoint point) {
		logger.info("Before--- ");
	}

	@After("pointcut()")
	public void after() {
		logger.info("After--- ");
	}
}

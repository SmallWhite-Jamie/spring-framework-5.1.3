package com.spring5.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Arrays;

/**
 * @author lizheng
 * @date: 10:41 2018/12/23
 * @Description: CalculationLogs
 */
@Aspect
public class CalculationLogs {

	public CalculationLogs() {
		System.out.println("创建计算器切面");
	}

	@Pointcut(value="execution(* com.spring5.core.bean.Calculation.*(..))")
	public void pointcut() {}

	@Before("pointcut()")
	public void before(JoinPoint point) {
		System.out.println("开始计算了: args = "+ Arrays.asList(point.getArgs()));
	}

	@After("pointcut()")
	public void after() {
		System.out.println("开始计算完了");
	}

	@AfterReturning(value = "pointcut()", returning = "returning")
	public void afterReturning(Object returning) {
		System.out.println("结算结果：" + returning);
	}

	@AfterThrowing("pointcut()")
	public void exception() {
		System.out.println("异常了");
	}

}

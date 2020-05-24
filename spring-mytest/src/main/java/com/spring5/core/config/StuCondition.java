package com.spring5.core.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author lizheng
 * @date: 0:12 2018/12/17
 * @Description: StuCondition
 */
public class StuCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		BeanDefinitionRegistry registry = context.getRegistry();
		return !registry.containsBeanDefinition("student");
	}
}

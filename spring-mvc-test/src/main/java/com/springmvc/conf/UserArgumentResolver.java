package com.springmvc.conf;

import com.springmvc.UserInfo;
import com.springmvc.enums.UserInfoAnno;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Date;

/**
 * @author lizheng
 * @date: 14:35 2019/09/04
 * @Description: UserArgumentResolver 自定义参数解析器
 */
public class UserArgumentResolver implements HandlerMethodArgumentResolver {

	private static final Log log = LogFactory.getLog(UserArgumentResolver.class);

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		if (!parameter.hasParameterAnnotation(UserInfoAnno.class)) {
			return false;
		}
		return UserInfo.class.isAssignableFrom(parameter.getParameterType());
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		UserInfo userInfo = new UserInfo("test", new Date());
		log.info("User info: " + userInfo.toString());
		return userInfo;
	}
}

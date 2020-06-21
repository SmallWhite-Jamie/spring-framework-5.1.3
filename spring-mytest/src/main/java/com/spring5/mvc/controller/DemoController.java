package com.spring5.mvc.controller;

import com.spring5.core.bean.Teacher;
import com.spring5.mvc.converters.MyHttpMessageConverter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * DemoController
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/4 18:32
 */
@Controller
public class DemoController {

	private static final Log log = LogFactory.getLog(DemoController.class);

	@RequestMapping("demo")
	public Teacher demo() {
		Teacher teacher = new Teacher();

		return teacher;
	}

	@RequestMapping("requestToViewNameTranslator")
	public void requestToViewNameTranslator() {
		System.out.println("requestToViewNameTranslator");
	}

	@RequestMapping("httpMessageConverter")
	public MyHttpMessageConverter.MyClass httpMessageConverter() {
		MyHttpMessageConverter.MyClass myClass = new MyHttpMessageConverter.MyClass();
		return myClass;
	}


}

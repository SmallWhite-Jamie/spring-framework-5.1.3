package com.spring5.mvc.controller;

import com.spring5.core.bean.Teacher;
import com.spring5.mvc.converters.MyHttpMessageConverter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/4 18:32
 */
@RestController
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

	@RequestMapping(value = "httpMessageConverter")
	public MyHttpMessageConverter.MyClass httpMessageConverter(@RequestBody MyHttpMessageConverter.MyClass myClass) {
		System.out.println(myClass);
		return myClass;
	}


}

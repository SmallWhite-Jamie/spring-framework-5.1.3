package com.spring5.mvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
	public String demo() {
		log.info("demo----");
		log.info("demo----");
		log.info("demo----");
		log.info("demo----");
		log.debug("demo----");
		log.warn("demo----");
		log.error("demo----");

		return "demo";
	}

	@RequestMapping("requestToViewNameTranslator")
	public void requestToViewNameTranslator() {
		System.out.println("requestToViewNameTranslator");
	}

}

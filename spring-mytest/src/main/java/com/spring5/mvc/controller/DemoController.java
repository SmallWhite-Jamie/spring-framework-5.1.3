package com.spring5.mvc.controller;

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
	@RequestMapping("demo")
	public String demo() {
		return "demo";
	}
}

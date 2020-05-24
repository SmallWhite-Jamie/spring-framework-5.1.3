package com.springmvc.controller;

import com.springmvc.UserInfo;
import com.springmvc.enums.UserInfoAnno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizheng
 * @date: 10:29 2019/08/31
 * @Description: TestController
 */
@RestController
public class TestController {

	@RequestMapping("index")
	public String index() {
		System.out.println("index");
		return "index";
	}

	@RequestMapping("json")
	public Map<String, String> json() {
		Map<String, String> map = new HashMap<>();
		map.put("A", "a");
		System.out.println(map);
		return map;
	}

	@RequestMapping("user")
	public UserInfo userInfo(@UserInfoAnno UserInfo userInfo) {
		return userInfo;
	}

}

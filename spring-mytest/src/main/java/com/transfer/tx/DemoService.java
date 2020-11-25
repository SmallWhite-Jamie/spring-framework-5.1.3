package com.transfer.tx;


import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {

	@Autowired
	private DemoService demoService;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test() {
		System.out.println(this);
		System.out.println(AopContext.currentProxy());
		System.out.println("没有借口的方法");
		this.test2();
	}

	@Transactional
	public void test2() {
		System.out.println("private " + jdbcTemplate);
//		jdbcTemplate.update(null);
	}

	public void test3() {
//		System.out.println("test3 " + jdbcTemplate);
//		DemoService a = this;
//		a.test2();
//		demoService.test2();
	}



}

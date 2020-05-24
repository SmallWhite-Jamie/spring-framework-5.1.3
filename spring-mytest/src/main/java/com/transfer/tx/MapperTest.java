package com.transfer.tx;

import com.transfer.tx.config.ConfigTx;
import com.transfer.tx.mapper.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lizheng
 * @date: 17:13 2019/03/31
 * @Description: MapperTest
 */
public class MapperTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigTx.class);
		UserMapper userMapper = context.getBean(UserMapper.class);
		System.out.println(userMapper.getUser("1"));
	}
}

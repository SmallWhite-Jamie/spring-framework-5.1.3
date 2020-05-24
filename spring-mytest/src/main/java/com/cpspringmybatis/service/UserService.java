package com.cpspringmybatis.service;

import com.cpspringmybatis.mapper.OrderMapper;
import com.cpspringmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lizheng
 * @date: 16:41 2019/04/05
 * @Description: UserService
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
	@Autowired
	private OrderMapper orderMapper;
    public void query() {
        userMapper.query();
	}
	public void query(String id) {
		userMapper.getUser(id);
		orderMapper.query();
	}
}

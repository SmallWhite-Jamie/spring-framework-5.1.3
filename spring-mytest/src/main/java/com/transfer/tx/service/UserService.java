package com.transfer.tx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lizheng
 * @date: 0:00 2019/01/06
 * @Description: UserService
 */
@Service
public class UserService implements IUserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private JdbcTemplate template;

    @Autowired
    private IUserService2 userService2;

    @Transactional(rollbackFor = Exception.class)
    public int insert(String username, String password) {
		logger.info("插入数据 username={},password={}", username, password);
        template.update("insert into users (username, password) values (?,?)", username, password);
        // 内部调用不走事务
		this.insert2(103, "insert2", "123456");
		userService2.insert2(125, "test", "789");
        return 1;
    }

	public int insert2(int id, String username, String password) {
		template.update("insert into users (id, username, password) values (?,?,?)", id, username, password);
		return 1;
	}

}

package com.transfer.tx.service;

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
public class UserService {
    @Autowired
    private JdbcTemplate template;

    @Transactional(rollbackFor = Exception.class)
    public int insert(int id, String username, String password) {
        template.update("insert into users (id, username, password) values (?,?,?)", id, username, password);
        return 1;
    }


	public int insert2(int id, String username, String password) {
		template.update("insert into users (id, username, password) values (?,?,?)", id, username, password);
		return 1;
	}

}

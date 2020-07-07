package com.transfer.tx.service;

import org.springframework.transaction.annotation.Transactional;

public interface IUserService {
	int insert(String username, String password);

	@Transactional(rollbackFor = Exception.class)
	int insert2(int id, String username, String password);
}

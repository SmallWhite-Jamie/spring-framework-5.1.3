package com.transfer.tx.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

public interface IUserService {
	int insert(String username, String password);

	@Transactional(rollbackFor = Exception.class)
	int insert2(int id, String username, String password);


	@Transactional(rollbackFor = Exception.class)
	int isolationInsert();

//	@Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_UNCOMMITTED)
//	@Transactional(rollbackFor = Exception.class, isolation = Isolation.SERIALIZABLE)
	int isolationSelectAndUpdate();

	@Transactional
	int repeatableRead();

	@Transactional
	int repeatableReadUpdate();

	@Transactional(isolation = Isolation.READ_COMMITTED)
	int repeatableReadInsertR();

	@Transactional
	int repeatableReadInsertW();


	@Transactional(isolation = Isolation.REPEATABLE_READ)
	void gapLockR();

	@Transactional(isolation = Isolation.REPEATABLE_READ)
	void gapLockW();



}

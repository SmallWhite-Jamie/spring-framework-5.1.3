package com.transfer.tx.service;

import com.transfer.tx.tel.Data;
import com.transfer.tx.tel.RegCustomerEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author lizheng
 * @date: 0:00 2019/01/06
 * @Description: UserService
 */
@Service
public class UserService implements IUserService, ApplicationContextAware {
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

	@Override
	public int insert2(int id, String username, String password) {
		System.out.println("biz start");
		template.update("insert into users (id, username, password) values (?,?,?)", id, username, password);
		Data data = new Data();
		data.setText("ceshi");
		applicationContext.publishEvent(new RegCustomerEvent(data));
		System.out.println("biz end");
		return 1;
	}

	@Override
	public int isolationInsert() {
		System.out.println("处理插入业务");
		template.update("insert into users (id, username, password) values (?,?,?)", "99", "isolationInsert", "456");
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("业务处理结束");
		return 0;
	}

	@Override
	public int isolationSelectAndUpdate() {
		System.out.println("开始执行查询睡眠");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("睡眠结束开始查询");
		Map<String, Object> stringObjectMap = template.queryForMap("select * from users where id = ? for update", "99");
		System.out.println(stringObjectMap);
		int update = template.update("update users set username = ? where id = ?", "456841asdas", "99");
		System.out.println(update);
		return 99;
	}

	@Override
	public int repeatableRead() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String, Object> stringObjectMap = template.queryForMap("select * from users where id = ?", "99");
		System.out.println("一次读取结果："+stringObjectMap);
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String, Object> stringObjectMap2 = template.queryForMap("select * from users where id = ?", "99");
		System.out.println("二次读取结果："+stringObjectMap2);

		return 0;
	}

	@Override
	public int repeatableReadUpdate() {
		System.out.println("第一次更新");
		template.update("update users set username = ? where id = ?", "repeatableReadUpdate", "99");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("第二次更新");
		template.update("update users set username = ? where id = ?", "222222", "99");
		return 0;
	}

	@Override
	public int repeatableReadInsertR() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String, Object> stringObjectMap = template.queryForMap("select * from users where id = ?", "99");
		System.out.println("一次读取结果："+stringObjectMap);
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String, Object> stringObjectMap2 = template.queryForMap("select * from users where id = ?", "99");
		System.out.println("一次读取结果："+stringObjectMap2);
		if (stringObjectMap2.get("username").equals("123")) {
			template.update("insert into users (id, username, password) values (?,?,?)", "100", "100", "456");
		} else {
			System.out.println("结果被修改");
		}

		return 0;
	}

	@Override
	public int repeatableReadInsertW() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("第二次更新");
		template.update("update users set username = ? where id = ?", "222222", "99");
		template.update("insert into users (id, username, password) values (?,?,?)", "100", "100", "456");
		return 0;
	}

	@Override
	public void gapLockR() {
		List<Map<String, Object>> maps = template.queryForList("select * from users where username = ? for update ", "100");
		System.out.println("间隙锁测试R--："+maps);
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("间隙锁测试R结束--");
	}

	@Override
	public void gapLockW() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("间隙锁测试W开始");
		template.update("insert into users (username, password) values (?,?)", "100", "456");
		System.out.println("间隙锁测试W结束");
	}

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}

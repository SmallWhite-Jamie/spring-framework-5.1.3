package com.springmvc;

import java.util.Date;

/**
 * @author lizheng
 * @date: 14:56 2019/09/04
 * @Description: UserInfo
 */
public class UserInfo {
	private String username;
	private Date date;

	public UserInfo(String username, Date date) {
		this.username = username;
		this.date = date;
	}

	public UserInfo() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"username='" + username + '\'' +
				", date=" + date.getTime() +
				'}';
	}
}

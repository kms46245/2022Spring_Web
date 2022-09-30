package com.my.spring.web.ch05.ex02.dao.map;

import java.util.List;

import com.my.spring.web.ch05.domain.User;

public interface UserMap {
	List<User> selectUsers();
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int userId);
}
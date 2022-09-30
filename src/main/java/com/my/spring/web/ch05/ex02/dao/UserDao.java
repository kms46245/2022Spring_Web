package com.my.spring.web.ch05.ex02.dao;

import java.util.List;

import com.my.spring.web.ch05.domain.User;

public interface UserDao {
	List<User> selectUsers();
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int userId);
}

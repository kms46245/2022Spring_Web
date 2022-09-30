package com.my.spring.web.ch05.ex02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring.web.ch05.domain.User;
import com.my.spring.web.ch05.ex02.dao.UserDao;

@Repository("ch05.ex02.userDao")
public class UserServiceImpl implements UserService{
	@Autowired private UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.selectUsers();
	}

	@Override
	public void addUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public void fixUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void delUser(int userId) {
		userDao.deleteUser(userId);
	}
}

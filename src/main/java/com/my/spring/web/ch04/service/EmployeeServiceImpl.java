package com.my.spring.web.ch04.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.spring.web.ch04.dao.EmployeeDao;
import com.my.spring.web.ch04.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired private EmployeeDao employeeDao;
	
	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.selectEmployee(employeeId);
	}
}

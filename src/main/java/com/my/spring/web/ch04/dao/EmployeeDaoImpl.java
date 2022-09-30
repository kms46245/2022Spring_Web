package com.my.spring.web.ch04.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.spring.web.ch04.dao.map.EmployeeMap;
import com.my.spring.web.ch04.domain.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired private EmployeeMap employeeMap;
	
	@Override
	public Employee selectEmployee(int EmployeeId) {
		return employeeMap.selectEmployee(EmployeeId);
	}
}

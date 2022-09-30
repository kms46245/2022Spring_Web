package com.my.spring.web.ch04.dao;

import com.my.spring.web.ch04.domain.Employee;

public interface EmployeeDao {
	Employee selectEmployee(int employeeId);
}

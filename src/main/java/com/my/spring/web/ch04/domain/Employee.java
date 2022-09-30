package com.my.spring.web.ch04.domain;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class Employee {
	private int employeeId;
	private String lastName;
	private LocalDate hireDate;
}

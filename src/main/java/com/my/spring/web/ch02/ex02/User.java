package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
}

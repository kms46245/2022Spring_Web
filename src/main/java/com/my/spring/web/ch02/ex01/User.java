package com.my.spring.web.ch02.ex01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //setter, getter를 한번에 만드는 어노테이션
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private String userName;
	private int age;
}

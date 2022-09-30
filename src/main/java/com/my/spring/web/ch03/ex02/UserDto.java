package com.my.spring.web.ch03.ex02;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserDto {
	private String userName;
	private int age;
	private MultipartFile face;	// client와 연결하는 용도 <-> user의 DB와 연결하는 용도
}

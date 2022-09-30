package com.my.spring.web.ch05.domain;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String userName;
	@DateTimeFormat(pattern="yyyy-MM-dd")	// localDate타입으로 parsing할때 쓰는용도
	@JsonFormat(pattern="yyyy-MM-dd", timezone="Asia/Seoul")	// localDate타입을 json타입으로 parsing할때 쓰는 용도
	private LocalDate birthday;
}

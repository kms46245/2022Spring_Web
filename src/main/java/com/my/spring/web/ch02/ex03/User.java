package com.my.spring.web.ch02.ex03;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
	private String userName;
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")	// 커맨더(여러데이터타입을 하나로 통합해 사용하는 것)로써 사용할 시, 데이터타입을 정확히 지정
	private LocalDate regDate;
}

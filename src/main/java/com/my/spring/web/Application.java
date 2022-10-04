package com.my.spring.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.my.spring.web.ch04.dao.map")
@MapperScan("com.my.spring.web.**.map")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

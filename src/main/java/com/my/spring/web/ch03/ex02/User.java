package com.my.spring.web.ch03.ex02;

import lombok.Data;

@Data
public class User {
	private String userName;
	private int age;
	private String faceFilename; //DB와 연결하는 용도 <-> userDto의 client와 연결하는 용도
}								 // 파일을 저장하는것이 아닌(효율이 떨어져서) 파일명을 저장한다.

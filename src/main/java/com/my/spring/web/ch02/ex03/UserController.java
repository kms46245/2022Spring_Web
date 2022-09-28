package com.my.spring.web.ch02.ex03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex03")
@RequestMapping("ch02/ex03/user")
public class UserController {
	@GetMapping
	public String userIn() {
		return "ch02/ex03/userIn";
	}
  
	@PostMapping
	public String userOut(User user) {
		return "ch02/ex03/userOut"; 
	}
	
	//1. 컨트롤러가 여러개있으면(viewcontroller, normal controller등)
	//   1차적으론 일반컨트롤러(해당 파일에있는 Mapping)을 먼저쓴다.
	//2. 없다면 뷰컨트롤러를 쓴다.
} 
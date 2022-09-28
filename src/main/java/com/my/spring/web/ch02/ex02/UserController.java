package com.my.spring.web.ch02.ex02;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("ch02.ex02")
@RequestMapping("ch02/ex02")
public class UserController {
	@GetMapping("userIn")
	public String userIn() {
		return "ch02/ex02/userIn";
	}
	
	/*
	 * @PostMapping("userOut") public String userOut(@RequestParam String userName,
	 * 
	 * @RequestParam int age,
	 * 
	 * @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate, Model
	 * model) { model.addAttribute("user", new User(userName, age, regDate)); return
	 * "ch02/ex02/userOut"; }
	 */
	
	// @requestparam은 기본값으로서, 이름의 매칭만 된다면 자동적용된다.
	@PostMapping("userOut")
	public String userOut(String userName,
							int age,
							@DateTimeFormat(pattern="yyyy-MM-dd") LocalDate regDate,
							Model model) {
		model.addAttribute("user", new User(userName, age, regDate));
		return "ch02/ex02/userOut";
	}
}

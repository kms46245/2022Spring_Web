package com.my.spring.web.ch02.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/home")
public class NumController {
	@GetMapping("numIn")
	public String numIn(){
		return "ch02/home/numIn";
	}
	
	@GetMapping("numOut")
	public String numOut(Number num) {
		return "ch02/home/numOut";
	}
}

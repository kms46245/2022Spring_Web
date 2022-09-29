package com.my.spring.web.ch02.ex05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ch02/ex05")
public class NavController {
	@GetMapping("forward")
	public String forward() {
		return "forward:target";	// 일반적인 스트링을 쓰면 view의 이름으로 읽어낸다.
	}								// 그러므로 앞에 forward:를 붙혀 타겟의 url임을 인지시킨다.
	
	@GetMapping("target")
	public String target() {
		return "ch02/ex05/target";
	}
	
	@GetMapping("redirect")
	public String redirect() {
		return "redirect:target";	// redirect도 마찬가지
	}
	
	//과제] 네이버 사이트로 갈수있도록 하는 핸들러를 구현하라.	
	@GetMapping("naver")
	public String redirectNaver() {
		return "redirect:http://www.naver.com";
	}
	}

package com.my.spring.web.ch02.ex04;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ch02/ex04")
public class CheckController {
	@GetMapping
	public String main() {
		return "ch02/ex04/main";
	}
	
	@GetMapping("choice")
	public String choice(int kind) {
		String view = "ch02/ex04/";
		
		switch(kind) {
		case 1: view += "radioIn"; break;
		case 2: view += "checkboxIn";
		}
		
		return view;
	}
	
	/*
	// 과제] 핸들러의 매핑 url 지정 / 폼으로부터 전달받은 파라미터를 받을수 있게 하라.
	@PostMapping("radio")
	public String radio(String agree, Model model) {
		model.addAttribute("agree", agree);		
		return "ch02/ex04/radioOut";
	}*/
	
	// 과제(였던것)] 파라미터를 하나만쓰고 동일한 효과를 내게 만들어라.
	@PostMapping("radio")
	public String radio(@ModelAttribute("agree") String agree) {
		return "ch02/ex04/radioOut";
	}
	
	// 과제] request parameter를 받도록 수정하라.
	/*
	 * @PostMapping("checkbox") public String checkbox(@RequestParam
	 * ArrayList<String> fruit) {
	 * 
	 * System.out.println(fruit); return "ch02/ex04/main"; }
	 */
	
	// 과제] 값이 checkOut에 넘어가도록 리팩터링하라.
	@PostMapping("checkbox")
	public String checkbox(@RequestParam("fruit") List<String> fruits, Model model) {
		model.addAttribute("fruits", fruits);
		return "ch02/ex04/checkboxOut";
	}	 
}
package com.my.spring.web.ch04.web;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.my.spring.web.ch04.service.TodayService;

@Controller
public class TodayController {
	@Autowired private TodayService todayService;
	
	@GetMapping("ch04/today")
	@ModelAttribute("today")
	public LocalDate today() {
		return todayService.getToday();
	}
}

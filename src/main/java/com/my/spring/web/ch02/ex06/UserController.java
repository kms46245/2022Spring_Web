package com.my.spring.web.ch02.ex06;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ch02.ex06")
@RequestMapping("ch02/ex06")
public class UserController {
	@GetMapping("login")				 // required를 통해 유무에 관련해 사용하는지 여부를 따진다.
	public String loginIn(@CookieValue(required=false) String userId, 	// @CookieValue - cookie값을 불러오는 annotation
			@ModelAttribute("user") UserDto user) {
		if (userId != null) user.setUserId(userId);
		
		return "ch02/ex06/login";
	}
	
	@PostMapping("login")									//@requestparam은 기본값이라 생략
	public String login(@ModelAttribute("user") UserDto user, String rememberMe, 
								HttpSession session, HttpServletResponse response) {	//로그인 여부를 알수있는 세션객체를 핸들러내에서도 사용가능하다.
		if(session.getAttribute("userId") == null)	// 로그인이 최초라면
			session.setAttribute("userId", user.getUserId());
		
		if(rememberMe != null && rememberMe.equals("on")) {
			Cookie cookie = new Cookie("userId", user.getUserId());
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		return "ch02/ex06/logout";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		// 과제] 로그인폼으로 되돌아가도록 만들어라.
		return "redirect:login";
	}
}

package com.my.spring.web.ch05.ex01;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.ch05.domain.User;

@RestController("ch05.ex01")			// Restful하게 만드는 controller (view도 가능하지만 json형태로도 리턴한다)
@RequestMapping("ch05/ex01")
public class UserController {
	@GetMapping("main")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("ch05/ex01/main");
		
		return mv;
	}
	
	@GetMapping("get")
	public User get(User user) {	// restcontroller가 json형식으로 보내주기때문에 그대로 받기만하면된다.
		return user;
	}
	
	@PostMapping("post")
					// 데이터를 받는 4번째 방법이 @RequestBody이다 나머지 3개는 ch04의 컨트롤러 참조
	public User post(@RequestBody User user) {
		return user;
	}
	
	@PutMapping("put")	// 수정에 해당하는 mapping
	public User put(@RequestBody User user) {
		return user;
	}
	
	@PatchMapping("patch")	// put과 같은 기능이지만 수정하는 분량에따라 많으면 put 적으면 patch이다.
	public User patch(@RequestBody User user) {
		return user;
	}
	
	@DeleteMapping("delete")	// 삭제에 해당하는 mapping
	public User delete(@RequestBody User user) {
		return user;
	}
}

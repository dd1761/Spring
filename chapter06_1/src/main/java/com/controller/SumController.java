package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {
	
	//@RequestMapping(value="/input.do", method=RequestMethod.GET)
	@GetMapping(value="/input.do")
	public String input() {
		
		return "sum/input"; 
		//만약 servlet-context에서 /WEB-INF/가 아니라 /WEB-INF 라면 sum앞에 /를 붙여야 한다.
		// /sum/input
	}
	
	//@RequestMapping(value="/result.do", method=RequestMethod.POST)
//	@PostMapping(value="/result.do")
//	public String result() {
//	
//		return "sum/result";
//	}
	
	@PostMapping(value="/result.do")
	public ModelAndView result(@RequestParam int x, @RequestParam int y) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("x", x);
		mav.addObject("y", y);
		mav.addObject("sum", x + y);
		mav.setViewName("sum/result");
		
		return mav;
	}
}

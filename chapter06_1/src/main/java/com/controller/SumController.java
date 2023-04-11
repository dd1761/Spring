package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {
	
	private int x, y;
	
	@RequestMapping(value="/input.do", method=RequestMethod.GET)
	public String Input() {
		
		return "sum/input"; 
		//만약 servlet-context에서 /WEB-INF/가 아니라 /WEB-INF 라면 sum앞에 /를 붙여야 한다.
		// /sum/input
	}
	
	@RequestMapping(value="/result.do", method=RequestMethod.GET)
	public ModelAndView Result() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("X + Y" , (x + y));
		
		mav.setViewName("/WEB-INF/sum/input");
		
		return mav;
	}
}

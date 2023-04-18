package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;

@Controller
public class SumController {
	
	//@RequestMapping(value="/input.do", method=RequestMethod.GET)
	@GetMapping(value="/input.do")
	public String input() {
		
		return "sum/input"; 
		//만약 servlet-context에서 /WEB-INF/가 아니라 /WEB-INF 라면 sum앞에 /를 붙여야 한다.
		// /sum/input
	}
	
//	@RequestMapping(value="/result.do", method=RequestMethod.POST)
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
		mav.setViewName("sum/result");
		
		return mav;
	}
											//데이터를 받아오는 과정에서 데이터를 못받아오면 400에러가 난다.
//	@PostMapping(value="/result.do")		//required는 400 에러를 방지하기 위해서 사용 
//	public ModelAndView result(@RequestParam(required = false, defaultValue = "0") String x,
//							   @RequestParam(required = false, defaultValue = "0") String y) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("x", x);
//		mav.addObject("y", y);
//		mav.setViewName("sum/result");
//		
//		return mav;
//	}
	
//	@PostMapping(value="/result.do")
//	public String result(@RequestParam Map<String, String> map, ModelMap modelMap) {
//		modelMap.put("x", map.get("x"));
//		modelMap.put("y", map.get("y"));
//		return "sum/result";
//	}
	
	@PostMapping(value="/result.do")
	public String result(@ModelAttribute SumDTO sumDTO, Model model) {
		model.addAttribute("x", sumDTO.getX());
		model.addAttribute("y", sumDTO.getY());
		return "sum/result";
	}
	
}

package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SungJukController {
	
	@GetMapping(value="/sungJuk/input.do")
	public String input() {
		
		return "sungJuk/input";
	}
	
	@PostMapping(value="/sungJuk/result.do")
	public String result(@RequestParam Map<String, String> map, ModelMap modelMap) {
		modelMap.put("name", map.get("name"));
		modelMap.put("kor", map.get("kor"));
		modelMap.put("eng", map.get("eng"));
		modelMap.put("math", map.get("math"));
		
		return "sungJuk/result";
	}
}

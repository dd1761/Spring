package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do", method=RequestMethod.GET)
	public ModelAndView hello() { //사용자 콜백 메소드
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("result", "Hello Spring !!"); //아래의 request와 같은 것.
		//request.setAttribute("result", "Hello Spring !!");
		//mav.setViewName("hello");	// 파일명 지정
		mav.setViewName("/view/hello"); // 폴더.파일명 지정
		//http://localhost:8080/chapter06/view/hello.jsp 호출 된다.
		return mav;
	}
	
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET)
	public ModelAndView hello2() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("result2", "Have a nice day!!");
		mav.setViewName("/WEB-INF/view2/hello2");
		//http://localhost:8080/chapter06/WEB-INF/view2/hello2.jsp 호출이 안된다.
		return mav;
	}
	
	@RequestMapping(value="/hello3.do", method=RequestMethod.GET)
	@ResponseBody
	public String hello3() {
		
		return "Welcome"; //파일명 Welcome.jsp 으로 인식한다.
	}
	//스프링에서는 return타입이 String 이면 자동으로 파일명으로 인식한다.
	//스프링은 Welcome.jsp 파일을 찾는다
	//만약 단순 문자열로 웹 브라우저에 나타내려면 @ResponseBody 를 사용해야한다.
}


/*

콜백 메소드
- 어떤 때가 되면 운영체제, 스프링에 의해서 호출되는 메소드

http://localhost:8080/Context명(Project명)/hello.do 요청

DispatcherServlet
		↕ HandlerMapping
HelloController.java


*/
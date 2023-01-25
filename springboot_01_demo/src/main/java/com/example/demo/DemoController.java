package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// http://localhost:8090/
// http://localhost:8090/hello.do

@Controller
public class DemoController {
	
	// return 값을 json 형태로 보내기위해 사용
	@ResponseBody
	@RequestMapping(value="/")
	public String home() {
		System.out.println("Hello Boot!!!");
		return "Hello Boot!!!";
	}
	
	// src\main\webapp\WEB-INF\views 폴더 생성
	
	@RequestMapping(value="/hello.do")
	public String hello(Model model) {
		System.out.println("model");
		model.addAttribute("message", "hello");
		return "hello";
	}
}

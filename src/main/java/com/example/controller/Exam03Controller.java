package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	@Autowired
	private ServletContext ap;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	@RequestMapping("/app")
	public String app(String price1,String price2,String price3) {
		
		Integer a = Integer.parseInt(price1);
		Integer b = Integer.parseInt(price2);
		Integer c = Integer.parseInt(price3);
		
		ap.setAttribute("total1", a+b+c);
		ap.setAttribute("total2", ((a+b+c)*1.01));
		return "exam03-result";
	}
	
	
}

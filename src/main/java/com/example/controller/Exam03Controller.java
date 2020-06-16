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
		ap.setAttribute("price1", price1);
		ap.setAttribute("price2", price2);
		ap.setAttribute("price3", price3);
		return "exam03-result";
	}
	
	
}

package com.example.controller;

import java.text.DecimalFormat;

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
	public String app(Integer price1,Integer price2,Integer price3) {
		
		ap.setAttribute("total1", price1+price2+price3);
		ap.setAttribute("total2", (price1+price2+price3)*1.10);
		
		return "exam03-result";
	}
	
}

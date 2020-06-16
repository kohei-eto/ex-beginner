package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam4")
public class Exam04Controller {
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	@RequestMapping("/output")
	public String output() {
		return "exam04-result";
	}

}

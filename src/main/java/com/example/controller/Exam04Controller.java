package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.UserForm;
import com.sun.xml.internal.org.jvnet.staxex.NamespaceContextEx.Binding;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/output")
	public String output(
			@Validated UserForm userForm
			,BindingResult result
			,Model model
			) {
		
		if(result.hasErrors()) {
			return "exam04";
		} 
		return "exam04-result";
		
		
	}
	
	

}

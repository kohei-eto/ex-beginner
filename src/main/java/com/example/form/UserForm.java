package com.example.form;

import javax.validation.constraints.NotBlank;

import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.istack.internal.NotNull;

public class UserForm {
	@NotBlank(message = "名前は必須です")
	private String name;
	@NotBlank(message = "年齢は必須です")
	private String age;
	@NotBlank(message = "コメントを入力してください")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}

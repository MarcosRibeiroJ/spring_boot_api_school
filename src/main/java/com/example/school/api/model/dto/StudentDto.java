package com.example.school.api.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class StudentDto {
	
	@NotBlank
	private String name;
	@Email
	private String email;
	
	public StudentDto() {
		
	}

	public StudentDto(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

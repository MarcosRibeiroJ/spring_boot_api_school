package com.example.school.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.api.model.entities.Student;
import com.example.school.api.model.repositories.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/show")
	public Iterable<Student> showStudents() {
		return studentRepository.findAll();
	}
	
	@PostMapping("/new")
	public @ResponseBody Student insertStudent(@Valid Student student) {
		studentRepository.save(student);
		return student;
	}

}
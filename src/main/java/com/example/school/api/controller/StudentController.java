package com.example.school.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.api.model.dto.StudentDto;
import com.example.school.api.model.entities.Student;
import com.example.school.api.model.repositories.StudentRepository;
import com.example.school.api.model.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/show")
	public Iterable<Student> showStudents() {
		return studentRepository.findAll();
	}
	
	@PostMapping("/new")
	public void insertStudent(@Valid @RequestBody StudentDto studentDto) {
		studentService.insertStudent(studentDto);
	}

}
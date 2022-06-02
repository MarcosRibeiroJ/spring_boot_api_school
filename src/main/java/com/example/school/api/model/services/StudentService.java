package com.example.school.api.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.api.model.dto.StudentDto;
import com.example.school.api.model.entities.Student;
import com.example.school.api.model.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public void insertStudent(StudentDto studentDto) {
		Student student = new Student();
		student.setName(studentDto.getName());
		student.setEmail(studentDto.getEmail());
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		if(!studentRepository.findById(student.getId()).isEmpty()) {
			studentRepository.save(student);
		}
	}
	
	public void deleteStudent(Student student) {
		if(!studentRepository.findById(student.getId()).isEmpty()) {
			studentRepository.delete(student);
		}
	}

}

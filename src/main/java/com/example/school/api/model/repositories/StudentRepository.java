package com.example.school.api.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.school.api.model.entities.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}

package com.greatlearning.smsapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.smsapp.entity.Student;


public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

}
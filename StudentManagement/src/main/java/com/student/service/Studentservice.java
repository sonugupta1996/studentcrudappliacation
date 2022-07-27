package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface Studentservice {
	
	 String upsert(Student student);
	 List<Student> getAll();
	 Student getById(int sid); 
	 String delete(int sid);

}

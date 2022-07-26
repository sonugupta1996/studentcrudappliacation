package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface studentservice {
	
	 String upsert(Student student);
	 List<Student> getAllstudent();
	 Student getStudent(int sid); 
	 String deletestudent(int sid);

}

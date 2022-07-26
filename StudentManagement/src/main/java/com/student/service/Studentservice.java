package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface Studentservice {
	
	 String upsert(Student student);
	 List<Student> getAllstudent();
	 Student getStudent(int sid); 
	 String deletestudent(int sid);

}

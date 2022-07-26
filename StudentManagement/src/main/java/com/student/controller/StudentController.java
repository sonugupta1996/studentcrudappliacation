package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.studentservice;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private studentservice studentservice;
	
	@PostMapping("/createstudent")
	public ResponseEntity<String> createStudent(@RequestBody Student student){
		
		String status = studentservice.upsert(student);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}

	@GetMapping("/allstudents")
	public ResponseEntity<List<Student>> getallstudent(){
		List<Student> list = studentservice.getAllstudent();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getonestudent/{sid}")
	public ResponseEntity<Student> getOneStudent(@PathVariable int sid){
		
		Student student = studentservice.getStudent(sid);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	@DeleteMapping("/deletestudent/{sid}")
	public ResponseEntity<String> deletestudent(@PathVariable int sid){
		String deletestudent = studentservice.deletestudent(sid);
		return new ResponseEntity<String>(deletestudent, HttpStatus.OK);
	}
	
}

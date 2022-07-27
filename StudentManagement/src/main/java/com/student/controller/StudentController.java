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
import com.student.service.Studentservice;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private Studentservice studentservice;
	
	
	@PostMapping("/")
	public ResponseEntity<String> addstudent(@RequestBody Student student){
		String status = studentservice.upsert(student);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}
	
	

	@GetMapping("/")
	public ResponseEntity<List<Student>> getallstudent(){
		List<Student> list = studentservice.getAll();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/{sid}")
	public ResponseEntity<Student> getOneStudent(@PathVariable int sid){
		
		Student student = studentservice.getById(sid);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	@DeleteMapping("/{sid}")
	public ResponseEntity<String> deletestudent(@PathVariable int sid){
		String deletestudent = studentservice.delete(sid);
		return new ResponseEntity<String>(deletestudent, HttpStatus.OK);
	}
	
}

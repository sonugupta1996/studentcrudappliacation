package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepo;
@Service
public class StudentServiceImpl implements studentservice {

	@Autowired
	private StudentRepo studentrepo;
	
	
	@Override
	public String upsert(Student student) {
		Student save = studentrepo.save(student);
		return "student save successfully ";
	}

	@Override
	public List<Student> getAllstudent() {
		return  studentrepo.findAll();
		
	} 

	@Override
	public Student getStudent(int sid) {
		Optional<Student> findbyId = studentrepo.findById(sid);
		if(findbyId.isPresent())
		{
			return findbyId.get();
		}
		return null;
	}

	@Override
	public String deletestudent(int sid) {
		studentrepo.deleteById(sid);
		return "student is deleted";
	}

}

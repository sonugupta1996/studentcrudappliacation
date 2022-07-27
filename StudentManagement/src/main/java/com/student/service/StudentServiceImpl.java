package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StandardRepo;
import com.student.repository.StudentRepo;
import com.student.repository.SubjectRepo;
@Service
public class StudentServiceImpl implements Studentservice {

	@Autowired
	private StudentRepo studentrepo;
	
	@Autowired
	private SubjectRepo subjecterepo;
	
    private StandardRepo standardrepo;
	
	
	@Override
	public String upsert(Student student) {
		Student save = studentrepo.save(student);
		return "student save successfully ";
	}

	@Override
	public List<Student> getAll(){
		return  studentrepo.findAll();
		
	} 

	@Override
	public Student getById(int sid) {
		Optional<Student> findbyId = studentrepo.findById(sid);
		if(findbyId.isPresent())
		{
			return findbyId.get();
		}
		return null;
	}

	@Override
	public String delete(int sid) {
		studentrepo.deleteById(sid);
		return "student is deleted";
	}

}

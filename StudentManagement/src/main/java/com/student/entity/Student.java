package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student_tab")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String scourse;
	private int sdep;
	private String email;
	

}

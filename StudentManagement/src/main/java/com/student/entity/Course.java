package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "course_tab")
public class Course {

    @Id
	private int cid;
	private String courseName;
	private String courseDisc;
	
}

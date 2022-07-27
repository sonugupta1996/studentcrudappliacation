package com.student.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private int srollNo;
	private String sname;
	
	private int sage;
	private int sdept;
	private String email;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Standard standard;
	
	@OneToMany(targetEntity = Subject.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "sc_fk",referencedColumnName ="sid" )
	private List<Subject> subject;

}

package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "standard")
public class Standard {
    
	@Id
	private int id;
	private String name;
	private String disc;
	
}

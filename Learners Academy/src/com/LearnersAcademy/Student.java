package com.LearnersAcademy;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student{
	@Id @GeneratedValue
	@Column(name="ID")
	private long ID;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="class_ID")
	private long classID;
//	@ManyToOne
//	private StudentClass studentClass;
	
	public Student() {}

	public Student(String name, long classID) {
		
		this.name = name;
		this.classID=classID;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public long getClassID() {
		return classID;
	}

	public void setClassID(long classID) {
		this.classID = classID;
	}
	
	

}

package com.LearnersAcademy;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="class")
public class StudentClass {
	
	@Id @GeneratedValue
	@Column(name="ID")
	private long ID;
	
	@Column(name="class_name")
	private String name;
	
	
	@OneToMany
	@JoinColumn(name="class_ID", referencedColumnName="ID")
	private List<Student> student;
	
	@OneToMany
	@JoinColumn(name="class_ID", referencedColumnName="ID")
	private List<Subjects> subjects;
	
	
	

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}


	public List<Subjects> getSubjects() {
		return subjects;
	}


	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	



	

}

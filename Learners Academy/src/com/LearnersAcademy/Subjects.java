package com.LearnersAcademy;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="Subjects")
public class Subjects {
	
	@Id@GeneratedValue
	@Column(name="ID")
	private long ID;
	
	@Column(name="subjects")
	private String subjects;
	
	@Column(name="class_ID")
	private long classID;
	
	@ManyToOne
	@JoinColumn(name="teacher_ID", referencedColumnName="ID")
	private Teachers teachers;
	
	public Subjects() {}
	
	
	
	public Subjects(String subjects, long classID) {
		super();
		this.subjects = subjects;
		this.classID = classID;
		
	}



	public long getID() {
		return ID;
	}



	public void setID(long iD) {
		ID = iD;
	}



	public String getSubjects() {
		return subjects;
	}



	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}



	public long getClassID() {
		return classID;
	}



	public void setClassID(long classID) {
		this.classID = classID;
	}







	public Teachers getTeachers() {
		return teachers;
	}



	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}



	@Override
	public String toString() {
		return "Subjects [ID=" + ID + ", subjects=" + subjects + ", classID=" + classID + ", teachers=" + teachers
				+ "]";
	}







	

}

package com.LearnersAcademy;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teachers {
	@Id@GeneratedValue
	@Column(name="ID")
	private long ID;
	
	@Column(name="teacher_name")
	private String teachers;
	
	@Column(name="designation")
	private String designation;
	
	@OneToMany
	private List<Subjects> subjects;
	
	public Teachers() {}
	
	
	


	public Teachers(String teachers, String designation) {
		super();
		this.teachers = teachers;
		this.designation = designation;
	}





	public long getID() {
		return ID;
	}


	public void setID(long iD) {
		ID = iD;
	}


	public String getTeachers() {
		return teachers;
	}


	public void setTeachers(String teachers) {
		this.teachers = teachers;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}





	@Override
	public String toString() {
		return  teachers ;
	}





	





	
	
	


	

}

package com.saloni.Autowireannotation;

import org.springframework.context.annotation.Scope;

@Scope ("prototype")
public class Course {
	
	private Long id;
	private String Student;

	public String getStudent() {
		return Student;
	}

	public void setStudent(String Student) {
		this.Student = Student;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Student=" + Student + "]";
	}

	
	

}

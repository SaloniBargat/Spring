package com.saloni.Autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String name;
	@Autowired
	@Qualifier("Student1")
	private Student Student;

	public Student getStudent() {
		return Student;
	}

	public void setStudent(Student Student) {
		this.Student = Student;
	}

	public Student(Student Student) {
		super();
		this.Student = Student;
	}

	
	public Student(String name, Student Student) {
		super();
		this.name = name;
		this.Student = Student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", Student=" + Student + "]";
	}

}

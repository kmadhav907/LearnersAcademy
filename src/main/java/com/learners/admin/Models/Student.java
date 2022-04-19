package com.learners.admin.Models;

public class Student {
	private String firstName;
	private String lastName;
	private int studentId;
	private int assosciatedClass;
	private int age;
	public Student(String firstName, String lastName, int studentId, int assosciatedClass, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.assosciatedClass = assosciatedClass;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAssosciatedClass() {
		return assosciatedClass;
	}
	public void setAssosciatedClass(int assosciatedClass) {
		this.assosciatedClass = assosciatedClass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

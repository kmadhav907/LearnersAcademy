package com.learners.admin.Models;

public class Class {
	private int classId;
	private String teacher;
	private String subject;
	private String time;
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Class(int classId, String teacher, String subject, String time) {
		super();
		this.classId = classId;
		this.teacher = teacher;
		this.subject = subject;
		this.time = time;
	}
	
}	

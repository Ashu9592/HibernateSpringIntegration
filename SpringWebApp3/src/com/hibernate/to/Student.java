package com.hibernate.to;

import java.util.Date;

public class Student 

{
	private int sid;
	private String sname;
	private int age;
	private int marks;
	private String grade;
	private java.util.Date dob;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public java.util.Date getDob() {
		return dob;
	}
	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, int age, int marks, String grade, Date dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.marks = marks;
		this.grade = grade;
		this.dob = dob;
	}
	
}

package com.hibernate.dao;

import java.util.List;

import com.hibernate.to.Student;

public interface StudentDAO 

{
	public static final String  selectAllCommand=
			"SELECT s from com.hibernate.to.Student AS s";
	
	public static final String fewColumns="SELECT s.sname, s.sid,s.age from com.hibernate.to.Student AS s";
  
	public void addRecord(Student Student);
    public void deleteRecord(Student student);
    public void updateRecord(Student student); 
    
    public List<Student> getAllStudentRecords();
    
    public List<Object[]> getfewDetails();
    
}

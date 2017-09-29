package com.hibernate.service;

import java.util.List;

import com.hibernate.to.Student;

public interface StudentService 
{
	 	public void addRecord(Student Student);
	    public void deleteRecord(Student student);
	    public void updateRecord(Student student); 
	    
		public List<Student> getAllStudentRecords();
		
		public List<Object[]> getFewDetails();
}

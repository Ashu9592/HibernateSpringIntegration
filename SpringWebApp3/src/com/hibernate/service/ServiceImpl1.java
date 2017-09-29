package com.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hibernate.dao.StudentDAO;
import com.hibernate.to.Student;

//@Service("ser")

public class ServiceImpl1 implements StudentService
{
	//@Autowired
  StudentDAO studentDao;  
  
  



  public StudentDAO getStudentDao() {
	return studentDao;
}

public void setStudentDao(StudentDAO studentDao) {
	this.studentDao = studentDao;
}

@Override
	public void updateRecord (Student student) {
	 studentDao.updateRecord(student);
		
	}
	
	@Override
	public void deleteRecord(Student student) {
		studentDao.deleteRecord(student);
		
	}
	
	@Override
	public void addRecord(Student Student) {
		studentDao.addRecord(Student);
		
	}

	@Override
	public List<Student> getAllStudentRecords() {
		 return studentDao.getAllStudentRecords();
		
	}

	@Override
	public List<Object[]> getFewDetails() {
		
		return studentDao.getfewDetails();
	}

	
	}



	
   


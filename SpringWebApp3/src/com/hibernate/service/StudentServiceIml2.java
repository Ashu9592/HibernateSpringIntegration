package com.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.StudentDAO;
import com.hibernate.dao.StudentDAOImpl2;
import com.hibernate.to.Student;


@Service
@Transactional 
public class StudentServiceIml2 implements StudentService 
{
	
	@Autowired
 private StudentDAO studentDao; 
 
	@Override
	public void addRecord(Student Student) {
		studentDao.addRecord(Student);
		
	}

	@Override
	public void deleteRecord(Student student) {
		studentDao.deleteRecord(student);
		
	}

	@Override
	public void updateRecord(Student student) {
		studentDao.updateRecord(student);
		
	}

	@Override
	public List<Student> getAllStudentRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getFewDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}

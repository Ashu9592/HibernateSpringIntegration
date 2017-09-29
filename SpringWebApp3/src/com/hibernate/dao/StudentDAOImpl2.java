package com.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.hibernate.to.Student;

@Repository

public class StudentDAOImpl2 implements StudentDAO
{
	@Autowired 	
	private HibernateTemplate hibernateTemplate;

	@Override
	public void addRecord(Student Student) {
	 hibernateTemplate.save(Student);
		
	}

	@Override
	public void deleteRecord(Student student) {

		hibernateTemplate.delete(student);
		
	}

	@Override
	public void updateRecord(Student student) {
		hibernateTemplate.update(student);
		
	}

	@Override
	public List<Student> getAllStudentRecords() {
	    
		return null;
	}

	@Override
	public List<Object[]> getfewDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.spring.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.service.StudentService;
import com.hibernate.service.StudentServiceIml2;
import com.hibernate.to.Student;

@Controller
public class StudentController 
{ @Autowired
  private StudentService studentService; 
  
@RequestMapping(value="/add", method=RequestMethod.GET)


public String showStudentform(Model m)
{
	Student s= new Student();
	m.addAttribute("student", s);
	
	return "add";	
}
  

@RequestMapping(value="/add", method=RequestMethod.POST)
	
  public String saveRecord(Student student)
  {
	studentService.addRecord(student);
	  return "added";
  }
 
@InitBinder
   public void initBinder(WebDataBinder dataBinder)
   {
	   SimpleDateFormat sdf= new SimpleDateFormat("dd-MMM-yy");
     
	   CustomDateEditor cde= new CustomDateEditor(sdf, false);
	   
	   dataBinder.registerCustomEditor(Date.class, cde); 
	   
    
   }














}

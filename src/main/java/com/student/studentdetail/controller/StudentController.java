package com.student.studentdetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentdetail.model.Student;
import com.student.studentdetail.service.StudentService;

@RestController
public class StudentController {

	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  
	
	@Autowired  
	StudentService studentService; 
	
	@GetMapping("/student")  
	private List<Student> getAllStudent()   
	{  
	return studentService.getAllStudent();  
	}  
	
	@GetMapping("/student/{id}")  
	private Student getStudent(@PathVariable("id") Integer id)   
	{  
	return studentService.getStudentById(id);  
	}  
	
	@DeleteMapping("/student/{id}")  
	private void deleteStudent(@PathVariable("id") Integer id)   
	{  
	studentService.delete(id);  
	}  
	
	@PostMapping(value = "/student",consumes = "application/json")
	private int saveStudent(@RequestBody Student student)   
	{  
	studentService.saveOrUpdate(student);  
	return student.getId();  
	}  
}

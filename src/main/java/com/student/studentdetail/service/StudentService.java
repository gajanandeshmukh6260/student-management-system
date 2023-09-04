package com.student.studentdetail.service;

import java.util.List;

import com.student.studentdetail.model.Student;

public interface StudentService {

	public List<Student> getAllStudent();

	public Student getStudentById(Integer id);

	public void saveOrUpdate(Student student);

	public void delete(Integer id);

}

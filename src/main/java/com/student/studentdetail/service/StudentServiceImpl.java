package com.student.studentdetail.service;

import java.util.List;

import com.student.studentdetail.dao.StudentRepository;
import com.student.studentdetail.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

	
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Student getStudentById(Integer id) {
		return studentRepository.getById(id) ;
	}

	@Override
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}


	@Override
	public void delete(Integer id) {
		studentRepository.deleteById(id);
		
	}
	
}

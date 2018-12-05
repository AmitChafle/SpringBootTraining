package com.zensar.boot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zensar.boot.entity.Student;
import com.zensar.boot.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	

	
	public Iterable<Student> getAllStudents() {
			return studentRepository.findAll();
	}
	
	
	public Optional<Student> getStudent(int studentId) {
		
		return studentRepository.findById(studentId);
	}
	
	
	public Student addStudent( Student student) {
		
		return studentRepository.save(student);
	}
	
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id")int studentId) {
		studentRepository.deleteById(studentId);
		
	}

}

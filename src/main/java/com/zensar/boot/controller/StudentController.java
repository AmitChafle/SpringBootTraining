package com.zensar.boot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.boot.entity.Student;
import com.zensar.boot.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("/students")
	public Iterable<Student> getAllStudents() {
			return studentService.getAllStudents();
	}
	
	@RequestMapping("/students/{id}")
	public Optional<Student> getStudent(@PathVariable("id")int studentId) {
		return studentService.getStudent(studentId);
	}
	
	@RequestMapping(value="/students",method=RequestMethod.POST)
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id")int studentId) {
		studentService.deleteStudent(studentId);
	}

}

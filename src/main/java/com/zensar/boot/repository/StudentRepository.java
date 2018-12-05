package com.zensar.boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zensar.boot.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

	/*private static List<Student> students = new ArrayList<>();

	static {
		students.add(new Student(1, "Rohit", 32));
		students.add(new Student(2, "Rahul", 31));
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudent(int studentId) {

		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") int studentId) {

		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentId() == studentId) {
				students.remove(i);
			}
		}

	}
*/
}

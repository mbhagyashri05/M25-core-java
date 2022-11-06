package org.tns.service;

import java.util.List;

import org.tns.entities.Student;

public interface StudentService {
	
	//abstract method
	public boolean AddStudent(Student student);
	public boolean DeleteStudent(int nextInt);
	public Student updateStudent(Student student);
	public Student GetStudent(int rollno);
	public List<Student>GetStudents();
	

}

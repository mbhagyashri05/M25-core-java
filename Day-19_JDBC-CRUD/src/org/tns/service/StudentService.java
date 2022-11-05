package org.tns.service;

import java.util.List;

import org.tns.entities.Student;

public interface StudentService {
	
	//ABSTRACT METHOD
	public boolean AddStudent(Student s);
	public boolean DeleteStudent(int ROLL_NO);
	public Student updateStudent(Student s);
	public Student GetStudent(int ROLL_NO);
	public List<Student>GetStudents();
	

}

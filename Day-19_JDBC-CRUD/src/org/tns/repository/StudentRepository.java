package org.tns.repository;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.tns.entities.Student;

public interface StudentRepository {
	
	//abstract method
	
	public abstract int create(String query, Student s); //creation
	public abstract int update(String query, Student s); //updation
	public abstract int delete(String query, Student s); //deletion
	public abstract ResultSet retrieve(String query); 
	Statement createstatement();
	PreparedStatement createPrepareStatement(String query);

}

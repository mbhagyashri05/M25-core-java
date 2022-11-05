package org.tns.repository;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.tns.dao.StudentDAO;
import org.tns.entities.Student;

public class StudentRepositoryImpl implements StudentRepository{
	
	StudentDAO dao;
	
	public StudentRepositoryImpl() {
		dao=new StudentDAO();
	}

	@Override
	public int create(String query, Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String query, Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String query, Student s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet retrieve(String query) {
		Statement s=createstatement ();
		ResultSet rs;
		try {
			rs=s.executeQuery(query);
		}
		catch(SQLException e) 
		{
			rs=null;
			System.out.println("Exception occured in the statement");
		}
		
		return s;
	}

	@Override
	public Statement createstatement() {
		Connection c=dao.createConnection();
		Statement s;
		try {
		s=c.createStatement();
		}
		catch(SQLException e) {
			s=null;
			System.out.println("Exception occured in statement");
		}
		return s;
	}

	@Override
	public PreparedStatement createPrepareStatement(String query) {
		
		Connection c=dao.createConnection();
		PreparedStatement s;
	
		try {
		s=c.prepareStatement(query);
		}
		catch(SQLException e) {
			s=null;
			System.out.println("Exception occured in statement");
		}
		return s;
		
	}

}

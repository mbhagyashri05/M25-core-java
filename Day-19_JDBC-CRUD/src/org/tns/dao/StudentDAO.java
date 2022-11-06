package org.tns.dao;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO 
{
	public Connection createConnection() 
	{
		String url="jdbc:mysql://localhost:3306/m25";
		String username="root";
		String password="root";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println("Exception occured"+e);
		}
		Connection c;
		try {
		c=DriverManager.getConnection(url, username ,password);
		}
		catch(SQLException e) 
		{
			c=null;
			System.out.println("Invalid credentials");
		}
		return c;
	}
}

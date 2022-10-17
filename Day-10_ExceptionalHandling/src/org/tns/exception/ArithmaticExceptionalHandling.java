package org.tns.exception;

import java.util.Scanner;

public class ArithmaticExceptionalHandling {

	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		//try block contains exception
		try 
		{
			int result=a/b;
			System.out.print("The result is: "+result);
		}
		//catch block is use to handle exception
		catch(Exception e) 
		
		{
			System.out.println(e);
			System.out.println("Arithmatic exception handled using catch block");
		}
		//whether any exception occurs or not finally block is always executed
		finally 
		{
			System.out.println("Finally block is always executed");
		}
		//outside try and catch block
		System.out.println("Exception Handling");
		s.close();
		

	}

}

package org.tns.exception;

public class FinallyBlockIsNotExecuted {
	
	

	public static void main(String[] args) 
	{
		//it is static because its is outside the main function public static void print()
		try {
		int x=12;
		int y=5;

		System.out.println("Inside try block- "+x/y);
		//no any further statement will execute

		System.exit(0);}

		catch (Exception e) {

		System.out.println("Catch block");
		}
		finally {

		System.out.println("finally block");
		}
		//when finally block cunnaion exceptional code it won't be executed Finally

		//System.out.println("finally block"),

		//System.out.printin(res1);
		

	}

}

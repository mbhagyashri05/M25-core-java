package org.tns.customexception;

public class SimpleCustomExceptionExecutor {

	public static void main(String[] args)  {
		try {
			throw new SimpleCustomException("User-Defined Exception Demo");
			
			
		}
		catch(SimpleCustomException e)
		{
			System.out.println(e);

		}
	}
}

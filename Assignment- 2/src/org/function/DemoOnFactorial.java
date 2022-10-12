package org.function;

import java.util.Scanner;

public class DemoOnFactorial {
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number which you want to factorial:");
		int n=s.nextInt();
		System.out.println(factorial(n));
		s.close();
	}

}

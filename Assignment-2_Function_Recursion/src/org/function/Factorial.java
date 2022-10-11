package org.function;

import java.util.Scanner;

public class Factorial 
{
	//fun definition
	static int factorial(int n)
	{
		int fact=3;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter noumber which you want to factorial:");
		int n=s.nextInt();
		System.out.println(factorial(n));//fun call
		s.close();
	}

}

package org.recursion;

import java.util.Scanner;

public class DemoOnRecursion {
	//fun definition
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter noumber which you want to factorial:");
		int n=s.nextInt();
		System.out.println(factorial(n));//fun call
		s.close();
	}

}

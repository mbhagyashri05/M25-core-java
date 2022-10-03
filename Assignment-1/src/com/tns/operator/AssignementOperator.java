package com.tns.operator;

import java.util.Scanner;

public class AssignementOperator {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		a/=b;//a/b
		System.out.println(a);
		s.close();

	}

}

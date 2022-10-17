package org.tns.interfaceexample;

import java.util.Scanner;

public class ShapeArea implements Area{
	
	public void circle() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r=s.nextDouble();
		System.out.println("The area of circle is: "+3.142*r*r);
	}
	 
	public void square() 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of square");
		double side=s.nextDouble();
		System.out.println("The area of square is: "+side*side);
		
	}
}

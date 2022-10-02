package org.tns.defaultconstructor;

import java.util.Scanner;
class Bike
{
	//variable
	public int speed;
	//default constructor
	
	Bike()
	{
		System.out.println("The speed is: "+speed+"km/hr");
	}
	
}

public class DefaultDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed=s.nextInt();
		Bike b=new Bike();
		

	}

}

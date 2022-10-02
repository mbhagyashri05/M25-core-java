package org.tns.parameterized;

import java.util.Scanner;

class Bus
{
	//variable
	public int speed;
	
	//parameterized constructor
	Bus(int s)
	{
		speed=s;
		System.out.println("The speed is: "+speed+"km/hr");
	}
	//Default Constructor
	public Bus() {
		System.out.println("Default Constructor");
	}
}
public class Demo {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed=s.nextInt();
		Bus b=new Bus();
		Bus b1=new Bus(speed);
		s.close();
		// TODO Auto-generated method stub

	}

}

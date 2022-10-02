package org.tns.parameterized;
import java.util.Scanner;
//demo on parameterized constructor
class Bike
{
	//variable
	public int speed;
	
	//parameterized constructor
	Bike(int speed)
	{
		this.speed=speed;
		System.out.println("The speed is: "+speed+"km/hr");
	}
	
	
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of speed: ");
		int speed=s.nextInt();
		Bike b=new Bike(speed);
		s.close();
		// TODO Auto-generated method stub

	}

}

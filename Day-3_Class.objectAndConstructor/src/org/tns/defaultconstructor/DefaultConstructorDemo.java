package org.tns.defaultconstructor;
//class definition
class Car
{
	private int speed;
	void display()
	{
		System.out.println("The speed is: "+speed+"km/hr");
		 
	}
	//default constructor
	
	Car()
	{
		speed=50;
	}
	
}

public class DefaultConstructorDemo {

	public static void main(String[] args) {
		//object creation
		Car obj=new Car();
		//calling the method of car class
		obj.display();

	}

}

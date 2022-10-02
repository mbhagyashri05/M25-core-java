package org.tns.abstraction;
class C
{
	//default variable
	String VehicleType;
}


public class DemoOnDefault 
{

	public static void main(String[] args) 
	{
		C c=new C();
		c.VehicleType="Train";
		System.out.println("Vehicle Type is: "+c.VehicleType);
	}

}

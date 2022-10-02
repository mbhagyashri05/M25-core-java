package org.tns.abstraction;
//demo on public access specifier
class B
{
	//if any data members is public the visibility is in any class
	public String dob="05-05-1999";
	public void display() 
	{
	   System.out.println("The DOB IS: "+dob);	
	}
}

public class DemoOnPublic {

	public static void main(String[] args) 
	{
		B b=new B();
		b.display();

	}

}

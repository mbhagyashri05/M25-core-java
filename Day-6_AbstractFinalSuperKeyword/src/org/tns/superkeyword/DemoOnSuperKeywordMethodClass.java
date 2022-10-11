package org.tns.superkeyword;
//super class
class Parent
{
	public void print() 
	{
		System.out.println("Welcome");
	}
}
//child class
class Child extends Parent
{
	//method overriding
	public void print() 
	{
		System.out.println("Congragulation on Selection");
	}
	public void display() 
	{
		print();
		//calling the parent class method
		super.print();
	}
}
public class DemoOnSuperKeywordMethodClass 
{

	public static void main(String[] args) 
	{
		Child c =new Child();
		c.display();
	}

}

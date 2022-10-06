package org.tns.inheritance;
//parent class
class Vehicle
{
	protected String name="Car";
	public void display() 
	{
		System.out.println(name);
	}
}
//Child Class For Vehicle
class BMW extends Vehicle
{
	protected String name1="BMW";
	public void display1() 
	{
		System.out.println(name1);
	}
}
//Child class for BMW
class Tyre extends BMW
{
	protected String tyrename="BridgeStone";
	public void display2() 
	{
		System.out.println(tyrename);
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();

	}

}

package org.tns.enumdemo;

public class PizzaEnumDemo implements InterfacePizzaDemo{
	SMALL, MEDIUM, LARGE ,EXTRALARGE;

	@Override
	public void print() 
	{
		System.out.println("Selected size in the pizzas are : "+this);
		
		
	}
}


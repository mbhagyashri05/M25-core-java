package org.tns.instanceofdemo;

class E
{
	E()
	{
		this(5);
		System.out.println("Default Constructor");
	}


E(int i)
{
	System.out.println("Parameterized Constructor");
}
}

public class DemoOnInvokeConstructor {

	public static void main(String[] args) {
	   E e= new E();

	}

}

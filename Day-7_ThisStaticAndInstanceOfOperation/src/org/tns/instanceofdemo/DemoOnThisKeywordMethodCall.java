package org.tns.instanceofdemo;

class D
{
	public void display(D d) 
	{
		System.out.println("Display function invoked");
	}

public void print() 
{
	display(this);
}
}


public class DemoOnThisKeywordMethodCall {

	public static void main(String[] args) 
	{
		D d=new D();
		d.print();

	}

}

package org.tns.abstractkeyword;

abstract class A
{
	//ABSTRCT METHOD
	abstract void print();
}
class B extends A
{
	@Override
	void print() {
		int balance=50000;
		System.out.println("Account balance is: "+balance);
	}
	
	}

public class ATMMachine {

	public static void main(String[] args) 
	{
		//we cannot create the object for abstract class
		//*A a=new A();*/
		
		A a=new B();
		a.print();

	}

}

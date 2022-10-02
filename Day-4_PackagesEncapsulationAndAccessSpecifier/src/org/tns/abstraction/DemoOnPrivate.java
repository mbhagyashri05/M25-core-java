package org.tns.abstraction;
//demo on private access specifier

class A
{
	//private variable
	
	private float salary;
//setters and getters to access private data members into another class
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

public class DemoOnPrivate {

	public static void main(String[] args) 
	{
		A a=new A();
		a.setSalary(75000);
		System.out.println("The salary is: "+a.getSalary());
		// TODO Auto-generated method stub

	}

}

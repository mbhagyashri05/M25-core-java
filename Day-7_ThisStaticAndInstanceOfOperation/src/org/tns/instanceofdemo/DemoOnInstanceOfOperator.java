package org.tns.instanceofdemo;

class B
{
	public String name;
	public int id;
	public void accept(String name, int id) 
	{
		this.name=name;
		this.id=id;
	}
	//user defined method
	public void print() 
	{
		System.out.println("The name is: "+name);
		System.out.println("The ID is: "+id);
	}
}
public class DemoOnInstanceOfOperator {

	public static void main(String[] args) {
		B b=new B();
		b.accept("Komal", 25);
		b.print();
		

	}

}



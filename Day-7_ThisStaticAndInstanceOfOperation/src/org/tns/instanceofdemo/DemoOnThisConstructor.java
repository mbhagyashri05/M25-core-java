package org.tns.instanceofdemo;

class C
{
	public String name;
	public int id;
	public C(String string, int i) {
		// TODO Auto-generated constructor stub
	}
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


public class DemoOnThisConstructor {

	public static void main(String[] args) 
	{
		
		C c = new C("Komal",25);
		c.print();

	}

}

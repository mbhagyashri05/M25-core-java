package org.tns.inheritance;
//parent class
class AndroidVersion
{
	protected String name="Android latest version";
	public void display() 
	{
		System.out.println(name);
	}
}
//child class1
class Tiramisu extends AndroidVersion
{
	public String v13="Tiramisu";
	//method overriding
	public void display() 
	{
		System.out.println(v13);
	} 
}
//child class 2
class SnowCone extends AndroidVersion
{
	public String v12="SnowCone";
	public void display() 
	{
		System.out.println(v12);
	} 
}


public class HierachicalInheritance {

	public static void main(String[] args) 
	{
		Tiramisu t=new Tiramisu();
		t.display();
		SnowCone s=new SnowCone();
		s.display();
		

	}

}

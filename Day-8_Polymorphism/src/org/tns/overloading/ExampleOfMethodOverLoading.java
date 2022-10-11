package org.tns.overloading;

class Shape
{
	//method overloading
	//zero-argument
	public void area()
	{
		System.out.println("Find area:");
	}
	//one-argument
	public void area(int r)
	{
		System.out.println("Area of Circle:"+(3.14*r*r));
	}
	//two-argument
	public void area(int l,int b)
	{
		System.out.println("Area of Rectangle:"+(l*b));
	}
	
	
}
/*for method overloading child class is not required*/
public class ExampleOfMethodOverLoading 
{

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		s.area(2);
		s.area(10, 15);

	}

}


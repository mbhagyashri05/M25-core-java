package org.tns.statickeyword;

public class DemoOnStaticBlock 
{
	static int a=10;
	static int b;
	static 
	{
		b=a+50;
	}
	

	public static void main(String[] args) {
		System.out.println("value of a: "+a);
		System.out.println("value of a: "+b);
		

	}

}

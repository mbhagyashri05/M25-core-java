package com.tns.controlstructure;

public class Example3 {

	public static void main(String[] args) 
	{
		int age=15,weight=60;
		if(age>=12) 
		{
			if(weight>=50) 
			{
				if(weight<=110) 
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else 
				{
					System.out.println("Extra ropes will be added");
				}
				
			}
			else 
			{
				System.out.println("Not eligible for bunjee jumping");
			}
		}
		else 
		{
			System.out.println("Not eligible for bunjee jumping");
		}
	}

}

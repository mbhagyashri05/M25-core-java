package org.tns.enumdemo;

public class EnumMealDemo {

	public static void main(String[] args) {
		
		for(Meal m:Meal.values()) 
		{
			System.out.println(m);
		}
	}

}

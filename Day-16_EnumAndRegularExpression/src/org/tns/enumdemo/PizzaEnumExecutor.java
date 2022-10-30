package org.tns.enumdemo;

import java.util.Scanner;

public class PizzaEnumExecutor<Size> {
	
	Scanner s=new Scanner(System.in);
	System.out.println()
	String size=s.nextLine();
	Size s1=Size.valueOf(Size.toUpperCase());
	switch(s1) 
	{
	case SMALL;
		System.out.println("Preparing small pizza for the customer:");
		break;
	case MEDIUM;
	System.out.println("Preparing medium pizza for the customer:");
	break;
	case LARGE;
	System.out.println("Preparing large pizza for the customer:");
	break;
	case EXTRALARGE;
	System.out.println("Preparing extralarge pizza for the customer:");
	break;
		
	}
}
}

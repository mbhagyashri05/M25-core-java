package org.tns.packageexample;

import java.util.Scanner;

//importing the package
import org.tns.packagedemo.PackageDemo;
//import org.tns.packagedemo.PackageDemo
public class PackageClient {

	public static void main(String[] args) 
	{
		/*we are accessing the method of PackageDemo class
		import the package of the specified class*/
		//object creation
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=s.nextLine();
		
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		s.close();
		// TODO Auto-generated method stub

	}

}

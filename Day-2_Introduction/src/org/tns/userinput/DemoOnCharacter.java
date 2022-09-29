package org.tns.userinput;

import java.util.Scanner;

public class DemoOnCharacter {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		char x=s.next().charAt(3);
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();
		// TODO Auto-generated method stub

	}

}

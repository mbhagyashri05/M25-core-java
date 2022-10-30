package org.tns.annotations;

import java.util.Scanner;

public class SuppressWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(x);

	}

}

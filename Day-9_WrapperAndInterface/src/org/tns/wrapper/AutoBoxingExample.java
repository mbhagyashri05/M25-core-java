package org.tns.wrapper;

public class AutoBoxingExample {

	public static void main(String[] args) {
		
		char ch='z';
		//Auto Boxing
		Character c=ch;
		Character c1=new Character('x');
		System.out.println(ch+" "+c+" "+c1);

	}

}

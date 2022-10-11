package org.tns.superkeyword;

//super class
class Person {
	// super class constructor
	Person() {
		System.out.println("Parent class constructor");
	}
}

class Student extends Person {
	Student() {
		super();
		System.out.println("Child class constructor");
	}
}

public class DemoOnSuperKeywordClassConstructor {

	public static void main(String[] args) {
		Student s = new Student();
	}
}

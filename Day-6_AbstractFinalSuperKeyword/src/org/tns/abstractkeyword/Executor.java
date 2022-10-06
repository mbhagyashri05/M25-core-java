package org.tns.abstractkeyword;

public class Executor {

	public static void main(String[] args) {
		Person p=new Employee("John","Male",1021);
		Person p1=new Employee("Jen","Male",0);
		p.work();
		p1.work();
		p.changeName("Jolly");
		System.out.println(p.toString());
		

	}

}

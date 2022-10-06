package org.tns.abstractkeyword;

public abstract class Person {
	private String Name;
	private String Gender;
	//PARAMETRIZED CONSTRUCTOR
	public Person(String name, String gender) {
		super();
		this.Name = name;
		this.Gender = gender;
	}
	public abstract void work();
	//toString method
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Gender=" + Gender + "]";
	}
	
	//user-defined method for change the name
	public void changeName(String newName)
	{
		Name=newName;
	}
	
	
	

}

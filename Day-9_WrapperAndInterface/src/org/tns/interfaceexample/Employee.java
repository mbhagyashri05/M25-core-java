package org.tns.interfaceexample;

public class Employee implements HR,Manager
{
	public void projectDiscussion() 
	{
		System.out.println("About the project discussion");
	}
	
	public void salarydiscussion() 
	{
		System.out.println("About the salary discussion");	
		}

	@Override
	public void projectdiscussion() {
		// TODO Auto-generated method stub
		
	}
}


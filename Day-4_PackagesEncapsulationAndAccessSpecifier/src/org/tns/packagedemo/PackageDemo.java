package org.tns.packagedemo;

public class PackageDemo 
{
	public String str;
	/*if any variable is declared as default then that method or variable 
	 * you cannot access into another package
	 */
	/*if you want to access the variable and method,we have to make them as public*/
    public void display()
	{
		System.out.println("The name of the string is: "+str);
	}
	
}

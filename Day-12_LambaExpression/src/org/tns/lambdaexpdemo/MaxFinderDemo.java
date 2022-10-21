package org.tns.lambdaexpdemo;

public interface MaxFinderDemo {
	void max(int a,int b);

}
class MaxFinderChildDemo implements MaxFinderDemo
{

	@Override
	public void max(int a, int b) 
	{
		
		int result=(a>b)?a:b;
		System.out.println("The maximum number is: "+result);
		
	}
	
}

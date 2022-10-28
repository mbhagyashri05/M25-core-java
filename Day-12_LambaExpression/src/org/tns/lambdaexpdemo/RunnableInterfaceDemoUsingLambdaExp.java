package org.tns.lambdaexpdemo;

public class RunnableInterfaceDemoUsingLambdaExp {

	public static void main(String[] args) {
		
		Runnable obj=()->
		{
			System.out.println("Implementing runnbale interface");
		};
		Thread t=new Thread(obj);
		t.start();
		// TODO Auto-generated method stub

	}

}

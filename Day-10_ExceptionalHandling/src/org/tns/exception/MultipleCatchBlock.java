package org.tns.exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try 
		{
			int a=args.length;
			System.out.println("the length of a is: "+a);
			int b=12/a;
			int arr[]= {11,22,33};
			System.out.println(arr[3]);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Arithmatic exception occured"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException occured"+e);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}

}

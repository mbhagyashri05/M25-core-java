package com.tns.operator;

public class LogicalOperator {

	public static void main(String[] args) 
	{
		int a=9,b=7;
		boolean res=(a<b && b<8);// true only if both expression1 and 2 are true
		boolean res1=(a>b || b>8);// true when either expression 1 or expression 2 is true
		boolean res2=(!(a<b));// true if expression is false and vice versa
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);

	}

}

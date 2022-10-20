package org.tns.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack<Integer>s=new Stack<>();
		s.push(1);
		s.push(5);
		s.push(8);
		System.out.println(s);
		//pop deletion
		s.pop();
		s.remove(0);
		System.out.println(s);

	}

}

package org.tns.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) 
	{
	Set<Integer>obj= new HashSet<>();
	obj.add(45);
	obj.add(86);
	obj.add(62);
	System.out.println(obj);
	
	obj.forEach(System.out::println);

	}

}

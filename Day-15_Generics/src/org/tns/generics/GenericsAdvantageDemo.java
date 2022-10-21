package org.tns.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		List<Integer> obj=new LinkedList<>();
		obj.add(12);
		System.out.println(obj);
		
		List <Integer>obj2=new ArrayList<>();
		obj.add(15);
		
		Integer d=obj2.get(0);
		System.out.println(obj2);

	}

}

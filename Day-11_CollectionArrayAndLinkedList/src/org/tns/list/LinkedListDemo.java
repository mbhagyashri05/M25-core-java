package org.tns.list;


import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		{
			LinkedList<Object> list=new LinkedList<>();
			list.add('m');
			list.add("Bhagyashri");
			list.add(89.99);
			System.out.println("The elements are: "+list);
			System.out.println(list.size());
			System.out.println(list.contains("Bhagyashri"));
			}

	}

}

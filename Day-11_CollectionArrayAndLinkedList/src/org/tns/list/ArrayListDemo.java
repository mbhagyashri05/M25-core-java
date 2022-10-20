package org.tns.list;

import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class ArrayListDemo {
	

	public static void main(String[] args) {
	ArrayList<Object> list=new ArrayList<>();
	list.add(11);
	list.add("Bhagyashri");
	list.add(89.99f);
	System.out.println("The elements are: "+list);
	System.out.println(list.size());
	}

}

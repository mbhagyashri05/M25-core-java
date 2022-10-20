package org.tns.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Collection obj=new ArrayList<>();
		obj.add("Komal");
		obj.add('x');
		obj.add(87.90f);
		System.out.println("The elements in collections are: "+obj );

	}

}

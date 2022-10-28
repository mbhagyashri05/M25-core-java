package org.tns.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Ron","Komal","Tuff","Almond");
		obj.forEach((i)->System.out.println(i+" "));
		
		System.out.println();
		
		
		List<Integer>obj1=Arrays.asList(new Integer[] {56,97,34,81});
	}

}

package org.tns.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[]{"Ron","Komal","Tuff","Almond"});
		obj.stream().filter((i->i.length()>4)).forEach((i)->System.out.print(i+" "));

	}

}

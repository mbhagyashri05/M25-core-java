package org.tns.lambdaexpdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemoUsingLambdaExp {

	public static void main(String[] args) {
		
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(), s2.length());
		String str[]= {"Komal","Tommy","Piyush","Jack"};
		//arrange into the ascending order
		Collections.sort(Arrays.asList(str),obj);
		//enhanced for loop 
		for(String itr:str)
		{
			System.out.println(itr+" ");
		}
	

	}

}

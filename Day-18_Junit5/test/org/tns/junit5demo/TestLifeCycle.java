package org.tns.junit5demo;

import org.junit.Test;

public class TestLifeCycle implements LifeCycleMethodDemo{
	
	@Test
	void fun()
	{
		System.out.println("First test case");
	}
}


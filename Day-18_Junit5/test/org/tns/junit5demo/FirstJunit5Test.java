package org.tns.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJunit5Test 
{

	@Test
	void test() 
	{
		System.out.println("hello");
	}
	@Test 
	@Disabled
	void display()
	{
		fail("hi");
	}
}

package org.tns.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void display()
	{
		System.setProperty("Bhagyashri", "Mar");

		Assumptions.assumeTrue("Mar".equals(System.getProperty("Bhagyashri")));
	}
	@Test
	void display1()
	{
		System.setProperty("Bhagyashri", "Mar");

		Assumptions.assumeFalse("Marat".equals(System.getProperty("Bhagyashri")));
	}

}

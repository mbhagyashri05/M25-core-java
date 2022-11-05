package org.tns.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LifeCycleMethodDemo {

	@Test
	void test() {
		System.out.println("M-25 batch");
	}
	@Test
	@BeforeAll
	void print() {
		System.out.println("It executes Before all the testcases");
	}
	@Test
	@AfterAll
	void accept() {
		System.out.println("It executes After each testcases");
	}

}

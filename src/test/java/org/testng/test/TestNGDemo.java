package org.testng.test;

import org.testng.annotations.Test;

public class TestNGDemo {

	
	@Test
	private void test1() {
		System.out.println("Test1");
	}

	@Test(priority=2)
	private void test3() {
		System.out.println("Test3");
	}
	@Test(enabled=false)
	private void test2() {
		System.out.println("Test2");
	}
	@Test
	private void test5() {
		System.out.println("Test5");
	}
	@Test(invocationCount=4,priority=3)
	private void test4() {
		System.out.println("Test4");
	}
	
}

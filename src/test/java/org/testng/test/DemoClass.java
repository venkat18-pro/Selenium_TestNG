package org.testng.test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoClass {

	@Test
	private void test1() {
		System.out.println("Test1");
	}
	int i=0;
	@Test
	private void test2() {
		if(i<2) {
			i++;
		Assert.assertTrue(false);
		}
		System.out.println("Pass..");
	}
	
	@Test
	private void test3() {
		Assert.assertTrue(false);
	}
	
}

package org.testng.test;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups="Reg")
	private void test1() {
		System.out.println("Reg");
	}
	
	@Test(groups="Sanity")
	private void test2() {
		System.out.println("Sanity");
	}
	
	@Test(groups="E2E")
	private void test3() {
		System.out.println("E2E");
	}
	
}

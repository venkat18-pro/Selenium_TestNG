package org.testng.test;

import org.testng.annotations.Test;

public class Group1 {

	@Test(groups="Reg")
	private void test1() {
		System.out.println("Reg");
	}
	
	@Test(groups= {"Sanity","Reg"})
	private void test2() {
		System.out.println("Sanity Reg");
	}
	
	@Test(groups="E2E")
	private void test3() {
		System.out.println("E2E");
	}
}

package org.testng.test;

import org.testng.annotations.Test;

public class ParallelClass1 {

	@Test
	private void test1() {
		System.out.println("M1 "+Thread.currentThread().getId());
	}
	
	@Test
	private void test2() {
		System.out.println("M2 "+Thread.currentThread().getId());
	}
	
	@Test
	private void test3() {
		System.out.println("M3 "+Thread.currentThread().getId());
	}
	
}

package org.testng.test;

import org.testng.annotations.Test;

public class ParallelClass2 {

	@Test
	private void test11() {
		System.out.println("M11 "+Thread.currentThread().getId());
	}
	
	@Test
	private void test12() {
		System.out.println("M12 "+Thread.currentThread().getId());
	}
	
	@Test
	private void test13() {
		System.out.println("M13 "+Thread.currentThread().getId());
	}
	
}

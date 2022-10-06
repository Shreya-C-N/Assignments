package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CachedFactorialTest {

	@Test
	public void test() {
		CachedFactorial cf=new CachedFactorial();
		assertEquals(720,cf.factorial(6));
		assertEquals(720,cf.factorial(6));
		
	}

}

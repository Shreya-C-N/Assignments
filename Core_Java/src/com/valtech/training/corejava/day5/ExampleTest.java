package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		Example e=new Example();
		assertEquals(720,e.factorial(6));
	
		
	}

}

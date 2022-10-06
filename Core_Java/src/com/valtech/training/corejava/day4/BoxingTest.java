package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxingTest {

	@Test
	public void test() {
	Integer i=new Integer(5);//Boxing Primitive->Object
	Integer j=5;
	int k=j.intValue();//Unboxing Object->Primitive
	int l=j;
	}

}

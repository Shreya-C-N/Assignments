package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSorterTest {
	
	@Test
	public void testLength() {
		String[]names= {"a","bb","bbb","zz","y"};
		Arrays.sort(names,new CustomStringSorter());
		assertArrayEquals(new String[] {"a","y","bb","zz","bbb"},names);
	}

	@Test
	public void testVowelCount() {
		String []names={"a","bb","bbb","zz","y"};
		Arrays.sort(names,new CustomStringSorter());
		assertArrayEquals(new String[] {"a","y","bb","zz","bbb"},names);
}
	@Test
public void testAll() {
	String[]names= {"a","cc","bb","aa","bbb","ee","zz","y"};
	Arrays.sort(names,new CustomStringSorter());
	assertArrayEquals(new String[] {"a","y","aa","ee","bb","cc","zz","bbb"},names);
}
}

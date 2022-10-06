package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class ListTest {
	@Test
	public void testStack() {
		Stack<String>animals=new Stack<>();
		
		animals.push("Dog");
		animals.push("Cat");
		animals.push("Cow");
		assertEquals(3,animals.size());
		System.out.println(animals.pop());
		System.out.println(animals.pop());

		assertEquals(1, animals.size());
		
	}
	@Test
	public void testQueue() {
		Queue<String>animal=new LinkedList<>();
		
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Cow");
		assertEquals(3,animal.size());
		System.out.println(animal.remove());
		System.out.println(animal.remove());
		System.out.println(animal.remove());
	
		assertEquals(0, animal.size());
		
	}

	@Test
	public void test() {
		//List<String>names=new ArrayList<>();
		List<String>names=new LinkedList<>();
		
		names.add("Hello1");
		names.add("Hello2");
		names.add("Hello3");
		names.add(0,"Hello4");
		names.add("Hi");
		assertEquals(5,names.size());
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
		
package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


import com.valtech.training.corejava.day1.Point;



public class ReflectTest {

	@Test
	
	    public void test() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	        Point p = Point.class.newInstance();
	        System.out.println(p);
	        Method m = Point.class.getMethod("setX", int.class);
	        m.invoke(p, 10);
	        System.out.println(p);
	    }


	}



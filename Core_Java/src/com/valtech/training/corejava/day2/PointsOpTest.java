package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import com.valtech.training.corejava.day1.Point3D;

public class PointsOpTest {

	@Test

		  public void testPoint3DCtor() {
		        Point3D p=new Point3D();
		        assertEquals(0, p.getX());
		        assertEquals(0, p.getY());
		        assertEquals(0, p.getZ());
		        
		        Point3D p1=new Point3D();
		        assertEquals(0, p1.getX());
		        assertEquals(0, p1.getY());
		        assertEquals(0, p1.getZ());
		        
		    }
		    
		    
		    @Test
		    public void testSetGet() {
		        Point3D p=new Point3D();
		        p.setX(10);
		        assertEquals(10, p.getX());
		        p.setY(20);
		        assertEquals(20, p.getY());
		        p.setZ(30);
		        assertEquals(30, p.getZ());
		    }
		    
		    @Test
		    public void testDistance() {
		        Point3D p=new Point3D();
		        assertEquals(0.0, p.distance(),0.00000001);
		        p=new Point3D(10, 20,30);
		        assertEquals(Math.sqrt(10*10+20*20+30*30), p.distance(),0.0000001);
		    }
		   
		    @Test
		    public void testEquals() {
		        Point3D p=new Point3D(2,3,5);
		        Point3D p1=new Point3D(2,3,5);
		        Point3D p2=p;
		        assertTrue(p == p2);
		        assertFalse(p == p1);
		        assertTrue(p.equals(p1));
		        assertEquals(p.hashCode(), p1.hashCode());
		    }
		
	}


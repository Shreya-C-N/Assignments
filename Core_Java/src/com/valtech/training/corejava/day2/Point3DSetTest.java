package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import com.valtech.training.corejava.day1.Point3D;

public class Point3DSetTest {

	@Test
	public void test() {
		Set<Point3D> points3d=new HashSet<>();
        points3d.add(new Point3D(2,3,4));
        assertEquals(1, points3d.size());
        points3d.add(new Point3D(2,3,5));
        assertEquals(2, points3d.size());
        }



   public void testTreeSetfor3D() {
        Set<Point3D> points3d=new TreeSet<>();
        points3d.add(new Point3D(2,3,6));
        assertEquals(1, points3d.size());
        points3d.add(new Point3D(2,3,6));
        assertEquals(1, points3d.size());
        points3d.add(new Point3D(2,5,8));
        assertEquals(2, points3d.size());
        points3d.add(new Point3D(3,2,5));
        assertEquals(3, points3d.size());
    }
}
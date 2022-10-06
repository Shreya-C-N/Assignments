package com.valtech.training.corejava.day1;

import java.io.Serializable;

public class Point implements Comparable<Point>,Serializable{
	public static final Point ORIGIN =new Point(0,0);
	protected int x;
	protected int y;
	public Point() {
		
	}
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int compareTo(Point o) {
		if(distance() < o.distance()) {
			return -1;
			
		}
		if(distance() == o.distance()) {
			if(x<o.x) {
				return -1;
			}
			if (x>o.x) return +1;
			
			return 0;
			
		}
		
		return +1;
	}
	@Override
	public boolean equals(Object obj) {
	// TODO Auto-generated method stub
		if(obj instanceof Point) {
		Point p=(Point)obj;
		return p.x == x && p.y == y;
	}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return ("X=+ "+x+"Y="+y).hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer("X =").append(x).append("Y = ").append(y).toString();
	}
	public  double distance() {
		return Math.sqrt(x*x+y*y);
	}
	
	public double distance(int x,int y) {
		int dx=this.x-x;
		int dy=this.y-y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public double distance(Point p) {
		return this.distance(p.x,p.y);
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

public static void main(String[] args) {
Point p=new Point(2,3);
System.out.println("X = "+p.getX()+" Y =  "+p.getY());
System.out.println(p.distance());
System.out.println(p.distance(10,20));
System.out.println(p.distance(new Point(12,13)));
}
	
}


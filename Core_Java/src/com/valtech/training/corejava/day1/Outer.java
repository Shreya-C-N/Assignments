package com.valtech.training.corejava.day1;

public class Outer {
	private static class Inner extends Outer {
private void print() {
	System.out.println("Hello");
}
	}
public void printDetails(Inner i) {
	i.print();
}
	public static void main(String[] args) {
		Inner i=new Inner();
		i.print();
	}
}
//static inner class
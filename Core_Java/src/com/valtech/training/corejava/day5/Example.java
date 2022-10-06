package com.valtech.training.corejava.day5;

public class Example {
	
	public long factorial(long n) {
		if(n==1) {
			return 1;
		}
		else 
			return n*factorial(n-1);
	}
	
public static void main(String[] args) {
	Example e=new Example();
	long result=e.factorial(5);
	System.out.println(result);
	}}

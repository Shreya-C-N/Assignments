package com.valtech.training.corejava.day3;

public class GCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=Integer.parseInt(args[0]);
long x=System.nanoTime();
for (int i = 0; i < n; i++) {
	//StringBuffer sb=new StringBuffer();

	String s=" "+i+" "+i+" "+i;

}
long y=System.nanoTime();
long time=(y-x)/1000000000;
System.out.println("Time taken= "+time+"secs");

	}

}

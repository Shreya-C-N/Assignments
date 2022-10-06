package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class NumberSorter implements Comparator<Integer>{
	
	private boolean isOdd(int a) {
		return Math.abs(a)%2==1;
	}
	@Override
	public int compare(Integer i1,Integer i2) {
		boolean b1=isOdd(i1);
		boolean b2=isOdd(i2);
		//check both the numbers are odd put in ascending order
		if(b1&&b2) {
			if(i1<i2)return-1;
			if(i1==i2)return 0;
			else return +1;
			
//			return i1-i2;
		}
		//check both the numbers are even put in descending order
		if(!b1 && !b2) {
			return i2-i1;
		}
	
		if(b1) {
			return -1;
		}
		return+1;
		//otherwise one is odd and other is even
		//if first is odd and smaller return -1
		//second value is odd and smaller return +1
		
//		return i1.compareTo(i2);
		}

}

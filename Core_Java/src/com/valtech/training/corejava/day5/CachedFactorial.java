package com.valtech.training.corejava.day5;

import java.util.ArrayList;
import java.util.List;

public class CachedFactorial {
	List<Long> cache = new ArrayList<>();

	public long factorial(int n) {
		if (cache.size() > n) {
			System.out.println("Returning from cache...");//odd numbers in ascending and even number in descending 
			return cache.get(n - 1);
		}
		if(n==1) {
			cache.add(1L);
			return 1;
		}
		long fact=factorial(n-1);
		long factn=n*fact;
		cache.add(factn);
		return factn;
	
	}
	
}
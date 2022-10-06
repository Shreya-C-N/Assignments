package com.valtech.training.corejava.day3;

public class Rot13Utility {

	public static char rotate(char c) {
		// TODO Auto-generated method stub
		if((c>='a')&& (c<='m')) {
			return (char)(c+13);
		}
//		else if((c>='A')&& (c<='M')) {
//			return (char)(c+13);
//		}
//		else if((c>='m')&& (c<='a')) {
//			return (char)(c-13);
//		}
		return (char)(c-13);
	}



}

package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class CustomStringSorter implements Comparator<String> {
	
	
	private int sLen(String str) {
		return str.length();
	}
	
	 boolean isVowel(char ch)
    {
		
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' ||
                           ch=='O' || ch=='U');
    }
    
     int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) 
                ++count;
        return count;
    }
    

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int sl1=sLen(s1);
		int sl2=sLen(s2);
		if(sl1>sl2) {
			return 1;
			
		}
		else if(sl1==sl2) {
			int cv1=countVowels(s1);
			int cv2=countVowels(s2);
			if(cv1 > cv2) {
				return -1;
			}
			else if(cv1 == cv2) {
				//return 0;
				return s1.compareTo(s2);
				
			}
			else return 1;
			
		}
		else {
			
			return -1;
		}
	}
	

}

package com.valtech.Assignments;

public class PasswordChecker{

	boolean isSpecialChar(char c)
    {
        
        return (c=='$' || c=='@' || c=='#' ||
                           c=='-' || c=='_');
    }
	
	boolean lowerCase(String str) {
	     for (int i = 0; i < str.length(); i++) {
	            if (Character.isLowerCase(str.charAt(i))) {
	                return true;
	            }
	        }
	     return false;
	 }
	boolean upperCase(String str) {
	     for (int i = 0; i < str.length(); i++) {
	            if (Character.isUpperCase(str.charAt(i))) {
	                return true;
	            }
	        }
	     return false;
	 }
	boolean isNumber(char ch) {
	     return (ch=='1' || ch=='2' || ch=='3' ||
	             ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' ||
	                     ch=='9' || ch=='0');
	 }
	
	 int count(String str) {
	     int count = 0,set=0;
	        for (int i = 0; i < str.length(); i++) {
	            if (isNumber(str.charAt(i))) {
	                if(set==0) {
	                    count=5;
	                    set=1;
	                }
	                else count++;
	            }
	        }
	                
	        return count;
	     
	 }
	 int countt(String str)
	 {
	     int count = 0,set=0;
	     for (int i = 0; i < str.length(); i++) {
	         if (isSpecialChar(str.charAt(i))) {
	             if(set==0) {
	                 count=5;
	                 set=1;
	             }
	             else count=count+2;
	         }
	     }
	             
	     return count;
	 }
 
	public int check(String str) {
//		if(password.length<=8) 
//			return 0;
//		total=password.length;
//		 for(int i=0; i<total; i++)
//         {
//			 value=0;
//			 digit=0;
//      
//            ch = password.charAt(i);
//            if(Character.isUpperCase(ch))
//               value=5;
//            else if(Character.isLowerCase(ch))
//               value = value+5;
//            else if(Character.isDigit(ch))
//            {
//               digit = digit+1;
//            }
//           
//            else if(Character.isSpecial(ch)){
//            	special=special+2;
//            }
//         }
//		 value=value+digit+special+4+2;
//		 if(value>25)
//         return 1;
//		 return 0;
		 int strength=0;
		    if (str.length()<8) {
		        return 0;
		    }
		    if(lowerCase(str)) {
		        strength=strength+5;
		    }
		    if(upperCase(str)) {
		        strength=strength+5;
		    }
		    int st=countt(str);
		    int nt=count(str);
		    
		    strength=strength+st+nt;
		    
		    return strength;
	}
}

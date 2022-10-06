package com.valtech.Assignments;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.valtech.Assignments.PasswordChecker;

public class PasswordCheckerTest {
	@Test
	public void test() {
        String s="Abc@5379";
        PasswordChecker pc=new PasswordChecker();
        assertEquals(23, pc.check(s));
                
        }
	
	@Test
	public void testLowerCase() {
        String s="Abc@5379";
        PasswordChecker pc=new PasswordChecker();
        assertEquals(true, pc.lowerCase(s));
                
        }
	
//@Test
//public void testUpperCase() {
//    String s="Abc@5379";
//    PasswordChecker pc=new PasswordChecker();
//    assertEquals(true, pc.upperCase(s));
//            
//    }

@Test
public void testUpperCase() {
    String s="abc@5379";
    PasswordChecker pc=new PasswordChecker();
    assertEquals(false, pc.upperCase(s));
            
    }


@Test
public void testNumber() {
    String s="Abc@5379";
    PasswordChecker pc=new PasswordChecker();
    assertEquals(8, pc.count(s));
            
    }

@Test
public void testcountSpecial() {
    String s="Abc@5#79";
    PasswordChecker pc=new PasswordChecker();
    assertEquals(7, pc.countt(s));
            
    }

@Test
public void testIsNumber() {
    char c='5';
    PasswordChecker pc=new PasswordChecker();
    assertEquals(true, pc.isNumber(c));
            
    }

@Test
public void testIsSpecial() {
	char c='#';
	PasswordChecker pc=new PasswordChecker();
	assertEquals(true,pc.isSpecialChar(c));
}
}
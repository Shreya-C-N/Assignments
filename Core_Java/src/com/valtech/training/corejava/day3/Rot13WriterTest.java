package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

public class Rot13WriterTest {


	@Test
	public void test() throws Exception{
	Writer strwriter=new Rot13Writer(new StringWriter());
	String msg="helloworld";
	strwriter.write(msg);
	String res=strwriter.toString();
	System.out.println("After rotation "+res);
	strwriter.close();
	Reader reader=new Rot13Reader(new StringReader(res));
	char[] buffer = new char[1024];
	int i= reader.read(buffer);
	System.out.println("Read "+i +"bytes");
	System.out.println("After Rotating again...."+new String(buffer,0,i));
	
	assertEquals(msg,new String(buffer,0,i));
	reader.close();
	
	}
}

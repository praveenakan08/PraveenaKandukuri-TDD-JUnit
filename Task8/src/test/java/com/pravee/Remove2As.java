package com.pravee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class Remove2As 
{
	
	RemoveFirst2As removeFirst2As;
	
	@BeforeEach
	void setUp()
	{
		removeFirst2As=new RemoveFirst2As();
	}
	
	@Test
	void testEmptyChar() 
	{
		assertEquals("",removeFirst2As.remove(""));
	}
	
	@Test
	void test1Char() 
	{
		assertEquals("",removeFirst2As.remove("A"));
	}
	
	@Test
	void test4Char() 
	{
		assertEquals("BCD",removeFirst2As.remove("ABCD"));
		assertEquals("BCD",removeFirst2As.remove("BACD"));
		assertEquals("BBAA",removeFirst2As.remove("BBAA"));
		assertEquals("CD",removeFirst2As.remove("AACD"));
	}
	
	@Test
	void testNChars() 
	{
		assertEquals("BAA",removeFirst2As.remove("AABAA"));
	}

}

package com.mycompany.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class junitTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		String output = test.removeA("ABCD");
		assertEquals("BCD",output);
		output = test.removeA("AACD");
		assertEquals("CD",output);
		output = test.removeA("BACD");
		assertEquals("BCD",output);
		output = test.removeA("BBAA");
		assertEquals("BBAA",output);
		output = test.removeA("AABAA");
		assertEquals("BAA",output);
		
	}

}

package com.iutblagnac.r303trace;

import junit.framework.TestCase;

public class HelloWparamsTest extends TestCase {
	public void testHelloWithString() {
		assertEquals("test", HelloWparams.hello("test"));
		assertEquals("", HelloWparams.hello(""));
		assertEquals("Bonjour", HelloWparams.hello("Bonjour"));
	}
}

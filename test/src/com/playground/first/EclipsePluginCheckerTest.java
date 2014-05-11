package com.playground.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class EclipsePluginCheckerTest {

	@Test
	public void testAddInt() {
		assertEquals(5, new EclipsePluginChecker().addInt(2, 3));
	}

}

package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {
	@Test
	public void testConstructorAndGetters() throws Exception {
		Match match = new Match("A", "B");
		assertEquals("A", match.getHome());
		assertEquals("B", match.getGuest());
	}
}

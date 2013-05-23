package org.amicofragile.cninja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatchTest {
	private static final String GUEST = "B";
	private static final String HOME = "A";

	@Test
	public void testConstructorAndGetters() throws Exception {
		Match match = new Match(HOME, GUEST);
		assertEquals(HOME, match.getHome());
		assertEquals(GUEST, match.getGuest());
	}
}
